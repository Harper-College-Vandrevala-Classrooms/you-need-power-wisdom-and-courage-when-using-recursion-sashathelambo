package com.csc;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TriangleNumberCalculatorTest {

  TriangleNumberCalculator calculator = new TriangleNumberCalculator();

  @Test
  public void testValue() {
      assertEquals(1, calculator.value(1));
      assertEquals(3, calculator.value(2));
      assertEquals(6, calculator.value(3));
      assertEquals(10, calculator.value(4));
  }

  @Test
  public void testAdd() {
      assertEquals(2, calculator.add(1, 1));
      assertEquals(9, calculator.add(2, 3));
      assertEquals(13, calculator.add(4, 2));
  }

  @Test
  public void testSubtract() {
      assertEquals(0, calculator.subtract(1, 1));
      assertEquals(-3, calculator.subtract(2, 3));
      assertEquals(7, calculator.subtract(4, 2));
  }

  @Test
  public void testMultiply() {
      assertEquals(60, calculator.multiply(3, 4));
      assertEquals(18, calculator.multiply(2, 3));
  }

  @Test
  public void testDivide() {
      assertEquals(3.3333, calculator.divide(4, 2), 0.0001);
      assertEquals(0.4, calculator.divide(3, 5), 0.0001);
  }

  @Test
  public void testSequence() {
      List<Integer> expectedSequence = Arrays.asList(1, 3, 6, 10, 15);
      assertEquals(expectedSequence, calculator.sequence(5));
      expectedSequence = Arrays.asList(1, 3, 6);
      assertEquals(expectedSequence, calculator.sequence(3));
  }
}
