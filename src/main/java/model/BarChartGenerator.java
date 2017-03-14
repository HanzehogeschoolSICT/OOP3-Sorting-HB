package model;

import javafx.scene.chart.XYChart;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by henkbourgonje on 09/03/2017.
 */
public class BarChartGenerator {

    /**
     * Transfers random ArrayList to XYCHart to be user for the values of the BarChart.
     *
     * @return barChartValues
     */
    public static XYChart.Series newBarChartSeries() {
        ArrayList<Integer> list = generateValues(20); //TODO Make maxIndex choosable by user
        XYChart.Series barChartValues = new XYChart.Series();

        for (int n = 0; n < list.size(); n++) {
            barChartValues.getData().add(new XYChart.Data("" + (n + 1), list.get(n)));
        }
        return barChartValues;
    }

    /**
     * Generates random values to put in ArrayList used by BarChart.
     *
     * @param maxIndex
     * @return Random ArrayList
     */
    public static ArrayList<Integer> generateValues(int maxIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < maxIndex; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list;
    }
}
