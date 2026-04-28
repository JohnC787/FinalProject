import java.util.ArrayList;

public class Team {
  private String name;
  private ArrayList<Player> players;

  public Team(String name) {
    this.name = name;
    players = new ArrayList<>();
  }
  public void addPlayer(String playerName) {
    players.add(newPlayer(playerName));
  }
  public void removePlayer(String playerName) {
    players.removeIf(p -> p.getName().equalsIgnoreCase(playerName));
  }
  public void displayPlayers() {
    if (players.isEmpty()) {
      System.out.println("No players on team.");
      return;
    }
    for (Player p : players) {
      Syetem.out.println(p.getStats());
    }
  }
  public ArrayList<Player> getPlayers() {
    return players;
  }
}
