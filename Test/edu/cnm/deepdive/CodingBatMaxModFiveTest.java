package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatMaxModFiveTest {

  private static int[][] maxModParams = {
      {2, 3},
      {6, 2},
      {3, 2},
      {8, 12},
      {7, 12},
      {11, 6},
      {2, 7},
      {7, 7},
      {9, 1},
      {9, 14},
      {1, 2}
  };

  private static int[] maxModExpected = {3, 6, 3, 12, 7, 6, 2, 0, 9, 9, 2};

  @Test
  void maxMod5() {
    for (int i = 0; i < maxModParams.length; i++) {
      int actual = CodingBatMaxModFive.maxMod5(maxModParams[i][0], maxModParams[i][1]);
      Assertions.assertEquals(maxModExpected[i], actual);
    }
  }

};