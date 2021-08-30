
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        
        while(true){
            System.out.println("Enter a number:");
            int userNum = Integer.valueOf(scanner.nextLine());
            if(userNum == 9999){
                break;
            }
            list.add(userNum);
        }
        
        int smallest = list.get(0);
        int index = list.size() -1;
        
        for(int i = 0; i < list.size(); i++){
            int number = list.get(i);
            if(smallest > number){
                smallest = number;                
            }
        }
        System.out.println("Smallest number: " + smallest);
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == smallest){
                System.out.println("Found at index: " + i);
            }
        }
        
        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

        
    }
}
