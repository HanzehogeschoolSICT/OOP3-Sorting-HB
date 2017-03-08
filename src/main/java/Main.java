import java.util.ArrayList;

import algorithms.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Created by henkbourgonje on 08/03/2017.
 */
public class Main extends Application {

    private static BubbleSort bubbleSort = new BubbleSort();
    private static ArrayList<Integer> list = new ArrayList<>();
    private static Data data = new Data();

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
        primaryStage.setTitle("Sorting");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
