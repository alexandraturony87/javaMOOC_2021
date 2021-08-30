
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try(Scanner scanFile = new Scanner(Paths.get(file))){
            while(scanFile.hasNextLine()){
                String numString = scanFile.nextLine();
                int numInt = Integer.valueOf(numString);
                
                if(numInt >= lowerBound && numInt <= upperBound){
                    count++;
                }
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Numbers: " + count);
    }

}
