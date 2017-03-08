import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by henkbourgonje on 08/03/2017.
 */
public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.generateValues(0));
        System.out.println(main.generateValues(10));
        System.out.println(main.generateValues(100));

    }

    /**
     * Generates and returns an ArrayList with randomly sorted values from 0 to maxIndex.
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
     * @param listToSort
     * @return sorted ArrayList
     */
//    public ArrayList<Integer> bubbleSort(ArrayList<Integer> listToSort) {
//        for (int j = 0; j < listToSort.size(); j++) {
//            for (int i = 1; i < listToSort.size() - j; i++) {
//
//            }
//        }
//        return listToSort;
//    }


}
