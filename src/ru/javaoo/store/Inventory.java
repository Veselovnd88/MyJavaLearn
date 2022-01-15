package ru.javaoo.store;
import java.text.DecimalFormat;

public class Inventory {
	
	public static void produceReport(Item[] arr) {
		DecimalFormat df = new DecimalFormat();
		int count=0;
		double value = 0;
		//System.out.println("Ассортимент товаров в нашем магазине");
		System.out.printf("%-30s%10s%5s\n","Title","Price"," Quantity");
		for(Item i:arr) {
			if(i!=null) {
				System.out.printf("%-30s%10d%5s\n", i.getTitle(),
						i.getQuantity(), df.format(i.getPrice()));
			//System.out.println("В наличии "+i.getTitle()+
			//		": "+ i.getQuantity()+" шт., по цене "+i.getPrice());
			count+=i.getQuantity();
			value+=i.getPrice()*i.getQuantity();
		}	else {break;}}
	
		System.out.printf("%-30s%10s%5s\n","",df.format(value),count);

}}
