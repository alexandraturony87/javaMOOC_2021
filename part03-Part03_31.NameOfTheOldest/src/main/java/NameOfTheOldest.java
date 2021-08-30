
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        int oldest = 0;
        int current = 0;
        String oldestName = "";
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String[] pieces = input.split(",");
            current = Integer.valueOf(pieces[1]);
            if(oldest < current){
                oldest = current;
                oldestName = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
