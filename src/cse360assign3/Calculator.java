package cse360assign3;
/**
 * 
 * @author BrandonG
 * Calculator Class. Does basic integer arithmetic
 */
public class Calculator {

	private int total;
	
	/**
	 * Constructor Class
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * 
	 * @return total of the current operation
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Add values to the current total
	 * @param value Value to add
	 */
	public void add (int value) {
		total = total + value;
	}
	
	/**
	 * Subtract values from the current total
	 * @param value 
	 */
	public void subtract (int value) {
		total = total - value;
	}
	
	/**
	 * Multiplies the current total with a value
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
	}
	
	/*
	 * Divides the current total
	 */
	public void divide (int value) {
		if ( value == 0 ) {
			total = 0;
		} else {
			total = total / value;
		}
	}
	
	/*
	 * Returns a history of the previous operations
	 */
	public String getHistory () {
		return "";
	}
}