
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int values = 0;
        int sum = 0;
        
        while(true){
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());
            
            if(userNum == 0){
                break;
            }else{
                values = values + 1;
                sum = sum + userNum;
            }
        }
        System.out.println("Number of numbers: " + values);
        System.out.println("Sum of the numbers: " + sum);
    }
}
