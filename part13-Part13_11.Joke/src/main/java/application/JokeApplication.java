package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application{
    
    @Override
    public void start(Stage window) {
            
        BorderPane layout = new BorderPane();
        
        //organizing components
        
        HBox menu = new HBox();
        
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        //components
        
        Button jokeB = new Button("Joke");
        Button ansB = new Button("Answer");
        Button expB = new Button("Explanation");
        
        //adding buttons
        
        menu.getChildren().addAll(jokeB, ansB, expB);
        
        layout.setTop(menu);
        
        //subviews
        
        StackPane joke = createView("What do you call a bear with no teeth?");
        StackPane ans = createView("A gummy bear.");
        StackPane exp = createView("YEET");
        
        //add subviews to buttons
        
        jokeB.setOnAction((event) -> layout.setCenter(joke));
        ansB.setOnAction((event) -> layout.setCenter(ans));
        expB.setOnAction((event) -> layout.setCenter(exp));
        
        
        layout.setCenter(joke);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
    }
    
    private StackPane createView(String text) {
        
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 180);
        layout.getChildren().add(new Label(text));
        layout.setAlignment(Pos.CENTER);

        return layout;
    }

    public static void main(String[] args) {
        launch(JokeApplication.class);
    }

    
}
