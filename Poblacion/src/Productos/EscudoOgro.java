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
public class EscudoOgro implements Escudo{
    String descripcion; 

    public EscudoOgro() {
        this.descripcion = "El más sencillo de todos, sin embargo, a el ogro no le hace falta, con su fuerza le basta.";
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
}
