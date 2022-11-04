/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
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
 * @author matte
 */
public class HomeController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private JFXButton RegButton;
    private JFXButton LogButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        if(event.getSource() == RegButton){
            root = FXMLLoader.load(getClass().getResource("registrazioneCittadino.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Registrazione cittadino");
            stage.setScene(scene);
            stage.show();            
        }
        else if(event.getSource() == LogButton){
            root = FXMLLoader.load(getClass().getResource("loginPersonale.fxml"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setTitle("Login personale ASL");
            stage.setScene(scene);
            stage.show();  
        } 
    }
    
}
