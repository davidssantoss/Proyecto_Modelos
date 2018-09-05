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
public class ArmaMago implements Arma{
    Image imagen = new ImageIcon(getClass().getResource(
                "/Imagenes/ArmaMago.jpg")).getImage();
     String descripcion;

    public ArmaMago() {
        
        this.descripcion = "Báculo especial para el mago, que le ayuda a canalizar sus poderes y manejarlos en cualquier situación";
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
