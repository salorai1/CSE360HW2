
package cse360assign2;

/**
 * 
 * @author		Saleh Aloraini
 * Class ID:	314
 * Description: Assignment 2:
 * 				Calculator class is a simple calculator to add, subtract,
 * 				multiply, divide to a total value. It also has a function to 
 * 				return the total, and one to return the history of all actions.
 * @version 	2 Added the functions' operations except for getHistory
 *
 */
public class Calculator 
{

	private int total;
	
	/**
	 * constructor that initializes the total and the history of the class
	 */
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	
	/**
	 * A function to return the current total of the class
	 * @return returns the total in the calculator
	 */
	public int getTotal () 
	{
		return total;
	}
	
	
	/**
	 * A function that adds a value to the total
	 * @param value the value added to the total
	 */
	public void add (int value) 
	{
		total =  total + value;
	}
	
	
	/**
	 * A function that subtracts a value from the total
	 * @param value the value subtracted of the total
	 */
	public void subtract (int value) 
	{
		total =  total - value;
	}
	
	
	/**
	 * A function that multiplies a value by the total
	 * @param value the value multiplied by the total
	 */
	public void multiply (int value) 
	{
		total =  total * value;
	}
	
	
	/**
	 * A function that divides a value over the total, and if the value entered
	 * is zero, the total becomes 0.
	 * @param value the value the total divided by
	 */
	public void divide (int value) 
	{
		if (value == 0)
			total = 0;
		else
			total = total / value;
	}
	
	
	/**
	 * A method that returns all the actions that happened to the total from
	 * the beginning.
	 * @return returns the history of all actions as a String
	 */
	public String getHistory () 
	{
		return "";
	}
}
