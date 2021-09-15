package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage stage) {

        //create X and Y axes
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();

        //set the title for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");

        //creating line chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");

        //creating data set for the linechart
        XYChart.Series supportData = new XYChart.Series();
        supportData.setName("");
        //adding single data points in the data set
        supportData.getData().add(new XYChart.Data(2007, 73));
        supportData.getData().add(new XYChart.Data(2008, 68));
        supportData.getData().add(new XYChart.Data(2009, 72));
        supportData.getData().add(new XYChart.Data(2010, 72));
        supportData.getData().add(new XYChart.Data(2011, 74));
        supportData.getData().add(new XYChart.Data(2012, 73));
        supportData.getData().add(new XYChart.Data(2013, 76));
        supportData.getData().add(new XYChart.Data(2014, 73));
        supportData.getData().add(new XYChart.Data(2015, 67));
        supportData.getData().add(new XYChart.Data(2016, 56));
        supportData.getData().add(new XYChart.Data(2017, 56));

        
        //add the data set to the line chart
        lineChart.getData().add(supportData);

        //displaying the chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
