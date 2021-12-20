/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myjavalearning;
import org.apache.commons.lang3.StringUtils;


class App {
    // BEGIN (write your solution here)
    public static boolean isPalindrome(String str){
        return str.equals(StringUtils.reverse(str));
    }
    // END
}
public class MyJavaLearning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(App.isPalindrome("AMA"));
    }
    
}
