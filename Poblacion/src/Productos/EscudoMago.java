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
public class EscudoMago implements Escudo{
    Image imagen = new ImageIcon(getClass().getResource("/Imagenes/EscudoMago.png")).getImage();
    Image descripcion = new ImageIcon(getClass().getResource("/Imagenes/DesEscudoMago.jpg")).getImage();

    public EscudoMago() {
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, 900, 0, null);
        g.drawImage(descripcion, 900, 700, null);
    }
     
}
