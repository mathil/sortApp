/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortapp.sorting;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author mh
 */
public class Sort {

    protected int[] data;

    protected long time;

    private Date startTime;

    private Date endTime;

    public Sort(int[] data) {
        this.data = data;
    }

    ;
    
    public int[] getSortedArray() {
        return this.data;
    }

    public void printSortedArray() {
        System.out.println("");
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    protected void setStartTime() {
        this.startTime = new Date();
    }

    protected void setEndTime() {
        this.endTime = new Date();
    }

    protected void setTime() {
        this.time = this.endTime.getTime() - this.startTime.getTime();
    }

    public void printTime() {
        System.out.println("czas: " + this.time);
    }

}
