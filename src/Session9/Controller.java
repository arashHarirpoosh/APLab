package Session9;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Controller {

    @FXML
    public TextField display;

    @FXML
    public void click_0(ActionEvent actionEvent) {
        display.setText(display.getText() + "0");
    }
    public void click_1(ActionEvent actionEvent) {
        display.setText(display.getText() + "1");
    }
    public void click_2(ActionEvent actionEvent) {
        display.setText(display.getText() + "2");
    }
    public void click_3(ActionEvent actionEvent) {
        display.setText(display.getText() + "3");
    }
    public void click_4(ActionEvent actionEvent) {
        display.setText(display.getText() + "4");
    }
    public void click_5(ActionEvent actionEvent) {
        display.setText(display.getText() + "5");
    }
    public void click_6(ActionEvent actionEvent) {
        display.setText(display.getText() + "6");
    }
    public void click_7(ActionEvent actionEvent) {
        display.setText(display.getText() + "7");
    }
    public void click_8(ActionEvent actionEvent) {
        display.setText(display.getText() + "8");
    }
    public void click_9(ActionEvent actionEvent) {
        display.setText(display.getText() + "9");
    }
    public void click_dot(ActionEvent actionEvent) {
        display.setText(display.getText() + ".");
    }
    public void click_mul(ActionEvent actionEvent) {
        display.setText(display.getText() + "*");
    }
    public void click_div(ActionEvent actionEvent) {
        display.setText(display.getText() + "/");
    }
    public void click_minus(ActionEvent actionEvent) {
        display.setText(display.getText() + "-");
    }
    public void click_add(ActionEvent actionEvent) {
        display.setText(display.getText() + "+");
    }
    public void click_eq(ActionEvent actionEvent) {
//        display.setText(display.getText() + "=");
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            String text = display.getText();
            display.clear();
            display.setText(engine.eval(text).toString());
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
    public void click_sin(ActionEvent actionEvent) {
        // convert degrees to radians
        double radians = Math.toRadians(Integer.parseInt(display.getText()));

        // sin() method to get the sine value
        double sinValue = Math.sin(radians);
//        display.setText("sin(" + display.getText() + ")");
        display.setText(String.valueOf(sinValue));
    }
    public void click_cos(ActionEvent actionEvent) {
//        display.setText("cos(" + display.getText() + ")");
        // convert degrees to radians
        double radians = Math.toRadians(Integer.parseInt(display.getText()));

        double cosValue = Math.cos(radians);
//        display.setText("sin(" + display.getText() + ")");
        display.setText(String.valueOf(cosValue));
    }
    public void click_tan(ActionEvent actionEvent) {
//        display.setText("tan(" + display.getText() + ")");
        // convert degrees to radians
        double radians = Math.toRadians(Integer.parseInt(display.getText()));

        double tanValue = Math.tan(radians);
//        display.setText("sin(" + display.getText() + ")");
        display.setText(String.valueOf(tanValue));
    }
    public void click_cot(ActionEvent actionEvent) {
        // convert degrees to radians
        double radians = Math.toRadians(Integer.parseInt(display.getText()));

        double cotValue = Math.cos(radians) / Math.sin(radians);
        display.setText(String.valueOf(cotValue));
    }
    public void click_ac(ActionEvent actionEvent) {
        display.clear();
    }




}
