package PlayingWClasses;
import java.util.ArrayList;

public class FamilyCat {
	FamilyCat(String name, FamilyCat mother, FamilyCat father){
		setName(name);
		setMother(mother);
		setFather(father);
		cats.add(this);
	}
	public static void printCats() {
		for(FamilyCat c:cats) {
			String mother;
			String father;
			if(c.getMother()==null) {
				mother = "no mother";
			}
			else {
				mother = "mother " +c.getMother().getName();
			}
			if(c.getFather()==null) {
				father = "no father";
			}
			else {
				father ="father "+ c.getFather().getName();
			}
			System.out.printf("Cat %s has %s and %s%n", c.getName(),mother,
					father);
		}
	}
	
	private String name;
	private FamilyCat mother;
	private FamilyCat father;
	public static ArrayList<FamilyCat> cats = new ArrayList<FamilyCat>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FamilyCat getMother() {
		return mother;
	}
	public void setMother(FamilyCat mother) {
		this.mother = mother;
	}
	public FamilyCat getFather() {
		return father;
	}
	public void setFather(FamilyCat father) {
		this.father = father;
	}
	
	
	
/*Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Создать класс,
 который бы помог описать данную ситуацию. Создать 6 объектов: маму, папу, сына,
  дочь, бабушку(мамина мама) и дедушку(папин папа). Вывести их всех на экран 
  в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
 * */
	
}
