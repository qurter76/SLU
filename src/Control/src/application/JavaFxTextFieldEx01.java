package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class JavaFxTextFieldEx01 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox hb = new HBox(15);
		hb.setPadding(new Insets(10));
		
		
		TextField Id = new TextField();
		PasswordField pw = new PasswordField();
		Id.setPromptText("아이디 입력");
		pw.setPromptText("패스워드 입력");
		
		hb.getChildren().addAll(Id,pw);
	
		primaryStage.setTitle("Text & Password FieldEx");
		primaryStage.setScene(new Scene(hb));
		primaryStage.show();

		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}