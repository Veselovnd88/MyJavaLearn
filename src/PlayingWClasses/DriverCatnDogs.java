package PlayingWClasses;

public class DriverCatnDogs {
	public static void fightingCat(Cat first, Cat second) {
		if (first.fight(second)) {
			System.out.printf("%s was defeated by %s%n", second.getName(),first.getName());
		}
		else{System.out.printf("%s was defeated by %s%n", first.getName(),second.getName()); }
	}

	public static void main(String[] args) {
		Cat fatCat = new Cat("Fatty",13,"Red",20,10,"Baker Street");
		Cat superCat = new Cat("Trayny");
		Cat youngCat = new Cat("Kitty",5,"Black",7);
		fightingCat(fatCat,superCat);
		fightingCat(fatCat,youngCat);
		fightingCat(youngCat,superCat);
		System.out.printf("%s lives in %s and has %s color%n",fatCat.getName(),fatCat.getAddress(),
				fatCat.getColor());
		System.out.printf("%s lives in %s and has %s color%n",superCat.getName(),superCat.getAddress(),
				superCat.getColor());
	}

}
