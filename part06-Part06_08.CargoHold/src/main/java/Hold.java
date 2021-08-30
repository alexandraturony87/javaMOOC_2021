import java.util.ArrayList;

public class Hold {
    
    private int totalWeight = 0;
    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        
        int totalWeight = suitcase.totalWeight();
        for(Suitcase per: this.suitcases){
            totalWeight = totalWeight + per.totalWeight();
        }
        if(totalWeight <= this.maxWeight){
            this.suitcases.add(suitcase);
            totalWeight = totalWeight + suitcase.totalWeight();
        }
    }
    
    public void printItems(){
        System.out.println("The suitcases in the hold contain the following items:");
        for(Suitcase suitcase: suitcases){
            suitcase.holdPrint();
        }
        
    }
    
    public String toString(){
        
        for(Suitcase suitcase: suitcases){
            this.totalWeight = this.totalWeight + suitcase.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
    }
}
