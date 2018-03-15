/*
 * Created by Jasque Saydyk and Kaitlyn Grubb
 * In-Class Assignment 3
 * CS 386
 * 14 March 2018
 * Description - This class represents storage to hold a product
*/
public class Storage implements Placement{
	private double baseDiscount;
	
	/**
	 * Initialized a storage
	 */
	public Storage(){
		baseDiscount = 0.2;
	}
	
	
	/**
	 * Calculates the discount based on the location
	 * Requirement: The discount is 20%
	 * @return the discount of the shelf location
	 */
	public double getDiscount(){
		return baseDiscount;
	}
}
