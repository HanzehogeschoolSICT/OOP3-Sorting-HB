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
     * Performs 1 step of the InsertionSort Algorithm  * @return partly sorted ArrayList
     * Used Georg Groenendaal's implementation of this algorithm in a small degree for inspiration to
     * complete the task.
     */
    @Override
    public ArrayList<Integer> step() {
        if (lengthOfList == sortingPosition) {
            isSorted = true;
        } else {
            for (int i = 0; i < sortingPosition; i++) {
                int temp = listToSort.get(sortingPosition);

                if (temp < listToSort.get(i)) {
                    listToSort.remove(sortingPosition);
                    listToSort.add(i, temp);
                    break;
                }
            }
            sortingPosition++;
        }
        return listToSort;
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
