package myjavalearning;

class courseraCalendar{
	public static void showme() {
		System.out.println("Start of output for challenge exercise");
		String[] days = new String[] {"Sun", "Mon","Tue","Wed","Thu","Fri","Sat"};
		for(String day:days) {//print first row with days
			System.out.print(day+" ");
		}
		System.out.println();
		
		int alldays = 31;
		int start = 1;
		int interval = 3;
		int endline = 29;// 25
		int current = (start-1)*(interval+1);
		
		System.out.print(" ".repeat(current));//current 16
		int ad = 0;
		current++;//current 17
		for (int i =1; i<=alldays; i++) {
			if(current%endline==0) {
				System.out.println();
				current=1;
			}if (i/10<=0) {
				ad = 0;
			} else { 
				ad = -1;
			}
			System.out.print(Integer.toString(i)+" ".repeat(interval+ad));
			current=current+interval+1;
			
		}
				
		
		
	}
	
}

public class CourseraLearningQuest {

	
public static void main(String[] args) {
	courseraCalendar.showme();
	
	
	
	
	
}
		/*int[] daysInMonth = new int[12];
		String[] monthNames = new String[] {"January", "February", "March", "April","May",
				"June", "July","August","September","October","November","December"};
	
		daysInMonth[0]=31;
		daysInMonth[1]=28;
		daysInMonth[2]=31;
		daysInMonth[3]=30;
		daysInMonth[4]=31;
		daysInMonth[5]=30;
		daysInMonth[6]=31;
		daysInMonth[7]=31;
		daysInMonth[8]=30;
		daysInMonth[9]=31;
		daysInMonth[10]=30;
		daysInMonth[11]=31;
		
		int month = 1;
		while (month<13) {
			switch(month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(monthNames[month-1]+" has "+" 31 days");
				//System.out.println("These months have 31 days");
				break;

			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(monthNames[month-1]+" has "+" 30 days");
			//	System.out.println("These mmonth have 30 days");
				break;
			case 2:
				System.out.println(monthNames[month-1]+" has "+" 28 days");
			}
				
			
			
			
			month++;
		}

	}
*/
}
