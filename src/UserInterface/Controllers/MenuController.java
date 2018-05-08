package UserInterface.Controllers;

import UserInterface.Fxml.NumOfGenField;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;

import core.WireworldSimulation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.layout.GridPane;


public class MenuController implements Initializable {

    @FXML
    private NumOfGenField genNumber;
    @FXML
    private Label currentGen;
    @FXML
    private GridPane menuPane;
    @FXML
    private Button backwardB;
    @FXML
    private Button pauseB;
    @FXML
    private Button playB;
    @FXML
    private Button forwardB;
    @FXML
    private Slider delaySlider;
    @FXML
    private Label delayValue;

    private WireworldSimulation simulation;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        delaySlider.setValue(1);
        delayValue.setText(new Double(1).toString());
        delayValue.textProperty().bindBidirectional(delaySlider.valueProperty(), NumberFormat.getNumberInstance());

//        playB.setOnAction(e->simulation.run());
    }    

    @FXML
    private void changeNumOfGen(InputMethodEvent event) {
    }

    @FXML
    private void backGeneration(ActionEvent event) {
    }

    @FXML
    private void pauseSimulation(ActionEvent event) {
        simulation.pause();
    }

    @FXML
    private void playSimulation(ActionEvent event) {
        simulation.unpause();
        simulation.runSimulation();
    }

    @FXML
    private void nextGeneration(ActionEvent event) {
        simulation.nextGeneration();
    }

    public void loadSimulation(WireworldSimulation w_simulation){
        this.simulation = w_simulation;
        this.simulation.runSimulation();
        this.simulation.pause();
    }


}
