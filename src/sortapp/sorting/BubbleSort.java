package sortapp.sorting;

import java.util.Calendar;

/**
 *
 * @author mh
 */
public class BubbleSort extends Sort implements SortingInterface {

    public BubbleSort(int[] data) {
        super(data);
    }

    @Override
    public void sort() {
        this.setStartTime();
        this.bubbleSort();
        this.setEndTime();
        this.setTime();
    }
    
    private void bubbleSort() {
        int n = this.data.length;
        do {
            for (int i = 0; i < this.data.length - 1; i++) {
                if (this.data[i] > this.data[i + 1]) {
                    int buffer = this.data[i];
                    this.data[i] = this.data[i + 1];
                    this.data[i + 1] = buffer;
                }
            }
            n -= 1;
        } while (n > 1);
    }

}
