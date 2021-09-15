package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application{

    @Override
    public void start(Stage window) throws Exception {
        
        // components
        
        Label inputDescription = new Label("Enter your name and start.");
        TextField user = new TextField();
        Label greeting = new Label ("Welcome ");
        Button start = new Button("Start");
        
        
        //first layout
        
        GridPane intro = new GridPane();
        
        intro.add(inputDescription, 0, 0);
        intro.add(user, 0, 1);
        intro.add(start, 0, 2);
        
        intro.setPrefSize(300, 200);
        intro.setAlignment(Pos.CENTER);
        intro.setVgap(10);

        //second layout
        
        GridPane welcome = new GridPane();
        
        welcome.add(greeting, 0, 0);
        
        welcome.setPrefSize(300, 200);
        welcome.setAlignment(Pos.CENTER);
        
        //setting scene and window
        
        Scene userView = new Scene(intro);
        Scene greetingView = new Scene(welcome);
        
        //button functionality
        
        start.setOnAction((event) -> {
            greeting.setText(greeting.getText() + user.getText() + "!");
            window.setScene(greetingView);
            });
        
        //window
        
        window.setScene(userView);
        window.show();
        
    }
    
    public static void main(String[] args) {
        launch(GreeterApplication.class);
    } 
}
