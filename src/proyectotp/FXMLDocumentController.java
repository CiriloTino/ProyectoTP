/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotp;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

/**
 *
 * @author Tino
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Slider horas_Laboradas;

    @FXML
    private ComboBox<String> combo_Empleado;
    
    @FXML 
    private TextField nombre_Empleado, salario_Empleado;
    
    
    
    @FXML
    private void comboboxEvent(ActionEvent event) {
        
    }
    
   
    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        System.out.println("Calculando salario....");
        System.out.println(nombre_Empleado.getText());
        System.out.println(salario_Empleado.getText());
        System.out.println(combo_Empleado.getValue());
        System.out.println(horas_Laboradas.getValue());
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        ArrayList <String> empleados = new ArrayList<>();
        Collections.addAll(empleados,new String[]{"Gerente","Coordinador","Empleado general"});
        combo_Empleado.getItems().addAll(empleados);
        
    }    
    
}
