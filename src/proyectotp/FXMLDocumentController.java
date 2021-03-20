/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotp;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author Tino
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;

    @FXML
    private ComboBox<String> combo_Empleado;

    
    @FXML
    private void comboboxEvent(ActionEvent event) {
        
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event)
    {
    
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ArrayList <String> empleados = new ArrayList<>();
        Collections.addAll(empleados,new String[]{"Gerente","Coordinador","Empleado general"});
        combo_Empleado.getItems().addAll(empleados);

    }    
    
}
