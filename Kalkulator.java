import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class Kalkulator {

	@FXML
	private MenuItem close;
	@FXML
	private Button zero;
	@FXML
	private Button one;
	@FXML
	private Button two;
	@FXML
	private Button three;
	@FXML
	private Button four;
	@FXML
	private Button five;
	@FXML
	private Button six;
	@FXML
	private Button seven;
	@FXML
	private Button eight;
	@FXML 
	private Button nine;
	@FXML
	private TextField outcome;
	@FXML 
	private Button add;
	@FXML
	private Button subtract;
	@FXML
	private Button multiply;
	@FXML
	private Button divide;
	@FXML
	private Button clear;
	@FXML
	private Button equals;
		
	@FXML
	private void onCloseAction() {
		Platform.exit();
	}
	
	private String leftOperand = "";
	private String rightOperand = "";
	private String Operator = null;
		
	@FXML
	private void onNumberClick(ActionEvent evt) {
		Button button = (Button) evt.getSource();
		String buttonText = button.getText();
		
		if (buttonText.equals("0")) {
			if (operatorStatus()) {
				leftOperand = leftOperand + "0"; 						
				outcome.appendText("0");
			}
			else {
				rightOperand = rightOperand + "0";
				outcome.appendText("0");
			}
		}	
		
		if (buttonText.equals("1")) {
			if (operatorStatus()) {
				leftOperand = leftOperand + "1"; 						
				outcome.appendText("1");
			}
			else {
				rightOperand = rightOperand + "1";
				outcome.appendText("1");
			}
		}	
		
		if (buttonText.equals("2")) {
			if (operatorStatus()) {
				leftOperand = leftOperand + "2"; 						
				outcome.appendText("2");
			}
			else {
				rightOperand = rightOperand + "2";
				outcome.appendText("2");
			}
		}	
		
		if (buttonText.equals("3")) {
			if (operatorStatus()) {
				leftOperand = leftOperand + "3"; 						
				outcome.appendText("3");
			}
			else {
				rightOperand = rightOperand + "3";
				outcome.appendText("3");
			}
		}	
		
		if (buttonText.equals("4")) {
			if (operatorStatus()) {
				leftOperand = leftOperand + "4"; 						
				outcome.appendText("4");
			}
			else {
				rightOperand = rightOperand + "4";
				outcome.appendText("4");
			}
		}	
		
		if (buttonText.equals("5")) {
			if (operatorStatus()) {
				leftOperand = leftOperand + "5"; 						
				outcome.appendText("5");
			}
			else {
				rightOperand = rightOperand + "5";
				outcome.appendText("5");
			}
		}	
		
		if (buttonText.equals("6")) {
			if (operatorStatus()) {
				leftOperand = leftOperand + "6"; 						
				outcome.appendText("6");
			}
			else {
				rightOperand = rightOperand + "6";
				outcome.appendText("6");
			}
		}	
		
		if (buttonText.equals("7")) {
			if (operatorStatus()) {
				leftOperand = leftOperand + "7"; 						
				outcome.appendText("7");
			}
			else {
				rightOperand = rightOperand + "7";
				outcome.appendText("7");
			}
		}	
		
		if (buttonText.equals("8")) {
			if (operatorStatus()) {
				leftOperand = leftOperand + "8"; 						
				outcome.appendText("8");
			}
			else {
				rightOperand = rightOperand + "8";
				outcome.appendText("8");
			}
		}	
		
		if (buttonText.equals("9")) {
			if (operatorStatus()) {
				leftOperand = leftOperand + "9"; 						
				outcome.appendText("9");
			}
			else {
				rightOperand = rightOperand + "9";
				outcome.appendText("9");
			}
		}
	}
	
	@FXML
	private void onOperatorClick(ActionEvent evt) {
		Button button = (Button) evt.getSource();
		String buttonText = button.getText();
		outcome.setText("");
		
		if (buttonText.equals("+")) {
			if (operatorStatus()) 
				Operator = "+";
			else {
				outcome.setText("");
				leftOperand = "";
				rightOperand = "";
				Operator = null;
			}
		}
		
		if (buttonText.equals("-")) {
			if (operatorStatus()) 
				Operator = "-";
			else {
				outcome.setText("");
				leftOperand = "";
				rightOperand = "";
				Operator = null;
			}
		}
		
		if (buttonText.equals("*")) {
			if (operatorStatus()) 
				Operator = "*";
			else {
				outcome.setText("");
				leftOperand = "";
				rightOperand = "";
				Operator = null;
			}
		}
		
		if (buttonText.equals("/")) {
			if (operatorStatus()) 
				Operator = "/";
			else {
				outcome.setText("");
				leftOperand = "";
				rightOperand = "";
				Operator = null;
			}
		}
	}
	
	@FXML
	private void onEqualsClick() {
		
		if (Operator == "+")
			outcome.setText(Double.toString(Double.parseDouble(leftOperand) + Double.parseDouble(rightOperand)));	
		
		if (Operator == "-")
			outcome.setText(Double.toString(Double.parseDouble(leftOperand) - Double.parseDouble(rightOperand)));
		
		if (Operator == "*")
			outcome.setText(Double.toString(Double.parseDouble(leftOperand) * Double.parseDouble(rightOperand)));
		
		if (Operator == "/")
			outcome.setText(Double.toString(Double.parseDouble(leftOperand) / Double.parseDouble(rightOperand)));
		
		leftOperand = "";
		rightOperand = "";
		Operator = null;
	}
		
	@FXML
	private void onClearClick() {
		leftOperand = "";
		rightOperand = "";
		Operator = null;
		outcome.setText("");
	}
	
	private boolean operatorStatus() {
		if (Operator == null)
			return true;
		else
			return false;
	}
}
