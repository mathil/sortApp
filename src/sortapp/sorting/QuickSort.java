package sortapp.sorting;

import java.util.Calendar;

/**
 *
 * @author mh
 */
public class QuickSort extends Sort implements SortingInterface {

    public QuickSort(int[] data) {
        super(data);
    }

    @Override
    public void sort() {
        this.setStartTime();
        this.quicksort(0, this.data.length-1);
        this.setEndTime();
        this.setTime();
    }
    
    private void quicksort(int l, int r) {
        if(l < r) {
            int i = this.divideArray(l, r);
            this.quicksort(l, i-1);
            this.quicksort(i+1, r);
        }
    }
    

    private int divideArray(int l, int r) {
        int divideIndex = this.chooseDividePoint(l, r);
        int divideValue = this.data[divideIndex];
        this.replace(divideIndex, r);
        
        int actualPos = l;
        for(int i=l; i < r-1; i++) {
            if(this.data[i] < divideValue) {
                this.replace(i, actualPos);
                actualPos += 1;
            }
        }
        this.replace(actualPos, r);
        return actualPos;
    }

    private int chooseDividePoint(int l, int r) {
        return l + (r-l) % 2;
    }
    
    private void replace(int i1, int i2) {
        int buffer = this.data[i1];
        this.data[i1] = this.data[i2];
        this.data[i2] = buffer;
    }

}
