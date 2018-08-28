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
public class ArmaElfo implements Arma{
    Image imagen;
    
    public ArmaElfo(){
        imagen = new ImageIcon(getClass().getResource(
                "/Imagenes.Armas/ArmaElfo.jpg")).getImage();
    }
    @Override
    public void draw(Graphics g){
        g.drawImage(imagen, 0, 0, null);
    }
    @Override
    public String descripcion(){
        return "";
    }
        
    
    
}
