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
public class EscudoHada implements Escudo{
     String descripcion;

    public EscudoHada() {
        this.descripcion = "No tiene escudo físico, se protege y a la vez puede proteger a otros con su campo de fuerza.";
    }
      public String getDescripcion() {
        return descripcion;
    }
     
}
