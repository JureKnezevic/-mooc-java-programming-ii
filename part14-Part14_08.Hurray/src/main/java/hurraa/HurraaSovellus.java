package hurraa;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.AudioClip;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class HurraaSovellus extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane pane = new BorderPane();
        
        AudioClip sound = new AudioClip("file:bell.wav");

        Button nappi = new Button("Hurraa!");
        nappi.setOnAction((event) -> sound.play());
        pane.setCenter(nappi);


        Scene scene = new Scene(pane, 600, 400);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
