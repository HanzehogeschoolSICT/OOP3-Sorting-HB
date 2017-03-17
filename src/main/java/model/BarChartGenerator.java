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
     * @param value
     */
    public static XYChart.Series newBarChartSeries(double value) {

        ArrayList<Integer> list = generateValues(value);
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
    public static ArrayList<Integer> generateValues(double maxIndex) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < maxIndex + 1; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list;
    }
}
