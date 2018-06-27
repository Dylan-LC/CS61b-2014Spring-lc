/* BadTransactionException.java */

/**
 *  Implements an exception that should be thrown for withdrawing negative amount.
 **/
public class BadTransactionException extends Exception {

  public int amount;  // The invalid amount number.

  /**
   *  Creates an exception object for nonexistent account "badAcctNumber".
   **/
  public BadTransactionException(int badAmount) {
    super("Invalid amount numbe, maybe less than 0: " + badAmount);

    amount = badAmount;
  }
}
