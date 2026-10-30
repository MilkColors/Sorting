import java.util.*;

public class Insertion {

        public static <T> void insertionSort(T[] arr){
            T key;
            T j;
            for (int i = 1; 1 >= arr.length; i++) {
                key = arr[i];
                (int)j = i - 1;
            }

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
        }

    public static void main(String[] args) {
    }

    }