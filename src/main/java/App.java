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
      try {
        System.out.println("Welcome to rock-paper-scissors game!");
        System.out.println("Choose your opponent: player or computer");
        String opponent = bufferedReader.readLine();
        switch (opponent) {
          case "player": {
            System.out.print("Player 1: ");
            String player1 = bufferedReader.readLine();
            System.out.print("Player 2: ");
            String player2 = bufferedReader.readLine();
            System.out.println("-----------------------------");
            System.out.println(result(player1, player2, newGame));
            System.out.println("-----------------------------");
            break;
          }
          case "computer": {
            System.out.print("Player 1: ");
            String player1 = bufferedReader.readLine();
            String player2 = newGame.computerChooses();
            System.out.println("Player 2: " + player2);
            System.out.println("-----------------------------");
            System.out.println(result(player1, player2, newGame));
            System.out.println("-----------------------------");
            break;
          }
          default:
            System.out.println("Wrong opponent!");
            break;
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  private static String result(String player1, String player2, RockPaperScissors newGame) {
    String winner = newGame.evaluateCombos(player1, player2);
    switch (winner) {
      case "Player 1":
        return winner + " is the winner!";
      case "Player 2":
        return winner + " is the winner!";
      case "tie":
        return "It is a " + winner;
      default:
        return "Wrong input!";
    }
  }
}
