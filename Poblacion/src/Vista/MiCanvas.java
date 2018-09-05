/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Canvas;
import Fabricas.*;
import Productos.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
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
    
    
    
    public MiCanvas(int i) {
        switch(i){
            case 1:  
                personaje = new Elfo();
                break;
            case 2:
                personaje = new Hada();
                break;
            case 3:
                personaje = new Humano();
                break;
            case 4:
                personaje = new Mago();
                break;
            case 5:
                personaje = new Ogro();
                break;
            default: 
                break;            
        }
               
        cuerpo = personaje.crearCuerpo();
        arma = personaje.crearArma();
        escudo = personaje.crearEscudo();
        setBounds(0, 0, 2000, 1000);
        //setBackground(Color.BLACK);
                
        
    }
     
    @Override
    public void paint(Graphics g){
	cuerpo.draw(g);
        arma.draw(g);
        escudo.draw(g);
        
    }
}
