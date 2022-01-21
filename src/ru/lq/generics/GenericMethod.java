	package ru.lq.generics;

public class GenericMethod {
	public static <E> void printArray(E[] inputArray) {//перед типо ставлю дженерик, в аргументы передаем тип
		for(E element:inputArray) {
			System.out.printf("%s: element, ", element);	
	}System.out.println();
		}

}
