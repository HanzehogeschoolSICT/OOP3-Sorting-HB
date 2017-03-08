import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by henkbourgonje on 08/03/2017.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        ArrayList<Integer> toSort = main.generateValues(20);

        System.out.println(toSort);
        System.out.println(main.bubbleSort(toSort));
    }

    /**
     * Generates and returns an ArrayList with randomly sorted values from 0 to maxIndex.
     *
     * @param maxIndex
     * @return shuffled ArrayList
     */
    public ArrayList<Integer> generateValues(int maxIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < maxIndex; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list;
    }

    /**
     * Sorting the ArrayList using the BubbleSort algorithm.
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
}
