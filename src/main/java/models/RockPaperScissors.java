package models;

public class RockPaperScissors {
  public int evaluateCombos(String player1, String player2) {
    int player1Score = 0;
    boolean player1Favor1 = player1.equals("rock") && player2.equals("scissors");
    boolean player1Favor2 = player1.equals("paper") && player2.equals("rock");
    boolean player1Favor3 = player1.equals("scissors") && player2.equals("paper");
    if (player1Favor1 || player1Favor2 || player1Favor3) {
      player1Score = 1;
    }
    return player1Score;
  }
}
