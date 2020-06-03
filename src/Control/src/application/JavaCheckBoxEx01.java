package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// FX의 패키지를 임포트할것

public class JavaCheckBoxEx01 extends Application{
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		VBox vb = new VBox(10);
		
		CheckBox chk1 = new CheckBox("Chk1");
		CheckBox chk2 = new CheckBox("Chk2");
		vb.getChildren().addAll(chk1,chk2);
		vb.setPrefSize(300, 200);
		//  두 체크박스를 VBox에 담는다 
		
		Button btn = new Button("체크");
		btn.setOnAction(e->{
			if(chk1.isSelected())
				System.out.println("BOX1 : CHCKED!");
			if(chk2.isSelected())
				System.out.println("BOX2 : CHCKED!");
		});
		
		vb.getChildren().addAll(chk1,chk2,btn);



		
		primaryStage.setTitle("ChkBOX EX1");
		primaryStage.setScene(new Scene(vb));
		primaryStage.show();
		
		
		
				
	}
	
	public static void main(String[] args) {	
		launch(args);
	}


}

