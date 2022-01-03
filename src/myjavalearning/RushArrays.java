package myjavalearning;
import java.util.Arrays;
public class RushArrays {
	public static void icreate() {

		int[] myArray = new int[10];
		double[] doubleArray = new double[10];
		
		for (int i=0; i<myArray.length;i++) {
			myArray[i]=i*10;
			doubleArray[i] = (double)i/10;
		}
		for (int j:myArray) {
			System.out.print(j);
		}
		System.out.println();
		for (double k: doubleArray) {
			System.out.println(k);
		}
	}
	public static String fillstring() {
		String[] strings = new String[10];
		for (int i=0; i<strings.length; i++) {
			if (i%2==0) {
				strings[i]="even";
			}
			else {
				strings[i]="odd";
			}
		}
		return strings[2];
	}
	public static int changesign(int[] myarray) {
		for (int i=0; i<myarray.length;i++) {
			if(i%2==0) {
				myarray[i] = myarray[i]*-1;
			}
		}
		return myarray[2];
	}
	public static int[] combinearrays(int[] fhs, int[] shs ){
			int[] resultarr = new int[fhs.length+ shs.length];
			for (int i = 0; i< resultarr.length; i++) {
				if(i<fhs.length) {
					resultarr[i] = fhs[i];
				}
				else {
					resultarr[i] = shs[i - fhs.length];
				}
			}
			
			
			return resultarr;
	}
	
	
	public static void main(String[] args) {
		int[] arrfirst = new int[] {1,2};
		int[] arrsecond = new int[] {6,7,8,9};
	System.out.print(Arrays.toString(combinearrays(arrfirst, arrsecond)));
		}

}
