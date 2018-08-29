/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

/**
 *
 * @author Estudiantes
 */
public class CuerpoMago implements Cuerpo{
    String descripcion;

    public CuerpoMago() {
        this.descripcion = "De apariencia casi humana, aunque con muchas más ventajas, como los poderes con los cuales se pueden defender de cualquier ataque.";
    }


    public String getDescripcion() {
        return descripcion;
    }
    
    
}
