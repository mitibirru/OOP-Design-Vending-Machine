// Vending Machine throws this exception to indicate that it doesn't have sufficient change to complete this request.

package vending;

public class NotSufficientChangeException extends RuntimeException {
  private String message;

  public NotSufficientChangeException(String message) {
    this.message = message;
  }

  @Override
  public String getMessage(){
    return message;
  }
}
