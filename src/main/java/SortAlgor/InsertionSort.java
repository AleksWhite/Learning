package SortAlgor;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2, 9, 1, 3, 6, 4, 5, 8, 7};
        sort(array);
    }
    public static void sort(int[] array){
        int j;
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            for (j = i; j > 0 && temp < array[j - 1]; j--){
                array[j] = array[j - 1];
            }
            array[j] = temp;
        }
    }
}