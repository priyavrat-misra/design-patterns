package io.github.priyavrat_misra;

import io.github.priyavrat_misra.comparator.AgeComparator;
import io.github.priyavrat_misra.comparator.NameComparator;
import io.github.priyavrat_misra.comparator.Person;
import io.github.priyavrat_misra.shop.CreditCardPayment;
import io.github.priyavrat_misra.shop.PayPalPayment;
import io.github.priyavrat_misra.shop.ShoppingCart;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // shop
    ShoppingCart cart = new ShoppingCart();

    cart.setPaymentStrategy(new CreditCardPayment());
    cart.checkout(100);

    cart.setPaymentStrategy(new PayPalPayment());
    cart.checkout(200);

    cart.setPaymentStrategy(amount -> System.out.println("Paid " + amount + "."));
    cart.checkout(300);

    // comparator
    List<Person> people =
        Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 35));

    // Sort by name
    /*
     * people.sort((p1, p2) -> p1.getName().compareTo(p2.getName()));
     * people.sort(Comparator.comparing(Person::getName));
     */
    people.sort(new NameComparator());
    System.out.println("Sorted by name: " + people);

    // Sort by age
    people.sort(new AgeComparator());
    System.out.println("Sorted by age: " + people);
  }
}
