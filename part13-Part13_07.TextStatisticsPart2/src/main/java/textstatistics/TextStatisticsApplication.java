package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) throws Exception {
        BorderPane layout = new BorderPane();
        
        TextArea textArea = new TextArea();
        
        int lettersCount = 0;
        Label letters = new Label("Letters: " + Integer.valueOf(lettersCount));
        
        int wordsCount = 0;
        Label words = new Label("Words: " + Integer.valueOf(lettersCount));
        
        Label longest = new Label("The longest word is:");
        
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            
            int letterCount = newValue.length();
            letters.setText("Letters: " + letterCount);
            String[] parts = newValue.split(" ");
            int wordCount = parts.length;
            words.setText("Words: " + wordCount);
            String longestWord = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();
            longest.setText("The longest word is: " + longestWord);
            
        });
        
        HBox text = new HBox();
        text.setSpacing(10);
        text.getChildren().add(letters);
        text.getChildren().add(words);
        text.getChildren().add(longest);

        layout.setCenter(textArea);
        layout.setBottom(text);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
}