
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        int oldest = 0;
        int helper = 0;
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] pieces = input.split(",");
            int current = Integer.valueOf(pieces[1]);
            if(oldest < current){
                oldest = current;
            }
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
