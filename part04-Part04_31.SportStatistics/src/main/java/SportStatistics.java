
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String file = scanner.nextLine();
        ArrayList <Matches> ndeshjet = new ArrayList <>();
        try (Scanner reader = new Scanner(Paths.get(file))){
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                String [] split = line.split(",");
                String ekipiHome = split[0];
                String ekipiAway = split[1];
                int homePoints = Integer.valueOf(split[2]);
                int awayPoints = Integer.valueOf(split[3]);
                ndeshjet.add(new Matches(ekipiHome, ekipiAway, homePoints, awayPoints));
            }
        }
        catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
        System.out.println("Team:");
String input1 = scanner.nextLine();

int totalGames = 0;
int totalWins = 0;
int totalLosses = 0;

for (Matches match : ndeshjet) {
    if (input1.equals(match.getFirstTeam()) || input1.equals(match.getSecondTeam())) {
        totalGames++;

        if ((input1.equals(match.getFirstTeam()) && match.getFirstPoints() > match.getSecondPoints()) ||
            (input1.equals(match.getSecondTeam()) && match.getSecondPoints() > match.getFirstPoints())) {
            totalWins++;
        } else {
            totalLosses++;
        }
    }
}

System.out.println("Games: " + totalGames + " Wins: " + totalWins + " Losses: " + totalLosses);

    }
}
