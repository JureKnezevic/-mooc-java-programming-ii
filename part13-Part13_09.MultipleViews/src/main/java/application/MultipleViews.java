package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class MultipleViews extends Application {

    @Override
    public void start(Stage windows) {

        Button first = new Button("To the second view!");
        Button second = new Button("To the third view!");
        Button third = new Button("To the first view!");

        Label prvy = new Label("First view!");
        Label drugy = new Label("Second view!");
        Label trecy = new Label("Third view!");

        BorderPane prvi = new BorderPane();
        VBox drugi = new VBox();
        GridPane treci = new GridPane();

        prvi.setTop(prvy);
        prvi.setCenter(first);
        
        drugi.getChildren().addAll(second, drugy);
        
        treci.add(trecy, 0, 0);
        treci.add(third, 1, 1);
        
        Scene prva = new Scene(prvi);
        Scene druga = new Scene(drugi);
        Scene treca = new Scene(treci);

        first.setOnAction((event) -> {
            windows.setScene(druga);
        });
        
        second.setOnAction((event) -> {
            windows.setScene(treca);
        });
        
        third.setOnAction((event) -> {
            windows.setScene(prva);
        });


        windows.setScene(prva);
        windows.show();

    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
