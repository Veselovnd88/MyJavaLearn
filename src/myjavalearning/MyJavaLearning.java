
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
    // END
}
public class MyJavaLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(App.normalizeUrl("HateisReality"));//50/62
        System.out.println(App.isPalindrome("AMA"));
        System.out.println("MyTest");
    }
    
}
