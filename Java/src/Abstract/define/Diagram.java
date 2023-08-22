package Abstract.define;

public abstract class Diagram {
	
	int len;
	int bth;
	public Diagram(int len, int bth) {
		super();
		this.len = len;
		this.bth = bth;
	}
	public abstract double area();

}
