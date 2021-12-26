
package myjavalearning;
import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

class App {
    // BEGIN (write your solution here)
    public static boolean isPalindrome(String str){
        return str.equals(StringUtils.reverse(str));
    }
    public static String normalizeUrl(String str){
        if(str.startsWith("https://")){
            return str;
        } else{
            return "https://"+ str;
        }
    }
    public static String getNumberExplanation(int num) {
    	switch (num) {
    	case 666:
    		return "devil number";
    	case 42:
    		return "answer for everything";
    	case 7:
    		return "prime number";
    	default: 
    		return null;
    	}
    }
public static void printNumbers(int num) {
	while (num>0) {
		System.out.println(num);
		num--;
	}
	System.out.println("finished!");
}

public static String encrypt(String str) {
    // BEGIN (write your solution here)
    String result = "";
    if (str.length()%2==0){
    for (int i = 0; i<str.length()-1;i+=2){
        result+=str.charAt(i+1);
        result+=str.charAt(i);
        //System.out.println(result);
    }}
    else {
          for (int i = 0; i<str.length()-2;i+=2){
        result+=str.charAt(i+1);
        result+=str.charAt(i);}
        result+=str.charAt(str.length()-1);  
    }
    return result;
    // END
}
public static void withscanner() {
	Scanner scanner = new Scanner (System.in);
	int sum = 0;
	boolean isExit = false;
	while(!isExit) {
		if (scanner.hasNextInt()) {
			int num = scanner.nextInt();
			sum+=num;
		}
		if (scanner.hasNextLine()) {
			if (scanner.nextLine().equals("ENTER")) {
				isExit = true;
			}
		}
	}
	scanner.close();
	System.out.println(sum);
}
}
public class MyJavaLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println(App.normalizeUrl("HateifsReality"));//50/62
        //System.out.println(App.isPalindrome("AMA"));
        //System.out.println(App.getNumberExplanation(0));
        //System.out.println(App.getNumberExplanation(42));
        //System.out.println(App.getNumberExplanation(666));
    	//App.printNumbers(5);
    	//System.out.println(App.encrypt("attack"));
    	App.withscanner();
    }
    
}
