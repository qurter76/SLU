package app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MainController implements Initializable{

	@FXML private Label result; // 표현되는 곳
	String val = ""; // 받아오는 입력값
	boolean flag = true; // 숫자 입력이 시작하는지 판단하기 위한 변수

	double target1 = 0; // 피연산자1
	double target2 = 0; // 피연산자2
	String oper = "";     // 연산자
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	// 액션이 있을 경우 Action Event가 인자값으로 주워진다.(생략 가능)
	public void procNum(ActionEvent e) {
		if(flag) {
			// 시작 시 한번만 "" 형태로 두어서 0을 없앤다.
			result.setText("");
		}
		flag = false;
		val = ((Button)e.getSource()).getText();
		result.setText(result.getText() + val);
	}

	public void operator(ActionEvent e) {
		if(!flag) { // 숫자가 입력 되었을때만 연산자가 기능을 할 수 있도록
			val = ((Button)e.getSource()).getText();
			if(!val.equals("=")) { // = 이 아닌 경우
				oper = val;
				target1 = Double.parseDouble(result.getText());
				result.setText(oper);
			}else { // = 인 경우
				target2 = Double.parseDouble(result.getText());
				Model model = new Model();
				double dap = model.calc(target1, oper, target2);
				result.setText(String.valueOf(dap));
			}
			flag = true; // 연산자를 삭제하고 숫자 입력을 위해
		}
	}
}
