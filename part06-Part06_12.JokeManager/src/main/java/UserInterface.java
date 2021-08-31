/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zac
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class UserInterface {
    
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String input = scanner.nextLine();
            if(input.equals("X")){
                break;
            }
            
            if(input.equals("1")){
                System.out.println("Write the joke to be added:");
                String toAdd = scanner.nextLine();
                manager.addJoke(toAdd);
                continue;
            }else if(input.equals("2")){
                System.out.println(manager.drawJoke());
                continue;
            }else if(input.equals("3")){
                manager.printJokes();
                continue;
            }
        }
    }
}
