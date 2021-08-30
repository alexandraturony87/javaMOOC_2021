
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum = Integer.valueOf(scanner.nextLine());
        
        if(userNum < 0){
            System.out.println(userNum * -1);
        }else{
            System.out.println(userNum);
        }
    }
}
