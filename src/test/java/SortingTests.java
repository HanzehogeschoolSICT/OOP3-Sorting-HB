import model.algorithms.BubbleSort;
import model.algorithms.InsertionSort;
import model.algorithms.QuickSort;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by Henk Bourgonje on 19/03/2017.
 */
public class SortingTests {
    private static BubbleSort bubbleSort;
    private static QuickSort quickSort;
    private static InsertionSort insertionSort;
    private static ArrayList<Integer> listToSort;
    private static ArrayList<Integer> sortedList;


    @BeforeClass
    public static void initialization() {
        // Make unsorted list.
        listToSort = new ArrayList<>();
        listToSort.add(7);
        listToSort.add(5);
        listToSort.add(12);
        listToSort.add(4);
        listToSort.add(1);
        listToSort.add(8);
        listToSort.add(3);

        // Make same list sorted to assert them.
        sortedList = new ArrayList<>();
        sortedList.add(1);
        sortedList.add(3);
        sortedList.add(4);
        sortedList.add(5);
        sortedList.add(7);
        sortedList.add(8);
        sortedList.add(12);
    }

    /**
     * Tests if BubbleSort sorts the ArrayList well.
     *
     * @throws Exception
     */
    @Test
    public void testBubbleSort() throws Exception {
        try {
            bubbleSort = new BubbleSort(listToSort);

            while (!bubbleSort.isSorted()) {
                bubbleSort.step();
            }

            assertEquals(listToSort, sortedList);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Tests if QuickSort sorts the ArrayList well.
     *
     * @throws Exception
     */
    @Test
    public void testQuickSort() throws Exception {
        try {
            quickSort = new QuickSort(listToSort);

            while (!quickSort.isSorted()) {
                quickSort.step();
            }

            assertEquals(listToSort, sortedList);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Tests if InsertionSort sorts the ArrayList well.
     *
     * @throws Exception
     */
    @Test
    public void testInsertionSort() throws Exception {
        try {
            insertionSort = new InsertionSort(listToSort);

            while (!insertionSort.isSorted()) {
                quickSort.step();
            }

            assertEquals(listToSort, sortedList);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
