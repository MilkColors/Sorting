import java.util.*;

public class Insertion {


    public static <T extends Comparable<T>> void Sort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T answer = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(answer) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = answer;
        }
    }

    public static <T extends Comparable<T>> void Sort(ArrayList<T> arr) {
        for (int i = 1; i < arr.size(); i++) {
            T answer = arr.get(i);
            int j = i - 1;

        while (j >= 0 && arr.get(j).compareTo(answer) > 0) {
            arr.set((j + 1), arr.get(j));
            j--;
        }
        arr.set(j + 1, answer);
    }

    public static void main(String[] args) {
    }
        System.out.println("Hello Mr Goldstein!");
    }