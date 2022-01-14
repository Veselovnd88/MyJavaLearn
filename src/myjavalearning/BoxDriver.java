package myjavalearning;

public class BoxDriver {

	
	
	public static void main(String[] args) {
		
		Cube cub = new Cube(5.0);
		cub.printBox();
		cub.setHeight(20);
		cub.setSide(40);
		cub.setWidth(-6);
		//System.out.println(cub.getLength());
		cub.printBox();
	}

}
