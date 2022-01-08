package myjavalearning;

public class PlayingWithStrings {

	public static void main(String[] args) {
		String s = "My Test";
		StringBuffer sb = new StringBuffer();
		sb.append(s);
		sb.append(" ");
		sb.append(s);
		System.out.println(sb.toString());

	}

}
