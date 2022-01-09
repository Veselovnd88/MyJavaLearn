package PlayingWClasses;

public class StringHelper {
/*5. Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку, повторенную count раз.
String multiply(String s) – возвращает строку, повторенную 5 раз.
 * */
	static String multyply(String s, int count) {
		StringBuilder str = new StringBuilder(s);
		for(int i=0; i< count-1;i++) {
			str.append(s);
		}
		return str.toString();
		
	}
	static String multyply(String s) {
		return	multyply(s,5);
	
	}
	
	
}
