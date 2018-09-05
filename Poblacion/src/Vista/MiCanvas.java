/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Canvas;
import Fabricas.*;
import Productos.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
/**
 *
 * @author Estudiantes
 */
public class MiCanvas extends Canvas {
    Graphics miG;
    Image imgBuffer;
    Personaje personaje;
    Arma arma;
    Cuerpo cuerpo;
    Escudo escudo; 
    
    
    public MiCanvas() {
        personaje = new Ogro();
        cuerpo = personaje.crearCuerpo();
        arma = personaje.crearArma();
        escudo = personaje.crearEscudo();
        setBounds(0, 0, 2000, 1000);
        
                
        
    }
     
    @Override
    public void paint(Graphics g){
        
	cuerpo.draw(g);
        arma.draw(g);
        escudo.draw(g);
        
    }
    @Override
    public void update(Graphics g){
        paint(g);
    }
}
