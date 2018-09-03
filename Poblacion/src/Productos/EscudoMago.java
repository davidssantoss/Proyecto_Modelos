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
    Image imagen;
    String descripcion;

    public EscudoMago() {
        imagen = new ImageIcon(getClass().getResource(
                "/Imagenes.Escudos/EscudoMago.jpg")).getImage();
        this.descripcion = "El escudo más grande y pesado de todos, sin embargo, esto no le impide protegerse perfectamente.";
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
