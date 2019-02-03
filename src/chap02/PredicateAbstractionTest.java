package chap02;

import chap02.Q2_1.Apple;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Gyumin Kim
 * @since 2019-02-04
 */
public class PredicateAbstractionTest {

  public static <T> List<T> filter(List<T> list, Predicate<T> p) {
    List<T> result = new ArrayList<>();
    for (T e : list) {
      if (p.test(e)) {
        result.add(e);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Apple apple1 = new Apple(100, "red");
    Apple apple2 = new Apple(80, "blue");
    Apple apple3 = new Apple(130, "green");
    Apple apple4 = new Apple(310, "yellow");
    Apple apple5 = new Apple(20, "purple");
    List<Apple> inventory = Arrays.asList(apple1, apple2, apple3, apple4, apple5);

    List<Apple> redApples = filter(inventory, (Apple apple) -> "red".equals(apple.getColor()));
  }
}
