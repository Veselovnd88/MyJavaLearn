package ru.javaoo.store;

public class StoreDriver {

	public static void main(String[] args) {
		ClassicalCD cd = new ClassicalCD();
		cd.addPerformer("hater");
		cd.addPerformer("Pysun");
		cd.addPerformer("evil");
		cd.showPerformers();
	}

}
