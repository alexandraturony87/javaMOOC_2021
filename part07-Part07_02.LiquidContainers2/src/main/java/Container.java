/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zac
 */
public class Container {
    int amount;
    
    public Container(){
        this.amount = 0;
    }
    
    public int contains(){
        return this.amount;
    }
    
    public void add(int amount){
        if(amount >= 100){
            this.amount = 100;
        }else if(amount < 100 && amount >= 0){
            this.amount = this.amount + amount;
            if(this.amount >= 100){
               this.amount = 100; 
            }
        }
    }
    
    public void remove(int amount){
        if(amount >= this.amount){
            this.amount = 0;
        }else if(amount < this.amount && amount >= 0){
            this.amount = this.amount - amount;
        }
    } 
    
    public String toString(){
        return this.amount + "/100";
    }
}
