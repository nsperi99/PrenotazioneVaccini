/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prenotazionevaccini;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author matteo
 */
public class RegistrazioneCittadinoController implements Initializable {
    
    private Scene scene;
    private Parent root;
    private Stage stage;
    
    @FXML
    private JFXButton Indietro;
    @FXML
    private JFXTextField Nome;
    @FXML
    private JFXTextField Cognome;
    @FXML
    private JFXTextField CodFiscale;
    @FXML
    private Label avviso;
    @FXML
    private JFXButton Registrati;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource() == Indietro){
            root = FXMLLoader.load(getClass().getResource("Home.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Prenotazione Vaccini");
            stage.setScene(scene);
            stage.show();            
        }
        if(event.getSource() == Registrati){
            if(CodFiscale.getText().equals("A")){ //Inserire Parte Spe
            root = FXMLLoader.load(getClass().getResource("HomeCittadino.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Home Cittadino");
            stage.setScene(scene);
            stage.show();
            }
            else{
                 avviso.setText("Codice fiscale non valido");
            }
        }
    }
    
}
