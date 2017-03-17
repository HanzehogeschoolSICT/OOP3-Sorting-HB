package model.algorithms;

import model.Algorithm;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Quicksort subclass of the Algorithm interface. Peforms 1 step of the iterative version
 * of the Quicksort algorithm.
 * <p>
 * This implementation is based on code and information from the following links:
 * - http://javarevisited.blogspot.nl/2016/09/iterative-quicksort-example-in-java-without-recursion.html
 * - http://www.geeksforgeeks.org/iterative-quick-sort/
 */

public class QuickSort implements Algorithm {

    private ArrayList<Integer> listToSort;
    private Stack<Integer> stack;
    private boolean isSorted;

    private int first;
    private int second;

    public QuickSort(ArrayList<Integer> list) {
        stack = new Stack<>();
        isSorted = false;
        listToSort = list;

        //Initialize values
        first = 0;
        second = list.size() - 1;

        //Initialize values to the stack
        stack.add(first);
        stack.add(second);
    }

    /**
     * Performs 1 step of the QuickSort algorithm
     *
     * @return partly sorted listToSort ArrayList
     */
    @Override
    public ArrayList<Integer> step() {

        //When stack is empty, returns true to stop the Thread.
        if (stack.isEmpty()) {
            isSorted = true;

            //When not empty, start the process over again.
        } else {
            second = stack.pop();
            first = stack.pop();

            //Set pivot
            int pivot = partition(listToSort, first, second);

            if (pivot - 1 > first) {
                stack.push(first);
                stack.push(pivot - 1);
            }

            if (pivot + 1 < second) {
                stack.push(pivot + 1);
                stack.push(second);
            }
        }
        return listToSort;
    }

    /**
     * Generate new pivot and swap values accordingly.
     *
     * @param list ArrayList to work with
     * @param low  lowest point from stack
     * @param high highest point from stack
     * @return new pivot
     */
    int partition(ArrayList<Integer> list, int low, int high) {
        int x = list.get(high); //TODO Middle pivot for better efficiency
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (list.get(j) <= x) {
                i++;
                swap(i, j);
            }
        }
        swap(i + 1, high);
        return i + 1;
    }

    /**
     * Swap the two specified indexes.
     *
     * @param firstIndex
     * @param secondIndex
     * @return listToSort with the two specified indexes swapped.
     */
    public ArrayList<Integer> swap(int firstIndex, int secondIndex) {
        int temp = listToSort.get(firstIndex);
        listToSort.set(firstIndex, listToSort.get(secondIndex));
        listToSort.set(secondIndex, temp);
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