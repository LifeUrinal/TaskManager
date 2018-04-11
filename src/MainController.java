import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.Parent;

public class MainController extends Application implements EventHandler<ActionEvent> {

    @FXML Button addTask;
    @FXML TextField title, description;
    @FXML ListView<Task> tasks = new ListView<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setTitle("TM by Life Urinal");
        primaryStage.setScene(scene);
        primaryStage.show();

        addTask = new Button();
        addTask.setOnAction(this);
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource()==addTask) {
            System.out.println("fuck");
        }
    }
}
