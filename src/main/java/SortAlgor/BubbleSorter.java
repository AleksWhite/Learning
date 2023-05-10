package SortAlgor;

//Сортировка пузырьком

public class BubbleSorter {
    public static void main(String[] args){
        int[] array = {2,9,1,3,6,4,5,8,7};
        sort(array);
    }

    private static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            for (int j = array.length - 1; j > i; j--){
                if (array[j - 1] > array[j]){
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(array[i]);
        }
    }
}
