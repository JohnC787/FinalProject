import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Team {
    private String name;
    private ArrayList<Player> players;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public void addPlayer(String playerName) {
        players.add(new Player(playerName));
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
            System.out.println(p.getStats());
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    // 🔽 Sorting Methods

    public void sortByBattingAverageDescending() {
        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return Double.compare(p2.getBattingAverage(), p1.getBattingAverage());
            }
        });
    }

    public void sortByHomeRunsDescending() {
        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player p1, Player p2) {
                return Integer.compare(p2.getHomeRuns(), p1.getHomeRuns());
            }
        });
    }
}
