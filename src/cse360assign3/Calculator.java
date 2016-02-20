package cse360assign3;
/**
 * 
 * @author BrandonG
 * Calculator Class. Does basic integer arithmetic
 */
public class Calculator {

	private int total;
	private String history;
	
	/**
	 * Constructor Class
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
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
		history = history + " + " + value;
	}
	
	/**
	 * Subtract values from the current total
	 * @param value 
	 */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**
	 * Multiplies the current total with a value
	 * @param value
	 */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/*
	 * Divides the current total
	 */
	public void divide (int value) {
		if ( value == 0 ) {
			total = 0;
		} else {
			total = total / value;
			history = history + " / " + value;
		}
	}
	
	/*
	 * Returns a history of the previous operations
	 */
	public String getHistory () {
		return history.trim();
	}
}