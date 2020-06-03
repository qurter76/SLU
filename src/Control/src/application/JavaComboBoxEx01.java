package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaComboBoxEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hb = new HBox();
		hb.setPadding(new Insets(10));
		ComboBox<String> combobox = new ComboBox<String>();
		combobox.getItems().addAll("사과","배","바나나");
		
		
		hb.getChildren().addAll(combobox);
		hb.setPrefSize(300, 200);
		
		primaryStage.setTitle("TextFieldEx01");
		primaryStage.setScene(new Scene(hb));
		primaryStage.show();
		
		combobox.setOnAction(e->{
			System.out.println(combobox.getValue());
		});

	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
