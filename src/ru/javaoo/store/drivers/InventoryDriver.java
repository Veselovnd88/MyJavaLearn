package ru.javaoo.store.drivers;

import java.util.Date;

import ru.javaoo.store.Artist;
import ru.javaoo.store.Book;
import ru.javaoo.store.CD;
import ru.javaoo.store.ClassicalCD;
import ru.javaoo.store.Item;

public class InventoryDriver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Item[] myInventory = new Item[50];
		myInventory[0] = new Book("Haters", 1.15, 15, "Pusyun","HatePublishing",
				"Detective");
		myInventory[1] = new Book("Poppers",2.15,30,"Pistrun", "HatePublishing",
				"Comedy");
		myInventory[2] = new Book("Evlis", 3.13,1,"Evilhate","Evilision",
				"Horror");
		Artist piska = new Artist("Piska");
		myInventory[3] = new CD("Joppper",5.5,5, piska,
				new Date("07/07/1966"));
		Artist slipknot = new Artist("Slipknot");
		myInventory[4] = new CD("Slipknot",6.66,666, slipknot,
				new Date("06/06/666"));
		


	}

}
