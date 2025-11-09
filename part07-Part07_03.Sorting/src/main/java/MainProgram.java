
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] array4 = {5, 6, 5, 8, 12, 3, 6, 9, 15};
        System.out.println(smallest(array4));
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
MainProgram.sort(numbers);
    }
    
    public static int smallest(int [] array){
        int smallest = array[0];
        for (int numer:array){
            if (smallest>numer){
                smallest = numer;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int index = 0;
        for(int i=0; i<array.length; i++){
            if(smallest(array)==array[i]){
                index = i;
            }
        }
        return index;
}
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i=startIndex; i<table.length; i++){
            if (table[i]<smallest){
                smallest = table [i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
}
    public static void sort(int[] array) {
        for (int i=0; i<array.length; i++){
            System.out.println(java.util.Arrays.toString(array));
            swap(array, i, indexOfSmallestFrom(array, i));
        }
}
}
