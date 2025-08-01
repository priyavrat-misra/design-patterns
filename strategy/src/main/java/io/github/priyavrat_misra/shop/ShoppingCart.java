package io.github.priyavrat_misra.shop;

public class ShoppingCart {
  private PaymentStrategy paymentStrategy;

  public void setPaymentStrategy(PaymentStrategy strategy) {
    this.paymentStrategy = strategy;
  }

  public void checkout(int amount) {
    paymentStrategy.pay(amount);
  }
}
