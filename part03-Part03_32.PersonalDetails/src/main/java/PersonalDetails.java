
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int longest = 0;
        int sum = 0;
        int count = 0;
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            String[] pieces = input.split(",");
            if(longest < pieces[0].length()){
                longest = pieces[0].length();
                longestName = pieces[0];
            }
            sum = sum + Integer.valueOf(pieces[1]);
            count++;
        }
        System.out.println("Longest name: " + longestName);
        if(count > 0){
            System.out.println("Average: " + (1.0 * sum / count));
        }
    }
}
