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
	public static void minimumscanner() {
		//28.12
		Scanner scanner = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		while(scanner.hasNextInt()) {

			int num = scanner.nextInt();
			if (num<=min) {
				min = num;
			}
			
		}System.out.println(min);
		scanner.close();
	}
	public static void secminimum() {
		Scanner scanner = new Scanner(System.in);
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		while(scanner.hasNextInt()) {
			int num = scanner.nextInt();
			if (num<min1) {//min1=5, 
				min2 = min1;
				min1 = num;
			}
			if(num<min2 && num!=min1) {
				min2 = num;}
			
		} System.out.println(min2);
		scanner.close();
	}
}
public class Javarush2712 {

	public static void main(String[] args) {
	Mytask2712.secminimum();}


}
