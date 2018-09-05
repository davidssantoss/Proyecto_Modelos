/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.plaf.basic.BasicArrowButton;

/**
 *
 * @author Estudiantes
 */
public class Interfaz extends JFrame {
    public  JButton btnHumano = new JButton("Humano");
    public  JButton btnOgro = new JButton("Ogro");
    public  JButton btnHada = new JButton("Hada");
    public  JButton btnMago = new JButton("Mago");
    public  JButton btnElfo = new JButton("Elfo");
    MiCanvas canvas;

    public Interfaz(){
        canvas = new MiCanvas();
        
        setLayout(null);
        getContentPane().add(canvas);
        //setBackground(Color.BLACK);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        
        setBounds(0, 0, 2000, 1000);
        setVisible(true);
        
    }
    
    
    
}
