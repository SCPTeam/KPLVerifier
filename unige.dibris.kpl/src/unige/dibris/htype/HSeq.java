package unige.dibris.htype;

public class HSeq implements Effect {
	public Effect H1, H2;

	public HSeq(Effect h1, Effect h2) {
		super();
		H1 = h1;
		H2 = h2;
	}

}
