package Abstract.define;

public class Triangle extends Diagram{

	public Triangle(int len, int bth) {
		super(len, bth);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		System.out.println("Inside area of triangle");
		return 0.5*len*bth;
	}
	
	
	
	
	

}
