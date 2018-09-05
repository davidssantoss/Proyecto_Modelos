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
public class ArmaHada implements Arma{
    String descripcion;
    Image imagen = new ImageIcon(getClass().getResource(
                "/Imagenes/ArmaHada.png")).getImage();

    public ArmaHada() {
        
        this.descripcion = "Varita, que al igual que ella, es muy tierna, pero tiene más poder de lo que parece.";
    }



    @Override
    public void draw(Graphics g) {
        g.drawImage(imagen, 300, 0, null);
    }
     
    public String getDescripcion() {
        return descripcion;
    }
     
}
