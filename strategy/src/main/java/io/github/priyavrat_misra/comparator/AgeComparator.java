package io.github.priyavrat_misra.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
  public int compare(Person p1, Person p2) {
    return Integer.compare(p1.age, p2.age);
  }
}
