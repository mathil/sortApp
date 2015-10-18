package sortapp;

import java.util.Random;

import sortapp.sorting.BubbleSort;
import sortapp.sorting.QuickSort;

/**
 *
 * @author mh
 */
public class SortApp {

    private static int[] data;

    public static void main(String[] args) {
        setDataAndFill(200);
        
        initBubbleSort();
        initQuickSort();
    }

    private static void initBubbleSort() {
        BubbleSort bubble = new BubbleSort(data);
        bubble.sort();
        bubble.printSortedArray();
        bubble.printTime();
    }

    private static void initQuickSort() {
        QuickSort quicksort = new QuickSort(data);
        quicksort.sort();
        quicksort.printSortedArray();
        quicksort.printTime();
    }

    public static void setDataAndFill(int length) {
        Random rand = new Random();
        data = new int[length];
        for (int i = 0; i < 200; i++) {
            data[i] = rand.nextInt(10000);
        }
    }

}
