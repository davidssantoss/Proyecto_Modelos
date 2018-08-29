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
public class ArmaElfo implements Arma{
    String descripcion;

    public ArmaElfo() {
        this.descripcion = "Escudo y flecha, de apariencia sencilla, pero muy letal en manos de un elfo, especialistas en la misma.";
    }

     
    public String getDescripcion() {
        return descripcion;
    }
     
}
