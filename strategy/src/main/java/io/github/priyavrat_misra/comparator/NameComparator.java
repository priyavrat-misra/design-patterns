package io.github.priyavrat_misra.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
  public int compare(Person p1, Person p2) {
    return p1.name.compareTo(p2.name);
  }
}
