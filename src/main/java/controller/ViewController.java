package controller;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Slider;
import model.*;
import model.Algorithm;
import model.algorithms.BubbleSort;
import model.algorithms.InsertionSort;
import model.algorithms.QuickSort;

import java.util.ArrayList;

/**
 * Main controller of view.fxml. Controls the buttons and the barchart using data
 * from the model package in this MVC structure.
 */
public class ViewController {

    @FXML
    NumberAxis xAxis;

    @FXML
    CategoryAxis yAxis;

    @FXML
    BarChart<String, Number> barChart;

    @FXML
    Slider valueSlider;

    @FXML
    Slider intervalSlider;

    private Algorithm algorithm;

    /**
     * When invoked, the program uses BubbleSort as sorting algorithm
     */
    public void bubbleSortPressed() {
        ArrayList<Integer> list = getDataFromCurrentState();
        algorithm = new BubbleSort(list);
    }

    /**
     * When invoked, the program uses InsertionSort as sorting algorithm
     */
    public void insertionSortPressed() {
        ArrayList<Integer> list = getDataFromCurrentState();
        algorithm = new InsertionSort(list);

    }

    /**
     * When invoked, the program uses QuickSort as sorting algorithm
     */
    public void quickSortPressed() {
        ArrayList<Integer> list = getDataFromCurrentState();
        algorithm = new QuickSort(list);

    }

    /**
     * When invoked, the program performs 1 step of the selected sorting algorithm
     * als returns the result to the BarChart in the GUI
     */
    public void stepButtonPressed() {
        algorithm.step();
        updateGraph();

    }

    /**
     * Resets Barchart values for new random ones and gives the ability to choose another
     * sorting algorithm
     */
    public void resetButtonPressed() {
        barChart.getData().clear();
        barChart.getData().add(BarChartGenerator.newBarChartSeries(valueSlider.getValue()));
        algorithm = null;
    }

    /**
     * When invoked the values on the BarChart will be fully sorted using the specified algorithm.
     */
    public void sortButtonPressed() {
        new Thread(() -> {
            while (!algorithm.isSorted()) {
                try {
                    Thread.sleep((long)intervalSlider.getValue());
                    Platform.runLater(() -> {
                        algorithm.step();
                        updateGraph();
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    /**
     * Converts the current data in the BarChart to an ArrayList to be used in the sorting
     * algorithms to sort.
     *
     * @return listOfAxisData
     */
    public ArrayList<Integer> getDataFromCurrentState() {
        ArrayList<Integer> listOfAxisData = new ArrayList<>();
        XYChart.Series<String, Number> serieData = barChart.getData().get(0);
        ObservableList<XYChart.Data<String, Number>> axisNumbers = serieData.getData();
        for (XYChart.Data<String, Number> data : axisNumbers) {
            listOfAxisData.add((Integer) data.getYValue());
        }
        return listOfAxisData;
    }

    /**
     * Returns partly sorted data from the model to the view.
     */
    public void updateGraph() {
        barChart.getData().clear();
        ArrayList<Integer> newData = algorithm.step();
        XYChart.Series newBarChartValues = new XYChart.Series();
        for (int i = 0; i < newData.size(); i++) {
            newBarChartValues.getData().add(new XYChart.Data("" + (i + 1), newData.get(i)));
        }
        barChart.getData().add(newBarChartValues);
    }
}
