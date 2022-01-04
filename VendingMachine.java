// A public API of a vending machine, usually all high-level funcitonality should go in this class

package vending;

import java.util.List;

public interface VendingMachine {
  public long selectItemAndGetPrice(Item item);
  public void insertCoin(Coin coin);
  public List<Coin> refund();
  public Bucket<Item, List<Coin>> collectItemAndChange();
  public void reset();
}