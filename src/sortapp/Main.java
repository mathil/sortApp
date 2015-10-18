package sortapp;

import sortapp.SortManager;

/**
 *
 * @author mh
 */
public class Main {

    public static void main(String[] args) {
        SortManager sortManager = new SortManager(20000);
        sortManager.run();
    }

}
