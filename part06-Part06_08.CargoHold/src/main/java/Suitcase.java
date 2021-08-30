import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item){
        int totalWeight = item.getWeight();
        for(Item per: this.items){
            totalWeight = totalWeight + per.getWeight();
        }
        if(totalWeight <= this.maxWeight){
            this.items.add(item);
            totalWeight = totalWeight + item.getWeight();
        }
    }
    
    public void printItems(){
        System.out.println("The suitcase contains the following items:");
        for(Item item: this.items){
            System.out.println(item.getName() + " (" + item.getWeight() + " kg");
        }
    }
    
    public void holdPrint(){
        for(Item item: this.items){
            System.out.println(item.getName() + " (" + item.getWeight() + " kg");
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Item item: this.items){
            totalWeight = totalWeight + item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        
        Item toReturn = this.items.get(0);
        
        for(Item per: this.items){
            if(toReturn.getWeight() <= per.getWeight()){
                toReturn = per;
            }
        }
        return toReturn;
    }
    
    public String toString(){
        if(this.items.size() == 0){
            return "no items (" + totalWeight() + " kg)";
        }else if(this.items.size() == 1){
            return this.items.size() + " item (" + totalWeight() + " kg)";
        }else{
            return this.items.size() + " items (" + totalWeight() + " kg)";
        }
    }
}
