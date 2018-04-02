package models;

import java.util.Random;

public class RockPaperScissors {
  public String evaluateCombos(String player1, String player2) {
    String winner;
    boolean player1Favor1 = player1.equals("rock") && player2.equals("scissors");
    boolean player1Favor2 = player1.equals("paper") && player2.equals("rock");
    boolean player1Favor3 = player1.equals("scissors") && player2.equals("paper");
    boolean player2Favor1 = player1.equals("scissors") && player2.equals("rock");
    boolean player2Favor2 = player1.equals("rock") && player2.equals("paper");
    boolean player2Favor3 = player1.equals("paper") && player2.equals("scissors");
    boolean tie1 = player1.equals("paper") && player2.equals("paper");
    boolean tie2 = player1.equals("scissors") && player2.equals("scissors");
    boolean tie3 = player1.equals("rock") && player2.equals("rock");

    if (player1Favor1 || player1Favor2 || player1Favor3) {
      winner = "Player 1";
    } else if (player2Favor1 || player2Favor2 || player2Favor3) {
      winner = "Player 2";
    } else if (tie1 || tie2 || tie3) {
      winner = "tie";
    } else {
      winner = "wrong";
    }
    return winner;
  }

  public String computerChooses() {
    Random randomChoice = new Random();
    int computerChoice = randomChoice.nextInt(4);
    if (computerChoice == 1) {
      return "rock";
    } else if (computerChoice == 2) {
      return "paper";
    } else {
      return "scissors";
    }
  }
}
