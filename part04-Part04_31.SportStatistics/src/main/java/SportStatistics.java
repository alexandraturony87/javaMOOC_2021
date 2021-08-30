
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        int teamCount = 0;
        int winCount = 0;
        int lossCount = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        try(Scanner scanFile = new Scanner(Paths.get(file))){
            while(scanFile.hasNextLine()){
                String line = scanFile.nextLine();
                
                String[] parts = line.split(",");
                String teamHome = parts[0];
                String teamVisit = parts[1];
                int pointsHome = Integer.valueOf(parts[2]);
                int pointsVisit = Integer.valueOf(parts[3]);
                if(teamHome.equals(team) || teamVisit.equals(team)){
                    teamCount++;
                }
                if(teamHome.equals(team) && pointsHome > pointsVisit){
                    winCount++;
                }
                if(teamVisit.equals(team) && pointsVisit > pointsHome){
                    winCount++;
                }
                if(teamHome.equals(team) && pointsHome < pointsVisit){
                    lossCount++;
                }
                if(teamVisit.equals(team) && pointsVisit < pointsHome){
                    lossCount++;
                }
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + teamCount);
        System.out.println("Wins: " + winCount);
        System.out.println("Losses: " + lossCount);
    }

}
