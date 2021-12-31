package myjavalearning;

public class CourseraLearningQuest {

	public static void main(String[] args) {
		int[] daysInMonth = new int[12];
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

}
