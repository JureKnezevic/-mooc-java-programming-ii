package application;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage stage) {

        String test = "10.0";
        
        //create X and Y axes
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();

        //creating line chart
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        //adding data points in the data set
        HashMap<String, HashMap<Integer, Double>> values = new HashMap();

        try ( Scanner file = new Scanner(Paths.get("partiesdata.tsv"))) {
            String yearRow = file.nextLine();

            List<String> rowPieces = Arrays.asList(yearRow.split("\t"));

            while (file.hasNextLine()) {
                String dataRow = file.nextLine();

                List<String> dataPieces = Arrays.asList(dataRow.split("\t"));
                String name = dataPieces.get(0);
                
                HashMap<Integer, Double> idk = new HashMap<>();

                for (int i = 1; i < dataPieces.size(); i++) {
                    
                    if (dataPieces.get(i).equals("-")) {
                        i++;
                        continue;
                    }
                    
                    int year = Integer.valueOf(rowPieces.get(i));
                    double percentage = Double.valueOf(dataPieces.get(i));

                    
                    idk.put(year, percentage);
                    values.put(name, idk);

                }

            }

        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        System.out.println(values.get("KESK").entrySet());

        //add the data set to the line chart
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));

            });

            lineChart.getData().add(data);

        });

        //displaying the chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();

    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
}
