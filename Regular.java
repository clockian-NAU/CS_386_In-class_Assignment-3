/*
 * Created by Jasque Saydyk and Kaitlyn Grubb
 * In-Class Assignment 3
 * CS 386
 * 14 March 2018
 * Description - This class represents any regular product
*/
import java.text.DecimalFormat;

public class Regular implements Product{

	private String name;
	private double price;
	private Placement place;
	
	/**
	 * Initializes a regular product
	 * @param name - Of the product
	 * @param price - Of the product
	 * @param place - Location of the product
	 */
	public Regular(String name, double price, Placement place){
		this.name = name;
		this.price = price;
		this.place = place;
	}
	
	
	/**
	 * Returns the name of the product
	 * @return name of the product
	 */
	public String getName() {
		return this.name;
	}
	
	
	/**
	 * Calculates the price of the product based on several factors
	 * Requirement: The price is calculated by multiplying the unit price to the discount
	 * @return The price of the product, formated to a standard price form of #.##
	 */
	public double calcPrice() {
		double result = price * place.getDiscount();
		
		DecimalFormat df = new DecimalFormat("#.##");
		result = Double.parseDouble(df.format(result));
		
		return result;
	}
}
