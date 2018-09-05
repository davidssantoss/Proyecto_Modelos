/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Productos;

import Productos.*;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author Estudiantes
 */
public class ArmaElfo implements Arma{
    String descripcion;
    Image imagen = new ImageIcon(getClass().getResource(
                "/Imagenes/ArmaElfo.jpg")).getImage();
    

    public ArmaElfo() {
        
        this.descripcion = "Escudo y flecha, de apariencia sencilla, pero muy letal en manos de un elfo, especialistas en la misma.\n";
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
