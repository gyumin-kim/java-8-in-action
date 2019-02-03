package chap02.Q2_1;

/**
 * Prints whether each apple is heavy or light.
 *
 * @author Gyumin Kim
 * @since 2019-02-04
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {

  @Override
  public String getAppleOutput(Apple apple) {
    String characteristic = apple.getWeight() > 120 ? "heavy" : "light";
    return "A " + characteristic + " " + apple.getColor() + " apple";
  }
}
