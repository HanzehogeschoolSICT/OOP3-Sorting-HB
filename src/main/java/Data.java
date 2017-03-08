import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by henkbourgonje on 08/03/2017.
 */
public class Data {

    /**
     * Function that returns an ArrayList filled with random ints 0 to maxIndex.
     *
     * @param maxIndex the max length of the returned arrayList
     * @return random ArrayList
     */
    public ArrayList<Integer> generateValues(int maxIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < maxIndex; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list;
    }
}
