// The Vending Machine throws this exception if the user requests a product that is sold out

package vending;

public class SoldOutException extends RuntimeException {
  private String message;

  public SoldOutException(String message) {
    this.message = message;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
