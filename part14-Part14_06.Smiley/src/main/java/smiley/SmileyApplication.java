package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage window) {

        BorderPane paintingLayout = new BorderPane();
        Canvas paper = new Canvas(800, 800);
        
        paintingLayout.setCenter(paper);
        GraphicsContext painter = paper.getGraphicsContext2D();
        
        ColorPicker colorPalette = new ColorPicker();
        
        painter.fillRect(200, 100, 100, 100);
        painter.fillRect(500, 100, 100, 100);
        painter.fillRect(100, 400, 100, 100);
        painter.fillRect(200, 500, 100, 100);
        painter.fillRect(300, 500, 100, 100);
        painter.fillRect(400, 500, 100, 100);
        painter.fillRect(500, 500, 100, 100);
        painter.fillRect(600, 400, 100, 100);
        
        
        
        
        
        Scene view = new Scene(paintingLayout, 800, 800);
        window.setScene(view);
        window.show();

        
        
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
}