package models;

public class RockPaperScissors {
  public int evaluateCombos(String player1, String player2) {
    int player1Score = 0;
    if (player1.equals("rock") && player2.equals("scissors")) {
      player1Score = 1;
    }
    return player1Score;
  }
}
