package PlayingWClasses;

public class DriverCatnDogs {
	public static void fightingCat(Cat first, Cat second) {
		if (first.fight(second)) {
			System.out.printf("%s was defeated by %s%n", second.getName(),first.getName());
		}
		else{System.out.printf("%s was defeated by %s%n", first.getName(),second.getName()); }
	}

	public static void main(String[] args) {
		// TODO создать 3 экзсемпляра Cat
		// TODO провести 3 боя
		Cat fatCat = new Cat("Fatty",13,20,10);
		Cat superCat = new Cat("Trayny", 5,10, 25 );
		Cat youngCat = new Cat("Kitty", 1,3,10);
		fightingCat(fatCat,superCat);
		fightingCat(fatCat,youngCat);
		fightingCat(youngCat,superCat);
	}

}
