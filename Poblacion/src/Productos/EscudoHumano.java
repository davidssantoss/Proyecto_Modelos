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
public class EscudoHumano implements Escudo{
     String descripcion;

    public EscudoHumano() {
        this.descripcion = "Escudo resistente y ligero, perfecto para una batalla cuerpo a cuerpo.";
    }
     
    public String getDescripcion() {
        return descripcion;
    }
     
}
