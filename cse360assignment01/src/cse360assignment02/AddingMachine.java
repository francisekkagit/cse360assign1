/**
 * The Adding Machine adds and subtracts values.
 * 
 * @author Francis Ekka
 * @version 2.0
 * @since 2020-10-7
**/

package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
    
  }
  
  public int getTotal () {
    return total;
  }
  
  /**
   * This method adds values and saves in history.
   * @param value
   * @return nothing
  **/
  
  public void add (int value) {
	  total = total + value;
	  history += " + " + value;
  }
  
  /**
   * This method subtracts values and saves in history
   * @param value
   * @return nothing
  **/
  public void subtract (int value) {
	  total = total - value;
	  history += " - " + value;
  }
  
  /**
   * This method returns the backlog of operations in history
   * @return string of values with operations
  **/

  public String toString () {
    return history;
  }

  /**
   * This method clears values and returns total to 0 and 
   * returns the history to 0
   * @return history
  **/
  public void clear() {
	  total = 0;
	  history = "0";
  }
}