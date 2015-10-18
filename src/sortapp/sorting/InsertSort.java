/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortapp.sorting;

/**
 *
 * @author mh
 */
public class InsertSort extends Sort implements SortingInterface {

    public InsertSort(int[] data) {
        super(data);
    }

    @Override
    public void sort() {
        this.setStartTime();
        this.insertSort();
        this.setEndTime();
        this.setTime();
    }

    private void insertSort() {
        int[] sortedData = new int[this.data.length];
        for (int i = 2; i < this.data.length; i++) {
            int key = this.data[i];
            sortedData[i] = this.data[i];
            int j = i - 1;
            while (j > 0 && this.data[j] > key) {
                this.data[+1] = this.data[j];
                this.data[j] = key;
                j = j - 1;
            }
        }
    }

}
