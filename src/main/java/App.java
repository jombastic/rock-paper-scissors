import models.RockPaperScissors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
  public static void main(String[] args) {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    RockPaperScissors newGame = new RockPaperScissors();
    System.out.println("Welcome to rock-paper-scissors game!");
    try {
      for (int i = 3; i <= 3; i++) {
        System.out.println("Player 1:");
        String player1 = bufferedReader.readLine();
        System.out.println("Player 2");
        String player2 = bufferedReader.readLine();
        newGame.evaluateCombos(player1,player2);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
