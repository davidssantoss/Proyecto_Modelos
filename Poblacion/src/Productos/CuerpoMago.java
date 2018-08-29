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
public class CuerpoMago implements Cuerpo{
    Image imagen;
    String descripcion;

    public CuerpoMago() {
        imagen = new ImageIcon(getClass().getResource(
                "/Imagenes.personajes/Mago.jpg")).getImage();
        this.descripcion = "De apariencia casi humana, aunque con muchas más ventajas, como los poderes con los cuales se pueden defender de cualquier ataque.";
    }


    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, 0, 0, null);
    }
    
    
}
