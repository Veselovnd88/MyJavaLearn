package myjavalearning;
import java.util.Scanner;

public class Javarush24 {

	public static void reverse() {
		/*
Тебе нужно написать программу, которая: 1. Считывает с консоли целое число N. 
2. Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N. 
3. Вывести в консоль считанные числа, если N нечетное - в порядке ввода, иначе — в обратном порядке. 
Каждое число выводить с новой строки. Число N выводить не нужно.*/	
	Scanner scanner = new Scanner(System.in);
	int[]resultarr;
		int ops = scanner.nextInt();
		if (ops>0) {
		resultarr = new int[ops];
		for (int i = 0; i<ops;i++) {
			if (ops%2==0) {
				resultarr[ops-i-1] = scanner.nextInt();
		}
			else {
				resultarr[i] = scanner.nextInt();
			}
		}
		scanner.close();
		for (int ch:resultarr) {
			System.out.println(ch);
		}

	} 
	
		
	}
	public static void minimum() {
		//Чтобы выполнить эту задачу, тебе нужно: 1. Ввести с клавиатуры число N. 
		//2. Считать N целых чисел и заполнить ими массив. 
		//3. Найти минимальное число среди элементов массива и вывести в консоль.
		Scanner scanner = new Scanner(System.in);
		int ops = scanner.nextInt();
		int[] myarr = new int[ops];
		for (int i=0; i<ops;i++) {
			myarr[i] = scanner.nextInt();
			
		}scanner.close();
		int min = myarr[0];
		for (int num:myarr) {
			if (num<=min) {
				min = num;
			}
		} System.out.println(min);
		
		
		
	}
	public static void maximum() {
		//В этой задаче тебе нужно: 
		//1. Ввести с клавиатуры число N. 2. Считать N целых чисел и заполнить ими массив array.
		//3. Найти максимальное число среди элементов массива.
		Scanner scanner = new Scanner(System.in);
		int ops = scanner.nextInt();
		int[] myarr = new int[ops];
		for (int i=0; i<ops;i++) {
			myarr[i] = scanner.nextInt();
			
		}scanner.close();
		int max = myarr[0];
		for (int num:myarr) {
			if (num>=max) {
				max = num;
			}
		} System.out.println(max);
		
		
		
	}
	
	
	public static void main(String[] args) {
		//  2 уровень,  4 лекция
		//reverse();
		maximum();
	}

}
