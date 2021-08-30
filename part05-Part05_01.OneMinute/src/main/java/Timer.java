/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zac
 */
public class Timer {
    private int hundredths;
    private int seconds;
    
    public Timer(){
        this.hundredths = 0;
    }
    
    public void advance(){
        this.hundredths = hundredths + 1;
        if(this.hundredths == 100){
            this.hundredths = 0;
            this.seconds = this.seconds + 1;
        }
        if(this.seconds > 59){
            this.seconds = 0;
        }
    }
    
    public String toString(){
        String tensPlace = "";
        String hundPlace = "";
        if(this.seconds < 10){
            tensPlace = "0";
        }
        if(this.hundredths < 10){
            hundPlace = "0";
        }
        return tensPlace + this.seconds + ":" + hundPlace + this.hundredths;
    }
}
