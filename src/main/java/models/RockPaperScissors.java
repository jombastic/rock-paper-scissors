package models;

public class RockPaperScissors {
  public String evaluateCombos(String player1, String player2) {
    int player1Score = 0;
    int player2Score = 0;
    String winner = null;

    boolean player1Favor1 = player1.equals("rock") && player2.equals("scissors");
    boolean player1Favor2 = player1.equals("paper") && player2.equals("rock");
    boolean player1Favor3 = player1.equals("scissors") && player2.equals("paper");
    boolean player2Favor1 = player1.equals("scissors") && player2.equals("rock");
    boolean player2Favor2 = player1.equals("rock") && player2.equals("paper");
    boolean player2Favor3 = player1.equals("paper") && player2.equals("scissors");
    if (player1Favor1 || player1Favor2 || player1Favor3) {
      winner = "Player 1";
    } else if (player2Favor1 || player2Favor2 || player2Favor3) {
      winner = "Player 2";
    }
    return winner;
  }
}
