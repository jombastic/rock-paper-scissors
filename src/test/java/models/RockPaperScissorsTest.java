package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class RockPaperScissorsTest {
  @Test
  public void evaluateCombos_rockVsScissors_String() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Player 1";
    assertEquals(expected, testRockPaperScissors.evaluateCombos("rock", "scissors"));
  }

  @Test
  public void evaluateCombos_paperVsRock_String() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Player 1";
    assertEquals(expected, testRockPaperScissors.evaluateCombos("paper", "rock"));
  }

  @Test
  public void evaluateCombos_scissorsVsPaper_String() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Player 1";
    assertEquals(expected, testRockPaperScissors.evaluateCombos("scissors", "paper"));
  }

  @Test
  public void evaluateCombos_scissorsVsRock_String() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Player 2";
    assertEquals(expected, testRockPaperScissors.evaluateCombos("scissors", "rock"));
  }

  @Test
  public void evaluateCombos_rockVSPaper_String() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Player 2";
    assertEquals(expected, testRockPaperScissors.evaluateCombos("rock", "paper"));
  }

  @Test
  public void evaluateCombos_paperVSScissors_String() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Player 2";
    assertEquals(expected, testRockPaperScissors.evaluateCombos("paper", "scissors"));
  }
}