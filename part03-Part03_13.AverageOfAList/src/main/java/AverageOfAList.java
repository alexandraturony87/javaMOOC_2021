
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        
        while(true){
            System.out.println("Give a number:");
            int userNum = Integer.valueOf(scanner.nextLine());
            if(userNum == -1){
                break;
            }
            list.add(userNum);
        }
        
        int count = 0;
        int sum = 0;
        double average = 0.0;
        
        for(int value: list){
            sum = sum + value;
            count++;
        }
        average = (double)sum / count;
        System.out.println("Average: " + average);
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
