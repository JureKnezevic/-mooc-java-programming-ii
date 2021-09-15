package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    @Override
    public void start(Stage stage) {

        //setting up basic layout and components
        BorderPane layout = new BorderPane();

        //line chart
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        LineChart chartLines = new LineChart(xAxis, yAxis);
        chartLines.setLegendVisible(false);

        //layout for sliders
        VBox topPart = new VBox();
        topPart.setSpacing(10);
        topPart.setPadding(new Insets(10, 10, 10, 10));
        BorderPane months = new BorderPane();
        months.setPadding(new Insets(10, 10, 10, 10));
        BorderPane rates = new BorderPane();
        rates.setPadding(new Insets(10, 10, 10, 10));

        //components of sliders
        Label monthly = new Label("Monthly savings");
        Label rate = new Label("Yearly interest rate");

        Slider monthlySlider = new Slider(25, 250, 50);
        monthlySlider.setShowTickMarks(true);
        monthlySlider.setShowTickLabels(true);
        monthlySlider.setMajorTickUnit(25);
        monthlySlider.setSnapToTicks(false);

        Slider rateSlider = new Slider(0, 10, 0);
        rateSlider.setShowTickMarks(true);
        rateSlider.setShowTickLabels(true);
        rateSlider.setMajorTickUnit(10);
        rateSlider.setSnapToTicks(false);
        
        
        XYChart.Series data1 = new XYChart.Series();
        XYChart.Series data2 = new XYChart.Series();
        chartLines.getData().add(data1);
        chartLines.getData().add(data2);

        Label amountMonthly = new Label(String.valueOf(monthlySlider.getValue()));
        Label amountRate = new Label(String.valueOf(rateSlider.getValue()));
        
        monthlySlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            data1.getData().clear();
            
            amountMonthly.setText(String.valueOf(newValue));
            
            Double value = 0.0;

            for (int i = 0; i <= 30; i++) {

                data1.getData().add(new XYChart.Data(i, value));
                if (i != 30) {
                    value = value + ((Double) newValue * 12);
                }

            }
            rateSlider.valueProperty().addListener((observable2, oldValue2, newValue2) -> {
                data2.getData().clear();
                
                amountRate.setText(String.valueOf(newValue2));
                
                Double value2 = 0.0;
                Double percentage = (Double) (newValue2)/ 100 + 1;

                for (int i = 0; i <= 30; i++) {
                    
                    data2.getData().add(new XYChart.Data(i, value2));
                    if (i != 30) {
                       value2 = ((value2 + ((Double) newValue * 12)) * percentage); 
                    }
                }
            });
        });
        
        //adding slider components to borderpane layouts
        months.setLeft(monthly);
        months.setCenter(monthlySlider);
        months.setRight(amountMonthly);

        rates.setLeft(rate);
        rates.setCenter(rateSlider);
        rates.setRight(amountRate);

        //adding borderpane layouts to the top VBox
        topPart.getChildren().addAll(months, rates);

        //
        layout.setTop(topPart);
        layout.setCenter(chartLines);

        //display window
        Scene view = new Scene(layout, 640, 480);
        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

}
