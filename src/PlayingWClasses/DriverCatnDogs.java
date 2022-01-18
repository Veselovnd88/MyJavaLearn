package PlayingWClasses;

public class DriverCatnDogs {
	public static void fightingCat(Cat first, Cat second) {
		if (first.fight(second)) {
			System.out.printf("%s was defeated by %s%n", second.getName(),first.getName());
		}
		else{System.out.printf("%s was defeated by %s%n", first.getName(),second.getName()); }
	}

	public static void main(String[] args) {
		System.out.println(
		Singletone.getInstance("Moon").getName());
		System.out.println(
				Singletone.getInstance("Sun").getName());
		

//		Cat fatCat = new Cat("Fatty",13,"Red",20,10,"Baker Street");
//		Cat superCat = new Cat("Trayny");
//		Cat youngCat = new Cat("Kitty",5,"Black",7);
//		fightingCat(fatCat,superCat);
//		fightingCat(fatCat,youngCat);
//		fightingCat(youngCat,superCat);
//		System.out.printf("%s lives in %s and has %s color%n",fatCat.getName(),fatCat.getAddress(),
//				fatCat.getColor());
//		System.out.printf("%s lives in %s and has %s color%n",superCat.getName(),superCat.getAddress(),
//				superCat.getColor());
//	
//		Dog sharik = new Dog("Sharik",100,"Black");
//		sharik.bark();
//		Dog evil = new Dog("Evil");
//		evil.bark();
//		System.out.println(Cat.getCatCount());
//		//System.out.println(ConsoleReader.stringReader());
//		//System.out.println(StringHelper.multyply("petya"));
//		for(Cat c: Cat.cats) {
//			System.out.println(c.getName());
//		}
//		FamilyCat dedushka = new FamilyCat("Desuhka Vaska", null,null);
//		FamilyCat babusha = new FamilyCat("Babushka Murka", null, null);
//		FamilyCat father = new FamilyCat("Papa Murzik",babusha,null);
//		FamilyCat mother = new FamilyCat("Mama Pupa",null, dedushka );
//		FamilyCat son = new FamilyCat("Small Boy",mother,father);
//		System.out.println(son.getClass());
//		
//		FamilyCat daughter = new FamilyCat("Small girl", mother, father);
//		System.out.println(daughter.getClass());
//		FamilyCat.printCats();
	}

}
