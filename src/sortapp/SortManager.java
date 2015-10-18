package sortapp;

import java.util.Random;
import sortapp.sorting.BubbleSort;
import sortapp.sorting.InsertSort;
import sortapp.sorting.QuickSort;

/**
 *
 * @author mh
 */
public class SortManager {

    private int[] data;

    public SortManager(int dataLength) {
        this.setDataAndFill(dataLength);
    }

    public void run() {
        this.initBubbleSort();
        this.initInsertSort();
        this.initQuickSort();
    }

    private void initBubbleSort() {
        System.out.println("--- bubble sort ---");
        this.printData();
        BubbleSort bubble = new BubbleSort(this.data);
        bubble.sort();
        bubble.printSortedArray();
        bubble.printTime();
    }

    private void initQuickSort() {
        System.out.println("--- quick sort ---");
        this.printData();
        QuickSort quicksort = new QuickSort(this.data);
        quicksort.sort();
        quicksort.printSortedArray();
        quicksort.printTime();
    }

    private void initInsertSort() {
        System.out.println("--- insert sort ---");
        this.printData();
        InsertSort insertsort = new InsertSort(this.data);
        insertsort.sort();
        insertsort.printSortedArray();
        insertsort.printTime();
    }

    private void setDataAndFill(int length) {
        this.data = new int[length];
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            this.data[i] = rand.nextInt(10000);
        }
    }

    public void printData() {
        System.out.println("Dane przed posortowaniem:");
        for (int i : this.data) {
            System.out.print(i + " ");
        }
        System.out.println("---");
    }

}
