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
    Image imagen = new ImageIcon(getClass().getResource("/Imagenes/Hada.png")).getImage();
    Image descripcion = new ImageIcon(getClass().getResource("/Imagenes/DesCuerpoHada.png")).getImage();

    public CuerpoHada() {
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, 0, 0, null);
        g.drawImage(descripcion, 0, 800, null);
    }
}
