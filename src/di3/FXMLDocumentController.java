/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Adrián Raya Hernández
 */
public class FXMLDocumentController implements Initializable {
     /*String css1 = this.getClass().getResource("/estilos/estilo1.css").toExternalForm();
     String css2 = this.getClass().getResource("/estilos/estilo2.css").toExternalForm();
     String css3 = this.getClass().getResource("/estilos/estilo3.css").toExternalForm();
*/
    @FXML
    private AnchorPane panel;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;

    @FXML
    private void cambiarEstilo1(ActionEvent event) {
        panel.getStylesheets().clear();
        panel.getStylesheets().add("/estilos/estilo1.css");
    }
    
    @FXML
    private void cambiarEstilo2(ActionEvent event) {
        panel.getStylesheets().clear();
        panel.getStylesheets().add("/estilos/estilo2.css");
    }
    
    @FXML
    private void cambiarEstilo3(ActionEvent event) {
        panel.getStylesheets().clear();
        panel.getStylesheets().add("/estilos/estilo3.css");
    }
    
    @FXML
    private void resetearEstilo(ActionEvent event) {
        panel.getStylesheets().clear();
    }
    
    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }       
}
