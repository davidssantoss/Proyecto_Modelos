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
public class EscudoMago implements Escudo{
     String descripcion;

    public EscudoMago() {
        this.descripcion = "El escudo más grande y pesado de todos, sin embargo, esto no le impide protegerse perfectamente.";
    }
    
    public String getDescripcion() {
        return descripcion;
    }
     
}
