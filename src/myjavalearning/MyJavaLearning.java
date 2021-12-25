
package myjavalearning;
import org.apache.commons.lang3.StringUtils;


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
}
public class MyJavaLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(App.normalizeUrl("HateifsReality"));//50/62
        System.out.println(App.isPalindrome("AMA"));
        System.out.println(App.getNumberExplanation(0));
        System.out.println(App.getNumberExplanation(42));
        System.out.println(App.getNumberExplanation(666));
    }
    
}
