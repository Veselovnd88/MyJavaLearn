package myjavalearning;


public class PlayingWithStrings {

	public static void main(String[] args) {
//		String s = "My Test";
//		StringBuffer sb = new StringBuffer();
//		sb.append(s);
//		sb.append(" ");
//		sb.append(s);
//		System.out.println(sb.toString());
		MusicalInstrument guitar = new MusicalInstrument("Guitar", 0, 0, null, 0, 0, 0);
		System.out.println(guitar);
		System.out.println(MusicalInstrument.Stat.counter);
		
	}

}
