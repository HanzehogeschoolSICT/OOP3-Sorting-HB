import jdk.nashorn.internal.runtime.ECMAException;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by henkbourgonje on 08/03/2017.
 */
public class MainTest {
    private static Main main;

    @BeforeClass
    public static void initialization(){
        main = new Main();
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
            ArrayList<Integer> listZeroTest = main.generateValues(0);
            assertEquals(initList, listZeroTest);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Tests several aspects of the BubbleSort algorithm
     * @throws Exception
     */
    @Test
    public void testBubbleSort() throws Exception {
        try {
            ArrayList<Integer> initList = main.generateValues(20);

            //Test if length is correct
            ArrayList<Integer> listToBubble = main.generateValues(20);
            main.bubbleSort(listToBubble);
            assertEquals(initList.size(), listToBubble.size());
            

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}