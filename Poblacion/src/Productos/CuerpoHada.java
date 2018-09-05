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
public class CuerpoHada implements Cuerpo{
    Image imagen = new ImageIcon(getClass().getResource(
                "/Imagenes/Hada.jpg")).getImage();
     String descripcion;

    public CuerpoHada() {
        
        this.descripcion = "Ser de paz, vive en las más hermosas praderas en medio del bosque, pero si se siente amenazada, puede sacar su lado más oscuro y terrible.";
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
