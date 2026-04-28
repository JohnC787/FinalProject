public class Player {
  private String name;
  private int hits;
  private int atBats;
  private int homeRuns;
  private int strikeOuts;

  public Player(String name) {
    this.name = name;
    this.hits = 0;
    this.atBats = 0;
    this.homeRuns = 0;
    this.strikeOuts = 0;
  }
  public void addAtBat(boolean isHit, boolean isHomeRun, boolean isStrikeout) {
    atBats++;

    if (isHit) {
      hits++;
      if (isHomeRun) {
        homeRuns++;
      }
    }
    if (isStrikeout) {
      strikeOuts++;
    }
  }
  public double getBattingAverage() {
    if (atBats == 0) return 0.0;
    return (double) hits / atBats;
  }
  public String getName() {
    return name;
  }
  public String getStats() {
    return name + " | AVG: " + String.format("%.3f", getBattingAverage())
      + " | H: " + hits
      + " | HR: " + homeRuns
      + " | SO: " + strikeOuts;
  }
  public int getHomeRuns() {
    return homeRuns;
  }
}

    
