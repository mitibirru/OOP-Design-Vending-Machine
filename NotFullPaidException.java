package vending;

public class NotFullPaidException extends RuntimeException {
  private String message;
  private long remaining;

  public NotFullPaidException(String message, long remaining) {
    this.message = message;
    this.remaining = remaining;
  }

  @Override
  public String getMessage() {
    return message;
  }

  public long getRemaining() {
    return remaining;
  }

}
