package io.github.priyavrat_misra.shop;

public class PayPalPayment implements PaymentStrategy {
  public void pay(int amount) {
    System.out.println("Paid " + amount + " using PayPal.");
  }
}
