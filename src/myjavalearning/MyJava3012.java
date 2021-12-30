package myjavalearning;
//import java.util.Scanner;

class Java3012{
	public static void mytriangle(int h, String fill) {
		for (int i = 1; i<=h;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(fill);
				
			}System.out.println();
		}
	}
	
	
	
}
public class MyJava3012 {
	public static void main(String[] args) {
		Java3012.mytriangle(10, "8");

		
		
	}

}
