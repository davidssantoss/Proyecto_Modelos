/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Fabricas.Elfo;
import Productos.ArmaElfo;

/**
 *
 * @author Estudiantes
 */
public class ConstruirElfo extends ConstruirPersonaje{
    
    @Override
    public void construirCuerpo() {
        personaje = new Elfo();
        
    }

    @Override
    public void construirArma() {
        
    }

    @Override
    public void construirEscudo() {
        
    }
    
    
}
