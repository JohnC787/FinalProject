import java.util.Random;

public class GameSimulator {
  private Random rand;
  public GameSimulator() {
    rand = new Random();
  }
  public void simulateGame(Team team) {
    System.out.println("\n--- Simulating Game ---");
    for (Player p : team.getPlayers()) {
      int atBats = rand.nextInt(4) + 1;
      for (int i = 0; i <atBats; i++) {
        int result = rand.nextInt(100);

        if (result < 25) {
          boolen isHR = result < 5;
          p.addAtBat(true, isHR, false);
        } else if (result < 60) {
          p.addAtBat(false, false, true);
        } else {
          p.addAtBat(false, false, false);
        }
      }
    }
    System.out.println("Game complete!");
  }
}
