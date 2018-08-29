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
public class CuerpoHumano implements Cuerpo{
     String descripcion;

    public CuerpoHumano() {
        this.descripcion = "Guerrero humano, uno de los más fuertes del mundo. Fiero y dispuesto a dar su vida por los suyos.";
    }
     
     
     public String getDescripcion() {
        return descripcion;
    }
}
