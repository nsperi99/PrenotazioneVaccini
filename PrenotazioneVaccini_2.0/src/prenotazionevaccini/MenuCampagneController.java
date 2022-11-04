/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prenotazionevaccini;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author matteo
 */
public class MenuCampagneController implements Initializable {

    private Scene scene;
    private Parent root;
    private Stage stage;
    
    @FXML
    private JFXButton Indietro;
    @FXML
    private JFXButton Influenza;
    @FXML
    private JFXButton Covid;
    @FXML
    private JFXButton Sars;
    @FXML
    private JFXButton Tetano;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if(0==0){ //Qua devono essere attivati i pulsanti in base alla campagne a cui puo aderire il cittadino
            Tetano.setDisable(false);
        }
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource() == Indietro){
            /*
            Bisogna riuscire a fare in modo che quando tornoindietro alla home cittadino
            ci sia ancora il nome del cittadino sopra nel LABEL
            */
            root = FXMLLoader.load(getClass().getResource("HomeCittadino.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Home Cittadino");
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource() == Influenza){
            
        }
        if(event.getSource() == Covid){
            
        }
        if(event.getSource() == Sars){
            
        }
        if(event.getSource() == Tetano){
            
        }
    }
    
    
    
}
