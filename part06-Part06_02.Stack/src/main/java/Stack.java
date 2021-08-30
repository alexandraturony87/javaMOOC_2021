/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zac
 */
import java.util.ArrayList;

public class Stack {
   private ArrayList<String> listings; 
   
   public Stack(){
       this.listings = new ArrayList<>();
   }
   
   public boolean isEmpty(){
       if(listings.isEmpty()){
           return true;
       }
       return false;
   }
   
   public void add(String value){
       listings.add(value);
   }
   
   public String take(){
      String toRemove = this.listings.get(this.listings.size() - 1);
      this.listings.remove(toRemove);
      return toRemove;
   }
   
   public ArrayList<String> values(){
       return this.listings;
   }
}
