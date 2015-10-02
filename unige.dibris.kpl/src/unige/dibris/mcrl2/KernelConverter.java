package unige.dibris.mcrl2;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import unige.dibris.htype.*;
import unige.dibris.kPL.Kernel;

public class KernelConverter {
	
	static int counter;
	static Map<String,String> rec;
	
	public static String convert(Kernel k, List<Effect> lH, int loc) {
		
		counter = 0;
		rec = new TreeMap<String,String>();
		
		// Actions
		String mcrl2 = "act\n";
		for(int l = 0; l < loc; l++) {
			mcrl2 += " wr" + l + ", rd" + l + ",";
		}
		mcrl2 += " b, t;\nproc\n";
		
		// Processes
		for(int i = 0; i < lH.size(); i++) {
			Effect H = lH.get(i);
			mcrl2 += " H"+i+ " = " + convert(H) + ";\n";
		}
		
		for(String X : rec.keySet()) {
			mcrl2 += " " +X+ " = " + rec.get(X) + ";\n";
		}
		
		// Initialization
		
		String parH = "";
		String parb = "";
		
		for(int i = 0; i < lH.size(); i++) {
			parH += "H"+i + " || ";
			parb += "b|";
		}
		
		parH = parH.substring(0, parH.length() - 4);
		parb = parb.substring(0, parb.length() - 1);
		
		mcrl2 += "init\n"
				+ " block({b},\n"
				+ "  comm({" + parb + " -> t},\n"
				+ "   " + parH + "\n"
				+ "  )\n"
				+ " );";
		
		return mcrl2;
	}
	
	private static String convert(Effect H) {
		if(H instanceof HEmpty)
			return "delta";
		else if(H instanceof HBar)
			return "t";
		else if(H instanceof HRead)
			return "rd" + ((HRead)H).loc;
		else if(H instanceof HWrite)
			return "wr" + ((HWrite)H).loc;
		else if(H instanceof HChoice)
			return convert(((HChoice)H).left) + " + " + convert(((HChoice)H).right);
		else if(H instanceof HSeq)
			return convert(((HSeq)H).H1) + " . " + convert(((HSeq)H).H2);
		else if(H instanceof HRec) {
			String X = "X"+counter;
			counter++;
			
			rec.put(X, "(" + convert(((HRec)H).H) + " . "+X+") + delta");
			
			return X;
		}
		else
			// TODO unsupported exception
			return null;
	}

}
