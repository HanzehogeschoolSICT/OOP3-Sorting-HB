import model.BarChartGenerator;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by henkbourgonje on 08/03/2017.
 */
public class DataGenerationTest {
    private static BarChartGenerator bCG;

    @BeforeClass
    public static void initialization() {
        bCG = new BarChartGenerator();

    }

    /**
     * Tests if the arraylists are empty when created, like they should be.
     *
     * @throws Exception
     */
    @Test
    public void generateValues() throws Exception {
        try {
            ArrayList<Integer> initList = new ArrayList<>();

            //Test with 0
            ArrayList<Integer> listZeroTest = bCG.generateValues(0);
            assertEquals(initList, listZeroTest);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}