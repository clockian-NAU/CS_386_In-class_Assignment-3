/*
 * Created by Jasque Saydyk and Kaitlyn Grubb
 * In-Class Assignment 3
 * CS 386
 * 14 March 2018
 * Description - This class tests/runs the assignment
*/
public class Purchase {
	public static void main(String[] args) {
		
		Storage storage = new Storage();
		Special couch = new Special("Couch", 15.2, 100.0, storage);
		Special bed = new Special("Bed", 30.8, 200, storage);
		
		Shelf chairShelf = new Shelf(600, 600);
		Special chair = new Special("Chair", 50, 300, chairShelf);
		
		Shelf pillowShelf = new Shelf(30.5, 80.5);
		Special pillow = new Special("Pillow", 5.6, 40.06, pillowShelf);
		
		Regular toothbrush = new Regular("Toothbrush", 5.02, storage);
		Regular bread = new Regular("Bread", 1, storage);
		
		Shelf honeyShelf = new Shelf(5, 5);
		Regular honey = new Regular("Honey", 3.72, honeyShelf);
		
		Shelf tortillaShelf = new Shelf(10.3, 15.3);
		Regular tortilla = new Regular("Tortilla", 4, tortillaShelf);
		
		//Product products[] = new Product[8];
		Product products[] = {couch, bed, chair, pillow, toothbrush, bread, honey, tortilla};
		double total = 0;
		
		for(Product stuff : products) {
			System.out.println("The price of " + stuff.getName() + " is $" + stuff.calcPrice());
			total += stuff.calcPrice();
		}
		
		System.out.println("\nThe total price of all of the products is $" + total);
	}
}
