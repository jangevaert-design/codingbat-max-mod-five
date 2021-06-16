package edu.cnm.deepdive;

/*

Given two int values, return whichever value is larger.
However if the two values have the same remainder when divided by 5, then the return the smaller value.
However, in all cases, if the two values are the same, return 0.

maxMod5(2, 3) → 3
maxMod5(6, 2) → 6
maxMod5(3, 2) → 3
 */

public class CodingBatMaxModFive {

  public static void main(String[] args) {
    System.out.printf("With the ints %d and %d, the result will be " + maxMod5(2, 3 ) + ".\n", 2, 3);
    System.out.printf("With the ints %d and %d, the result will be " + maxMod5(6, 2 ) + ".\n", 6, 2);
    System.out.printf("With the ints %d and %d, the result will be " + maxMod5(3, 2 ) + ".\n", 3, 2);
  }

  public static int maxMod5(int a, int b) {
    if (a != b) {
      if (a % 5 == b % 5) {
        return Math.min(a, b);
      } else {
        return Math.max(a, b);
      }
    }
    return 0;
  }

}
