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
public class ArmaHumano implements Arma{
    String descripcion;

    public ArmaHumano() {
        this.descripcion = "Espada forjara por los mejores herreros, pasada de generación en generación; casi indestructible";
    }


    public String getDescripcion() {
        return descripcion;
    }
    
    
}
