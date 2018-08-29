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
public class EscudoElfo implements Escudo{
    Image imagen;
    String descripcion;
     
    public EscudoElfo() {
        imagen = new ImageIcon(getClass().getResource(
                "/Imagenes.Escudos/EscudoElfo.jpg")).getImage();
        this.descripcion = "Escudo físico, construido por los mismos elfos y especiales para ellos, un escudo digno de ellos.";
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, 0, 0, null);
    }
     
    
}
