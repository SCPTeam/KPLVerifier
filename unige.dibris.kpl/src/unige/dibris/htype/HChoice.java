package unige.dibris.htype;

public class HChoice implements Effect {
	public Effect left, right;

	public HChoice(Effect left, Effect right) {
		this.left = left;
		this.right = right;
	}
	
	
}
