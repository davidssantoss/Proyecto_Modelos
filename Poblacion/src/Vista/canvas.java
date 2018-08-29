/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Productos.ArmaElfo;
import Productos.ArmaHada;
import Productos.ArmaHumano;
import Productos.ArmaOgro;
import Productos.ArmaMago;
import Productos.CuerpoElfo;
import Productos.CuerpoHada;
import Productos.CuerpoHumano;
import Productos.CuerpoMago;
import Productos.CuerpoOgro;
import Productos.EscudoElfo;
import Productos.EscudoHada;
import Productos.EscudoHumano;
import Productos.EscudoMago;
import Productos.EscudoOgro;
import javax.swing.ImageIcon;

public class canvas extends JFrame implements ActionListener {

    public JLabel deself;// etiqueta o texto no editable
    public JLabel deshuma;
    public JLabel desogro;
    public JLabel desmago;
    public JLabel deshada;
    
    public JLabel imgelf;
    public JLabel imghum;
    public JLabel imgog;
    public JLabel imghad;
    public JLabel imgmag;
    
    public JLabel imgeself;
    public JLabel imgeshum;
    public JLabel imgesmag;
    public JLabel imgesog;
    public JLabel imgeshad;
    
    public JLabel imgarmelf;
    public JLabel imgarmhum;
    public JLabel imgarmag;
    public JLabel imgarmog;
    public JLabel imgarmhad;
    
    
    
    private JTextField caja;        // caja de texto, para insertar datos
    private JButton boton;          // boton con una determinada accion

    public canvas() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("Catalogo Personajes");                   // colocamos titulo a la ventana
        this.setSize(3000, 510);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componente
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    } 
    
     private void inicializarComponentes() {
         ArmaElfo arelf = new ArmaElfo();
         ArmaHada arhad = new ArmaHada();
         ArmaHumano arhum = new ArmaHumano();
         ArmaMago armag = new ArmaMago();
         ArmaOgro arog = new ArmaOgro();
         
         CuerpoElfo elf = new  CuerpoElfo ();
         CuerpoHada had = new CuerpoHada ();
         CuerpoHumano hum = new CuerpoHumano ();
         CuerpoOgro og = new CuerpoOgro();
         CuerpoMago mag = new CuerpoMago  ();
         
         EscudoElfo eself=new EscudoElfo();
         EscudoHada eshad=new EscudoHada();
         EscudoHumano eshum=new EscudoHumano();
         EscudoMago esmag=new EscudoMago();
         EscudoOgro esog= new EscudoOgro   (); 
                 
                 
        // creamos los componentes
        deself = new JLabel();
        deshuma = new JLabel();
        desogro = new JLabel();
        desmago = new JLabel();
        deshada = new JLabel();
        
        imgelf= new JLabel();
        imghum= new JLabel();
        imgog= new JLabel();
        imghad= new JLabel();
        imgmag= new JLabel();
        
        imgeself= new JLabel();
        imgeshum= new JLabel();
        imgesmag= new JLabel();
        imgesog= new JLabel();
        imgeshad= new JLabel();
        
        imgarmelf= new JLabel();
        imgarmhum= new JLabel();
        imgarmag= new JLabel();
        imgarmog= new JLabel();
        imgarmhad= new JLabel();
        
        
        boton = new JButton();
        
        
        // configuramos los componentes
        deself.setText("Elfo "+"Cuerpo:"+elf.getDescripcion()+"Arma:"+arelf.getDescripcion()+"Escudo:"+eself.getDescripcion());    // colocamos un texto a la etiqueta
        deshuma.setText("Humano "+"Cuerpo:"+hum.getDescripcion()+"Arma:"+arhum.getDescripcion()+"Escudo:"+eshum.getDescripcion());
        desogro.setText("Ogro "+"Cuerpo:"+og.getDescripcion()+"Arma:"+arog.getDescripcion()+"Escudo:"+esog.getDescripcion());
        desmago.setText("Mago "+"Cuerpo:"+mag.getDescripcion()+"Arma:"+armag.getDescripcion()+"Escudo:"+esmag.getDescripcion());
        deshada.setText("Hada "+"Cuerpo:"+had.getDescripcion()+"Arma:"+arhad.getDescripcion());
        
        imgelf.setIcon(new ImageIcon("/Vista/Elfo.jpg"));
        imghum.setIcon(new ImageIcon("Humano.jpg"));
        imgog.setIcon(new ImageIcon("Ogro.jpg"));
        imgmag.setIcon(new ImageIcon("Mago.jpg"));
        imghad.setIcon(new ImageIcon("Hada.jpg"));
        
        
        
        
        
        
        deself.setBounds(50, 50, 1500, 35);   // colocamos posicion y tamanio al texto (x, y, ancho, alto
        deshuma.setBounds(50, 100, 1500, 25);
        desogro.setBounds(50, 150, 1500, 25);
        desmago.setBounds(50, 200, 1500, 25);
        deshada.setBounds(50, 250, 1500, 25);
        
        imgelf.setBounds(50, 250, 300, 25);
        //boton.setText("Mostrar Mensaje");   // colocamos un texto al boton
        //boton.setBounds(50, 100, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
       // boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        // adicionamos los componentes a la ventana
        this.add(deself);
        this.add(deshuma);
        this.add(desogro);
        this.add(desmago);
        this.add(deshada);
        
        this.add(imgelf);
        this.add(imgmag);
        this.add(imgog);
        this.add(imghum);
        this.add(imghad);
        
        //this.add(boton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
