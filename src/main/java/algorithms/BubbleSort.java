package algorithms;

import java.util.ArrayList;

/**
 * Created by henkbourgonje on 08/03/2017.
 */
public class BubbleSort {

    /**
     * Sorting the ArrayList using the algorithms.BubbleSort algorithm.
     *
     * @param listToSort
     * @return sorted ArrayList
     */
    public ArrayList<Integer> bubbleSort(ArrayList<Integer> listToSort) {
        for (int i = 0; i < listToSort.size(); i++) {
            for (int j = i + 1; j < listToSort.size(); j++) {
                if (listToSort.get(i) > listToSort.get(j)) {
                    int temporary = listToSort.get(i);
                    listToSort.set(i, listToSort.get(j));
                    listToSort.set(j, temporary);
                }
            }
        }
        return listToSort;
    }

    //Testing out custom step method, not even remotely finished
    public ArrayList<Integer> step(ArrayList<Integer> listToSort) {
        int n = 0;

        if (listToSort.get(n) > listToSort.get(n + 1)) {
            int temporary = listToSort.get(n);
            listToSort.set(n, listToSort.get(n + 1));
            listToSort.set(n + 1, temporary);
            n += 1;
        }
        return listToSort;
    }



}
