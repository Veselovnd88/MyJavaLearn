package myjavalearning;

public class ExerciseShapes {
	public static void main(String[] args) {
		Shape[]s =new Shape[8];
		s[0] = new Rectangle(5,6);
		s[1] = new Rectangle(10,5);
		s[2] = new Square(7);
		s[3] = new Square(10);
		s[4] = new Cube(6.8);
		s[5] = new Cube(3.5);
		s[6] = new Box(3.5,4.5,5.5);
		s[7] = new Circle(5);
		
		TwoDimensional[] arr2 = new TwoDimensional[3];
		arr2[0] = new Circle(5);
		arr2[1] = new Rectangle(4,3);
		arr2[2] = new Square(666);
		
		for (Shape sh:s) {
			System.out.println(sh);
			//System.out.println(sh.getColor());
		}
//		for (TwoDimensional t:arr2) {
//			System.out.println(t.getArea());
//			System.out.println(t.getPerimeter());
//		}
//		for (Shape sh:s) {
//			ThreeDimensional temp = (ThreeDimensional) sh;
//			System.out.println(temp.getVolume());
//			//System.out.println(sh.getColor());
//		}
		
		
		
	}
}
