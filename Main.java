import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter team name: ");
        String teamName = sc.nextLine();

        Team team = new Team(teamName);
        GameSimulator simulator = new GameSimulator();

        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Player");
            System.out.println("2. Remove Player");
            System.out.println("3. View Team");
            System.out.println("4. Simulate Game");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter player name: ");
                    String name = sc.nextLine();
                    team.addPlayer(name);
                    break;

                case 2:
                    System.out.print("Enter player name to remove: ");
                    String removeName = sc.nextLine();
                    team.removePlayer(removeName);
                    break;

                case 3:
                    team.displayPlayers();
                    break;

                case 4:
                    simulator.simulateGame(team);
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
