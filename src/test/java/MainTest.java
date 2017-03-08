import algorithms.BubbleSort;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by henkbourgonje on 08/03/2017.
 */
public class MainTest {
    private static BubbleSort bubbleSort;
    private static Data data;

    @BeforeClass
    public static void initialization(){
        data = new Data();
    }

    /**
     * Tests if the arraylists are empty when created, like they should be.
     * @throws Exception
     */
    @Test
    public void generateValues() throws Exception {
        try {
            ArrayList<Integer> initList = new ArrayList<>();

            //Test with 0
            ArrayList<Integer> listZeroTest = data.generateValues(0);
            assertEquals(initList, listZeroTest);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Tests several aspects of the algorithms.BubbleSort algorithm
     * @throws Exception
     */
    @Test
    public void testBubbleSort() throws Exception {
        try {
            ArrayList<Integer> initList = data.generateValues(20);

            //Test if length is correct
            ArrayList<Integer> listToBubble = data.generateValues(20);
            bubbleSort.bubbleSort(listToBubble);
            assertEquals(initList.size(), listToBubble.size());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}