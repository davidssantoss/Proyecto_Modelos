/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Estudiantes
 */
public class EscudoOgro implements Escudo{
    Image imagen;
    String descripcion; 

    public EscudoOgro() {
        imagen = new ImageIcon(getClass().getResource(
                "/Imagenes.Escudos/EscudoOgro.jpg")).getImage();
        this.descripcion = "El más sencillo de todos, sin embargo, a el ogro no le hace falta, con su fuerza le basta.";
    }
    
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, 0, 0, null);
    }
    
}
