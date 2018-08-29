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
public class ArmaOgro implements Arma{
    Image imagen;
     String descripcion;

    public ArmaOgro() {
        imagen = new ImageIcon(getClass().getResource(
                "/Imagenes.Armas/ArmaOgro.jpg")).getImage();
        this.descripcion = "Maso gigante, el arma perfecta para él, con el golpea cosas y las aplasta sin piedad.";
    }


    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, 0, 0, null);
    }
     
    
}
