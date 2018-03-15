/*
 * Created by Jasque Saydyk and Kaitlyn Grubb
 * In-Class Assignment 3
 * CS 386
 * 14 March 2018
 * Description - This class represents a shelf to hold a product
*/
public class Shelf implements Placement{
	
	private double baseDiscount;
	private double width;
	private double depth;
	
	/**
	 * Initializes a shelf
	 * @param width - Of the shelf
	 * @param depth - Of the shelf
	 */
	public Shelf(double width, double depth){
		this.baseDiscount = 0.1;
		this.width = width;
		this.depth = depth;
	}
	
	/**
	 * Calculates the discount based on the location
	 * Requirement: The discount is calculated based on its dimensions(width*depth mod 10%)
	 * @return the discount of the shelf location
	 */
	public double getDiscount(){
		double discount = this.width * this.depth % this.baseDiscount;
		return discount;
	}
}
