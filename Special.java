/*
 * Created by Jasque Saydyk and Kaitlyn Grubb
 * In-Class Assignment 3
 * CS 386
 * 14 March 2018
 * Description - This class represents any special product
*/
import java.text.DecimalFormat;

public class Special implements Product{

	private String name;
	private double weight;
	private double price;
	private Placement place;
	private double priceModifier;
	
	/**
	 * Initializes a special product
	 * @param name - Of the product as a String
	 * @param weight - Of the product, meaning unspecified
	 * @param price - Of the product
	 * @param place - Location of the product
	 */
	public Special(String name, double weight, double price, Placement place){
		this.name = name;
		this.weight = weight;
		this.price = price;
		this.place = place;
		this.priceModifier = 0.1;
	}
	
	
	/**
	 * Returns the name of the product
	 * @return name of the product
	 */
	public String getName(){
		return this.name;
	}
	
	
	/**
	 * Calculates the price of the product based on several factors
	 * Requirement: The price is calculated multiplying its weight to the unit value plus 10%
	 * @return The price of the product, formated to a standard price form of #.##
	 */
	public double calcPrice() {
		double result = this.weight * this.price + (this.weight * this.price * this.priceModifier);
		result = result * this.place.getDiscount();
		
		DecimalFormat df = new DecimalFormat("#.##");
		result = Double.parseDouble(df.format(result));
		
		return result;
	}
}
