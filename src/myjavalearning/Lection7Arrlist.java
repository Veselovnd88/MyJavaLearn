package myjavalearning;
import java.util.ArrayList;
import java.util.Scanner;
public class Lection7Arrlist {
	public static void task1() {
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("first");
		mylist.add("second");
		mylist.add("third");
		mylist.add("fourth");
		mylist.add("fifth");
		System.out.println(mylist.size());
		for(String s:mylist) {
			System.out.println(s);
		}
		
		
	}
	public static void task2() {
		ArrayList<String> mylist = new ArrayList<String>();
		mylist.add("firstsdf");
		mylist.add("seco");
		mylist.add("th");
		mylist.add("f");
		mylist.add("24");
		int min = Integer.MAX_VALUE;
		String mins = null;

		for (String s:mylist) {
			if(s.length()<=min) {
				mins = s;
			}
		}
		for(String s:mylist) {
			if(s.length()==mins.length()) {
				System.out.println(s);
			}
		}
		
		
	}
	public static void task4() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ml = new ArrayList<String>();
		for (int i = 0; i<10;i++) {
			ml.add(0,sc.nextLine());
		}
		sc.close();
		for (String s: ml) {
			System.out.println(s);
		}
	}
	public static void task5() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> l = new ArrayList<String>();
		for (int i=0; i<5;i++) {
			l.add(sc.nextLine());
		}
		String last = l.get(l.size()-1);
		l.add(0,last);
		l.remove(l.size()-1);
		for(String s:l) {
			System.out.println(s);
		}
		sc.close();
	}
	public static void main(String[] args) {
		//task1();
		//task2();
		//task4();
		//task5();

	}

}
