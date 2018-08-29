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
public class CuerpoHada implements Cuerpo{
     String descripcion;

    public CuerpoHada() {
        this.descripcion = "Ser de paz, vive en las más hermosas praderas en medio del bosque, pero si se siente amenazada, puede sacar su lado más oscuro y terrible.";
    }
     
     public String getDescripcion() {
        return descripcion;
    }
}
