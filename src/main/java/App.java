import models.RockPaperScissors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
  public static void main(String[] args) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    RockPaperScissors newGame = new RockPaperScissors();
    boolean run = true;
    while (run) {
      System.out.println("Welcome to rock-paper-scissors game!");
      try {
        System.out.print("Player 1: ");
        String player1 = bufferedReader.readLine();
        System.out.print("Player 2: ");
        String player2 = bufferedReader.readLine();
        boolean player1Eval = player1.equals("rock") || player1.equals("paper") || player1.equals("scissors");
        boolean player2Eval = player2.equals("rock") || player2.equals("paper") || player2.equals("scissors");

        if (!player1Eval || !player2Eval) {
          System.out.println("Wrong input!");
        } else {
          String winner = newGame.evaluateCombos(player1, player2);
          if (winner.equals("Player 1")) {
            System.out.println(winner + " is the winner!");
          } else if (winner.equals("Player 2")) {
            System.out.println(winner + " is the winner!");
          } else if (winner.equals("tie")) {
            System.out.println("It is a" + winner);
          }
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
