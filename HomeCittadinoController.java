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
public class HomeCittadinoController implements Initializable {
    
    private Scene scene;
    private Parent root;
    private Stage stage;
    
    @FXML
    private JFXButton VisualizzaPrenotazioni;
    @FXML
    private JFXButton NuovaPrenotazione;
    @FXML
    private JFXButton Indietro;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource() == NuovaPrenotazione){
            root = FXMLLoader.load(getClass().getResource("menuCampagne.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Menu Campagne");
            stage.setScene(scene);
            stage.show();
        }
        if(event.getSource() == VisualizzaPrenotazioni){//inserire parte database prenotazioni
            
        }
        if(event.getSource() == Indietro){
            root = FXMLLoader.load(getClass().getResource("registrazioneCittadino.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Registrazione Cittadino");
            stage.setScene(scene);
            stage.show();
        }
    }
    
}
