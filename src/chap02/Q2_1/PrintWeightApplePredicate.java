package chap02.Q2_1;

/**
 * Prints the weight of an apple.
 *
 * @author Gyumin Kim
 * @since 2019-02-04
 */
public class PrintWeightApplePredicate implements ApplePredicate {

  @Override
  public String getAppleOutput(Apple apple) {
    return "An apple of " + apple.getWeight() + "g";
  }
}
