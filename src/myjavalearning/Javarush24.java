package myjavalearning;
import java.util.Scanner;
import java.util.Arrays;
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
	public static void deleteequalsstr() {
		//ava Syntax Zero,  2 уровень,  5 лекция
		/*В этой задаче тебе нужно: 1. Считать 6строк и заполнить ими массив strings.
		 *  2. Удалить повторяющиеся строки из массива strings, заменив их на null (null
		 *   должны быть не строками "null"). Примеры. 1. Массив после чтения строк:
		 *    {"Hello", "Hello", "World", "Java", "Tasks", "World"} 2. Массив после уд
		 */
		Scanner scanner = new Scanner(System.in);
		int qnt_ops = 6;
		String[] strings = new String[6];
		for (int i = 0; i<qnt_ops;i++) {
			strings[i] = scanner.nextLine();
		}
		for(int j = 0; j<qnt_ops-1;j++) {
			
				for(int k=j+1;k<qnt_ops;k++) {
					if(strings[k]!=null&&strings[j]!=null) {
					if(strings[j].equals(strings[k])) {
						strings[k]=null;
					}}
				
			}
		}

		
		System.out.print(Arrays.toString(strings));
		scanner.close();
	}
	public static void multiplytable(){
		int[][] mytable = new int[10][10];
		for(int x =0; x<10;x++) {
			for(int y=0;y<10;y++) {
				mytable[x][y] = (x+1)*(y+1);
				System.out.print(mytable[x][y]+" ");
			} System.out.println();
		}
		
	}
	public static void trianglearray() {
		int[][] myarr = new int[10][];
		for (int i=0; i<10;i++) {
			myarr[i]=new int[i+1];
			//System.out.println(myarr[i].length);
		}
		for(int x=0; x<myarr.length; x++) {
			for(int y=0;y<myarr[x].length;y++) {
				myarr[x][y] = x+y;
				System.out.print(myarr[x][y]+" ");
			}
			System.out.println();
		}
		
	}
	public static void twodimsarray() {
		Scanner scanner = new Scanner(System.in);
		int row = scanner.nextInt();
		int[][] myarr = new int[row][];
		for (int i=0; i<row;i++) {
			int val = scanner.nextInt();
			myarr[i] = new int[val];
			for (int j=0; j<val;j++) {
				System.out.print("[]");
			}
		}System.out.println();
		scanner.close();
	}
	public static void multyarr() {
		int[][][] multiArray = new int[][][]{
			{
				{4, 8, 15}, {16}},
			{
					{23, 42}, {}
					},
			{
						{1}, {2}, {3},
						{4, 5}}
			};
			
			//for (int i = 0; i<multiArray.length; i++) {
				//for(int j=0; j<multiArray[i].length;j++) {
					//System.out.print(Arrays.toString(multiArray[i][j]));
					//for(int k=0;k<multiArray[i][j].length;k++) {
					//	System.out.print(multiArray[i][j][k]+" ");
						
					//}System.out.println();
				//}System.out.println();
			//}
					System.out.print(Arrays.deepToString(multiArray));
	}
public static void fillarr() {
	/*Заполняем массив*/
	int[] myarr = new int[11];
    int valueStart = 10;
    int valueEnd = 13;
	if(myarr.length%2==0) {
		Arrays.fill(myarr,0,myarr.length/2,valueStart);
		Arrays.fill(myarr,myarr.length/2,myarr.length,valueEnd);}
		
		else {
			Arrays.fill(myarr,0,myarr.length/2+1,valueStart);
			Arrays.fill(myarr,myarr.length/2+1,myarr.length,valueEnd);
		}
		System.out.print(Arrays.toString(myarr));
	
}
public static void dividearr() {
	/* 
	Делим массив
	*/
	int[][] result = new int[2][];
    int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    if(array.length%2==0) {
    	result[0] = Arrays.copyOfRange(array, 0, array.length/2);
    	result[1] = Arrays.copyOfRange(array, array.length/2,array.length);
    }
    else {
    	result[0] = Arrays.copyOfRange(array, 0, array.length/2+1);
    	result[1] = Arrays.copyOfRange(array, array.length/2+1,array.length);
    	
    }
    System.out.print(Arrays.deepToString(result));
    
	
	
}

public static void main(String[] args) {
		//  2 уровень,  4 лекция
		//reverse();
		//maximum();
		//deleteequalsstr();
		//multiplytable();
		//trianglearray();
		//multyarr();
		//fillarr();
	dividearr();
	}

}
