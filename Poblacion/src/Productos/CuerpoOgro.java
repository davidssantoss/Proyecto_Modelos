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
public class CuerpoOgro implements Cuerpo{
    Image imagen = new ImageIcon(getClass().getResource(
                "/Imagenes/Ogro.jpg")).getImage(); ;
    String descripcion;

    public CuerpoOgro() {
        
        this.descripcion = "Grande y muy fuerte, el más agresivo de todos, no teme exteriorizar toda su fuerza con quien se atreva a enfrentarse a él.";
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
