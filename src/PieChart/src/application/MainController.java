package application;
 
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
 
public class MainController {
 
    @FXML PieChart pieChart;
    
    @FXML Label status;
    
    public void btn(ActionEvent event){
        ObservableList<Data> list = FXCollections.observableArrayList(
            new PieChart.Data("Java", 50),    
            new PieChart.Data("c++", 20),
            new PieChart.Data("python", 30),
            new PieChart.Data("c#", 10),
            new PieChart.Data("c", 15)
            );
        pieChart.setData(list);
        
        for (final PieChart.Data data : pieChart.getData()) {
            data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
 
                @Override
                public void handle(MouseEvent event) {
                    status.setText(String.valueOf(data.getPieValue()/(125.00/100)) + "%");
                    
                }
            });
        }
    }
    
}