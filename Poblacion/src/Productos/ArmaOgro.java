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
    Image imagen  = new ImageIcon(getClass().getResource("/Imagenes/ArmaOgro.png")).getImage();
    Image descripcion = new ImageIcon(getClass().getResource("/Imagenes/DesArmaHogro.png")).getImage();

    public ArmaOgro() {
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, 900, 0, null);
        g.drawImage(descripcion, 400, 400, null);
    }
}
