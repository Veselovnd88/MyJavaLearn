package ru.youtube.lessons.robotless;

public class RobotDriber {

	public static void main(String[] args) {
		Body body = new Body();
		SmallHead smhead = new SmallHead();
		BigHead bhead = new BigHead();
		Robot<SmallHead> r1 = new Robot<SmallHead>(body,smhead);
		r1.getHead().burn();
		Robot<BigHead> r2 = new Robot<BigHead>(body,bhead);
		r2.getHead().turn();
		

	}

}
