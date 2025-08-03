package io.github.priyavrat_misra.shop;

@FunctionalInterface
public interface PaymentStrategy {
  void pay(int amount);
}
