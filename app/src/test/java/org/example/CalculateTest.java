package org.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculateTest {
  Calculate calculate = new Calculate();
  @Test
  public void testSumAB() {
    int expected = 5;
    assertEquals(expected, calculate.sumAB(2, 3));
  }
  @Test
  public void testAveAB(){
    double expected = 2.5;
    assertEquals(expected, calculate.aveAB(5), 0.0);
  }
  @Test
  public void testSumA2B(){
    int expected = 55;
    assertEquals(expected, calculate.sumA2B(1, 10));
  }
  @Test
  public void aveA2B(){
    double expected = 5.5;
    assertEquals(expected, calculate.aveA2B(55, 1, 10), 0.0);
  }
  @Test
  public void sumOfoddA2B(){
    int expected = 25;
    assertEquals(expected, calculate.sumOfoddA2B(1, 10));
  }
  @Test
  public void sumOfevenA2B(){
    int expected = 30;
    assertEquals(expected, calculate.sumOfevenA2B(1, 10));
  }
}
