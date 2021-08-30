
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        
        while(true){
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());
            
            if(userNum == 0){
                break;
            }else{
                count = count + 1;
                sum = sum + userNum;
            }
        }
        double average = (double)sum / count;
        System.out.println("Average of the numbers: " + average);
    }
}
