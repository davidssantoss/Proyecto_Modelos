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
import java.util.Iterator;
/**
 *
 * @author Estudiantes
 */
public class MiCanvas extends Canvas {
    Graphics miG;
    Image imgBuffer;
    Personaje fabricapersonaje;

    public MiCanvas() {
        fabricapersonaje = new Elfo();
        fabricapersonaje.crearCuerpo();
    }
     
    public void paint(Graphics g){
        
        miG = imgBuffer.getGraphics();
	//fabricapersonaje.draw(miG);
        
    }
}
