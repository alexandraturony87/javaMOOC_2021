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

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary =  dictionary;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String input = scanner.nextLine();
            
            if(input.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(input.equals("add")){
                System.out.println("Word:");
                String userWord = scanner.nextLine();

                System.out.println("Translation:");
                String translation = scanner.nextLine();

                dictionary.add(userWord, translation);       
                
            }else if(input.equals("search")){
                System.out.println("To be translated?");
                String userWord = scanner.nextLine();
                if(dictionary.translate(userWord) == null){
                    System.out.println("Word " + userWord + " was not found.");
                }else{
                    System.out.println("Translation: " + dictionary.translate(userWord));
                }
                
            }else{
                System.out.println("Unknown command");
            }
            
            
        }
    }
}
