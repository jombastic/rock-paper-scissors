package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class RockPaperScissorsTest {
  @Test
  public void evaluateCombos_rockVsScissors_int() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    int expected = 1;
    assertEquals(expected, testRockPaperScissors.evaluateCombos("rock", "scissors"));
  }

  @Test
  public void evaluateCombos_paperVsRock_int() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    int expected = 1;
    assertEquals(expected, testRockPaperScissors.evaluateCombos("paper", "rock"));
  }
}