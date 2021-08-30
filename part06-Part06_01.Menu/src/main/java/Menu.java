
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    public void addMeal(String meal){
        if(meals.contains(meal)){
            System.out.println("We already have that on the menu.");
        }else{
            this.meals.add(meal);
        }
    }
    
    public void printMeals(){
        for(String meal: this.meals){
            System.out.println(meal);
        }       
    }
    
    public void clearMenu(){
        this.meals.clear();
    }
}
