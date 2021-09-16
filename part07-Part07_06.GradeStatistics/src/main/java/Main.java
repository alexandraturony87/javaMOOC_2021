//I chose to do this exercise procedurally just to get some practice with that specific
//method of doing things.  This solution passes the tests and satisfies all instructions
//in the exercise but is not the way I would ideally approach the exercise.  I would
//prefer (if not intentionally implementing the solution procedurally) to create a class
//with a method for averaging points, one to handle grade distribution, and one to handle
//cherry-picking passing grades to average.  But since I have done most every exercise
//up to this point in the OOP style, I decided to mix it up a bit.

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int passCount = 0;
        int sum = 0;
        int passSum = 0;
        double average = 0.0;
        double passAverage = 0.0;
        double passPercent = 0.0;

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            if(input >= 0 && input <= 100){
                scores.add(input);
                count++;
            }
        }
        for(int score: scores){
            sum = sum + score;
        }
        for(int score: scores){
            if(score >= 50){
                passSum = passSum + score;
                passCount++;
            }
        }

        average = (double)sum / count;
        System.out.println("Point average (all): " + average);

        if(passSum == 0 || passCount == 0){
            passAverage = 0.0;
            System.out.println("Point average (passing): -");
        }else{
            passAverage = (double)passSum / passCount;
            System.out.println("Point average (passing): " + passAverage);
        }        

        passPercent = 100 * ((double)passCount / count);
        System.out.println("Pass percentage: " + passPercent);

        System.out.println("Grade Distribution:");
        System.out.print("5: ");
        for(int score: scores){
            if(score >= 90){
                System.out.print("*");
            }
        }
        System.out.println("");
        System.out.print("4: ");
        for(int score: scores){
            if(score >= 80 && score < 90) {
                System.out.print("*");
            }
        }
        System.out.println("");
        System.out.print("3: ");
        for(int score: scores){
            if(score >= 70 && score < 80) {
                System.out.print("*");
            }
        }
        System.out.println("");
        System.out.print("2: ");
        for(int score: scores){
            if(score >= 60 && score < 70) {
                System.out.print("*");
            }
        }
        System.out.println("");
        System.out.print("1: ");
        for(int score: scores){
            if(score >= 50 && score < 60) {
                System.out.print("*");
            }
        }
        System.out.println("");
        System.out.print("0: ");
        for(int score: scores){
            if(score < 50) {
                System.out.print("*");
            }
        }
    }
}