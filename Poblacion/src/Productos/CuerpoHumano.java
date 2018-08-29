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
public class CuerpoHumano implements Cuerpo{
    Image imagen;  
    String descripcion;

    public CuerpoHumano() {
        imagen = new ImageIcon(getClass().getResource(
                "/Imagenes.personajes/Humano.jpg")).getImage();
        this.descripcion = "Guerrero humano, uno de los más fuertes del mundo. Fiero y dispuesto a dar su vida por los suyos.";
    }
     
     
     public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, 0, 0, null);
    }
}
