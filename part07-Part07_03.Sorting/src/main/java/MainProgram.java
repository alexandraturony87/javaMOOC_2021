import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {-1, 6, 9, 8, 12};
        System.out.println(indexOfSmallestFrom(array, 2));
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
                
        for(int element: array){
            if(smallest >= element){
                smallest = element;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = Integer.MAX_VALUE;
        int index = Integer.MAX_VALUE;
        
        for(int i = 0; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = Integer.MAX_VALUE;
        int index = Integer.MAX_VALUE;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int temp1 = array[index1];
        int temp2 = array[index2];
        array[index1] = temp2;
        array[index2] = temp1;
    }
    
     public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            swap(array, indexOfSmallestFrom(array, i), i);
        }
    }
}
