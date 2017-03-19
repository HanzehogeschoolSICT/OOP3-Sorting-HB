package model;

import java.util.ArrayList;

public interface Algorithm {

    /**
     * Performs 1 step int the specifies sorting algorithm, is implemented in the
     * sorting algorithm classes.
     *
     * @return partly sorted ArrayList.
     */
    ArrayList<Integer> step();

    /**
     * Boolean method that checks if values are already sorted. Mainly used to stop threads from running after the "Sort"
     * button is pressed.
     * @return true if sorted
     */
    boolean isSorted();


}
