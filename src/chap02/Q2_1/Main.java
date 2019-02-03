package chap02.Q2_1;

import java.util.Arrays;
import java.util.List;

/**
 * @author Gyumin Kim
 * @since 2019-02-04
 */
public class Main {

  public static void prettyPrintApple(List<Apple> inventory, ApplePredicate p) {
    for (Apple apple : inventory) {
      String output = p.getAppleOutput(apple);
      System.out.println(output);
    }
  }

  public static void main(String[] args) {
    Apple apple1 = new Apple(100, "red");
    Apple apple2 = new Apple(80, "blue");
    Apple apple3 = new Apple(130, "green");
    Apple apple4 = new Apple(310, "yellow");
    Apple apple5 = new Apple(20, "purple");
    List<Apple> appleList = Arrays.asList(apple1, apple2, apple3, apple4, apple5);

    prettyPrintApple(appleList, new PrintWeightApplePredicate());
    prettyPrintApple(appleList, new AppleHeavyWeightPredicate());
  }
}
