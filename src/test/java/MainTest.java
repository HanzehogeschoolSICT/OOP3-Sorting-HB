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

            //Test with negative integers
            ArrayList<Integer> listNegativeTest = main.generateValues(-1);
            assertEquals(initList, listNegativeTest);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}