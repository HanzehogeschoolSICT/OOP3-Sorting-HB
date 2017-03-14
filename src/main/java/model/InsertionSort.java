package model;

import java.util.ArrayList;

/**
 * Created by Henk Bourgonje on 14/03/2017.
 */
public class InsertionSort implements Algorithm {

    private int sortingPosition;
    private int lengthOfList;
    private ArrayList<Integer> listToSort;
    private boolean isSorted;

    public InsertionSort(ArrayList<Integer> list) {
        listToSort = list;
        sortingPosition = 0;
        lengthOfList = list.size();
        isSorted = false;
    }

    /**
     * Performs 1 step of the InsertionSort Algorithm
     * @return partly sorted ArrayList
     */
    @Override
    public ArrayList<Integer> step() {
        return null;
    }

    /**
     * Boolean method specifying if BarChart values are sorted or not.
     *
     * @return true when sorted.
     */
    @Override
    public boolean isSorted() {
        return isSorted;
    }
}
