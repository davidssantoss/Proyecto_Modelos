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
public class EscudoHada implements Escudo{
    Image imagen = new ImageIcon(getClass().getResource("/Imagenes/EscudoHada.jpg")).getImage();
    Image descripcion = new ImageIcon(getClass().getResource("/Imagenes/DesEscudoHada.jpg")).getImage();

    public EscudoHada() {
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, 800, 0, null);
        g.drawImage(descripcion, 900, 800, null);
    }
     
}
