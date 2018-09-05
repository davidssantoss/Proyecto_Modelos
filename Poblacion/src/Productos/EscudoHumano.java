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
public class EscudoHumano implements Escudo{
    Image imagen = new ImageIcon(getClass().getResource(
                "/Imagenes/EscudoHumano.jpg")).getImage();
    String descripcion;

    public EscudoHumano() {
        
        this.descripcion = "Escudo resistente y ligero, perfecto para una batalla cuerpo a cuerpo.";
    }
     
    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, 900, 0, null);
    }
     
}
