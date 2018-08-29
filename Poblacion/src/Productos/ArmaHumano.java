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
public class ArmaHumano implements Arma{
    Image imagen;
    String descripcion;

    public ArmaHumano() {
        imagen = new ImageIcon(getClass().getResource(
                "/Imagenes.Armas/ArmaHumano.jpg")).getImage();
        this.descripcion = "Espada forjara por los mejores herreros, pasada de generación en generación; casi indestructible";
    }


    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, 0, 0, null);
        
    }
    
    
}
