package PlayingWClasses;
import java.util.Scanner;
public class ConsoleReader {
	static int intReader() {
		Scanner scanner = new Scanner(System.in);
		int result = scanner.nextInt();
		scanner.close();
		return result;
	}
	static String stringReader() {
		Scanner scanner = new Scanner(System.in); 
			String str = scanner.nextLine();
			scanner.close();
			return str;
		}
	static double doubleReader() {
		Scanner scanner = new Scanner(System.in);
		double result = scanner.nextDouble();
		scanner.close();
		return result;
	}
	static boolean boolReader() {
		Scanner scanner = new Scanner(System.in); 
			boolean result = scanner.nextBoolean();
			scanner.close();
			return result;
		
	}
}

