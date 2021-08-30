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

public class UserInterface {
    
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }
    
    public void start(){
        while(true){
            String input = scanner.nextLine();
            if(input.equals("stop")){
                break;
            }
            
            if(input.equals("add")){
                list.add(scanner.nextLine());
            }
            
            if(input.equals("list")){
                list.print();
            }
            if(input.equals("remove")){
                System.out.println("Which one is removed?");
                list.remove(Integer.valueOf(scanner.nextLine()));
            }
        }
    }
}
