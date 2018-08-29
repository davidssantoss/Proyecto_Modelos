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
public class EscudoHada implements Escudo{
    Image imagen;
     String descripcion;

    public EscudoHada() {
        imagen = new ImageIcon(getClass().getResource(
                "/Imagenes.Escudos/EscudoHada.jpg")).getImage();
        this.descripcion = "No tiene escudo físico, se protege y a la vez puede proteger a otros con su campo de fuerza.";
    }
      public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, 0, 0, null);
    }
     
}
