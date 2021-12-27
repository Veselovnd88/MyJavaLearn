package myjavalearning;
import java.util.Scanner;


class Mytask2712{
	
	public static void enough() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String s = scanner.nextLine();
			if (s.equals("enough")) {
				break;
			}
			else {
				System.out.println(s);
			}
		}scanner.close();
}
	public static void listOvnumbers() {
		int i =0;
		int sum = 0;
		while (i<100) {
			i++;
			if(i%3==0) {
				continue;
			}
			sum+=i;
		} System.out.println(sum);
	}
}
public class Javarush2712 {

	public static void main(String[] args) {
	Mytask2712.listOvnumbers();}


}
