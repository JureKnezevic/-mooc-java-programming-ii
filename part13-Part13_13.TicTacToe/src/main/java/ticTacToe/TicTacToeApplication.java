package ticTacToe;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    private int turn = 0;
    private Label turnLabel = new Label("");
    private GridPane buttonGrid;

    @Override
    public void start(Stage window) {

        //setting basic stuff
        turn = 0;
        BorderPane layout = new BorderPane();

        //setting turn text indicator
        turnLabel.setText("Turn: " + getTurn());
        turnLabel.setFont(Font.font("Monospaced", 40));
        layout.setTop(turnLabel);

        //setting buttons
        buttonGrid = new GridPane();
        for (int i = 0; i <= 2; i++) {
            for (int n = 0; n <= 1; n++) {
                buttonGrid.addRow(n, createButton());
            }
            buttonGrid.addColumn(i, createButton());
        }
        buttonGrid.setAlignment(Pos.CENTER);
        buttonGrid.setVgap(10);
        buttonGrid.setHgap(10);
        buttonGrid.setPadding(new Insets(10, 10, 10, 10));
        layout.setCenter(buttonGrid);

        //setting the scene
        Scene view = new Scene(layout);

        //Show the application
        window.setScene(view);
        window.show();

    }

    private Button createButton() {

        Button btn = new Button(" ");
        btn.setFont(Font.font("Monospaced", 40));

        btn.setOnAction((event) -> {
            if (!turnLabel.getText().contains("end")) {
                btn.setText(playTurn(btn));
                checkIfCompleted(buttonGrid);
            }
        });

        return btn;
    }

    private String playTurn(Button btn) {

        Button current = btn;

        if (checkIfTaken(current)) {
            String string = getTurn();
            turn++;

            turnLabel.setText("Turn: " + getTurn());

            return string;
        }

        return current.getText();
    }

    private String getTurn() {

        String symbol = "";
        if (turn % 2 == 0) {
            symbol = "X";
        } else if (turn % 2 == 1) {
            symbol = "O";
        }
        return symbol;
    }

    private boolean checkIfTaken(Button btn) {

        Button checkButton = btn;
        if (checkButton.getText().equals("X") || checkButton.getText().equals("O")) {
            return false;
        } else {

            return true;
        }
    }

    private void checkIfCompleted(GridPane btn) {
        checkIfCompletedColumn(btn);
        checkIfCompletedRow(btn);
        checkIfCompletedDiag(btn);

    }

    private void checkIfCompletedColumn(GridPane btn) {

        for (int i = 0; i < 9; i = i + 3) {

            String button1 = textSorter(btn.getChildren().get(0 + i).toString());
            String button2 = textSorter(btn.getChildren().get(1 + i).toString());
            String button3 = textSorter(btn.getChildren().get(2 + i).toString());
            
            if (!button1.equals(" ") && !button2.equals(" ") && !button1.equals(" ")) {
                if (button1.equals(button2) && button2.equals(button3)) {
                    if (button1.equals("X")) {
                        turnLabel.setText("X wins!");
                    } else {
                        turnLabel.setText("O wins!");
                    }
                    
                }
            }
        }
    }

    private void checkIfCompletedRow(GridPane btn) {

        for (int i = 0; i < 3; i = i + 1) {

            String button1 = textSorter(btn.getChildren().get(0 + i).toString());
            String button2 = textSorter(btn.getChildren().get(3 + i).toString());
            String button3 = textSorter(btn.getChildren().get(6 + i).toString());

            if (!button1.equals(" ") && !button2.equals(" ") && !button1.equals(" ")) {
                if (button1.equals(button2) && button2.equals(button3)) {
                    if (button1.equals("X")) {
                        turnLabel.setText("X wins!");
                    } else {
                        turnLabel.setText("O wins!");
                    }
                    
                }
            }
        }
    }

    private void checkIfCompletedDiag(GridPane btn) {

        String button1 = textSorter(btn.getChildren().get(0).toString());
        String button2 = textSorter(btn.getChildren().get(4).toString());
        String button3 = textSorter(btn.getChildren().get(8).toString());

        if (!button1.equals(" ") && !button2.equals(" ") && !button1.equals(" ")) {
            if (button1.equals(button2) && button2.equals(button3)) {
                if (button1.equals("X")) {
                        turnLabel.setText("X wins!");
                    } else {
                        turnLabel.setText("O wins!");
                    }
            }
        }
        
        button1 = textSorter(btn.getChildren().get(2).toString());
        button2 = textSorter(btn.getChildren().get(4).toString());
        button3 = textSorter(btn.getChildren().get(6).toString());
        
        if (!button1.equals(" ") && !button2.equals(" ") && !button1.equals(" ")) {
            if (button1.equals(button2) && button2.equals(button3)) {
                if (button1.equals("X")) {
                        turnLabel.setText("X wins!");
                    } else {
                        turnLabel.setText("O wins!");
                    }
            }
        }
    }

    private String textSorter(String text) {

        if (text.contains("'X'")) {
            return "X";
        } else if (text.contains("'O'")) {
            return "O";
        }
        return " ";
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
}
