/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Ingenious
 */
public interface impuestos {
    
    //método sueldo neto
    void sueldoNeto(double sueldo, double prestaciones, double deducciones);
    
    //métodoBruto
    void sueldoBruto(int diasTrabajados, double sueldoDiario);
    
    void descuentos(double impuestos, double seguroSocial);
    
    
}
