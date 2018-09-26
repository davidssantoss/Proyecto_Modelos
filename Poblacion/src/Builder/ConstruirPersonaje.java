/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Fabricas.Personaje;

/**
 *
 * @author Estudiantes
 */
public abstract class ConstruirPersonaje{
    protected Personaje personaje;
    public Personaje getPersonaje (){
        return personaje;
    }
    public abstract void construirCuerpo();
    public abstract void construirArma();
    public abstract void construirEscudo();
    
}
