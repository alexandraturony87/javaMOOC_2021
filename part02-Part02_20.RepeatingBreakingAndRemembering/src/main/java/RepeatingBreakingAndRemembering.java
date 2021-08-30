
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sum = 0;
        int totalNums = 0;
        double average = 0.0;
        int evenNums = 0;
        int oddNums = 0;
        
        while(true){
            int userNum = Integer.valueOf(scanner.nextLine());
            
            if(userNum == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            sum += userNum;
            totalNums++;
            average = (double)sum / totalNums;
            if(userNum % 2 == 0){
                evenNums++;
            }else{
                oddNums++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + totalNums);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenNums);
        System.out.println("Odd: " + oddNums);
    }
}
