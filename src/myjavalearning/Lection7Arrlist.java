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

	public static void task6() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ml = new ArrayList<Integer>();
		for (int i=0;i<10;i++) {
			ml.add(sc.nextInt());
		}
		ArrayList<Integer> leven = new ArrayList<Integer>();
		ArrayList<Integer> lodd = new ArrayList<Integer>();
		ArrayList<Integer> lother = new ArrayList<Integer>();
		
		for (int c:ml) {
			if(c%2==0) {
				leven.add(c);
			}
			if(c%3==0) {
				lodd.add(c);
			}
			if(c%2!=0 &&c%3!=0) {
				lother.add(c);
			}
		}sc.close();
		printList(leven);
		printList(lodd);
	}
	public static void task7() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ml = new ArrayList<String>();
		for (int i=0;i<5;i++) {
			ml.add(sc.nextLine());	
		}
		ml.remove(2);
		for(int j=ml.size()-1;j>=0;j--) {
			System.out.println(ml.get(j));
		}
		sc.close();
	}
	public static void task8() {
		ArrayList<String> l = new ArrayList<String>();
		l.add("Мама");
		l.add("мыла");
		l.add("раму");
		String ad = "именно";
		for(int i=0;i<l.size();i+=2) {
			l.add(i+1,ad);
		}
		for(String c:l) {
			System.out.print(c+" ");
		}
	}
	public static void printList(ArrayList<Integer> l) {
		for (int i: l) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		//task1();
		//task2();
		//task4();
		//task5();
		//task6();
		//task7();
task8();
	}

}
