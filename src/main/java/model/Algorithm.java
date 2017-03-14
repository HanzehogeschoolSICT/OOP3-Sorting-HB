package model;

import java.util.ArrayList;

public interface Algorithm {

    /**
     * Performs 1 step int the specifies sorting algorithm, is implemented in the
     * sorting algorithm classes.
     * @return partly sorted ArrayList.
     */
    ArrayList<Integer> step();

    boolean isSorted();


}
