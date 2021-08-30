
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        int checker = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try(Scanner scanFile = new Scanner(Paths.get(file))){
            while(scanFile.hasNextLine()){
                String row = scanFile.nextLine();
                if(row.contains(searchedFor)){
                    checker = 1;
                    break;
                }else{
                    checker = 0;
                }
            }           
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        if(checker == 1){
            System.out.println("Found!");
        }
        if(checker == 0){
            System.out.println("Not found.");
        }
    }
}
