/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computador;

/**
 *
 * @author rodrigo
 */

/**
 * Class Notebook
 */
public class Notebook extends Computador {

    //
    // Fields
    //

    public float Tela;
    public float Bateria;
    
    //
    // Constructors
    //
    public Notebook () { };
    
    //
    // Methods
    //


    //
    // Accessor methods
    //

    /**
     * Set the value of Tela
     * @param newVar the new value of Tela
     */
    public void setTela (float newVar) {
        Tela = newVar;
    }

    /**
     * Get the value of Tela
     * @return the value of Tela
     */
    public float getTela () {
        return Tela;
    }

    /**
     * Set the value of Bateria
     * @param newVar the new value of Bateria
     */
    public void setBateria (float newVar) {
        Bateria = newVar;
    }

    /**
     * Get the value of Bateria
     * @return the value of Bateria
     */
    public float getBateria () {
        return Bateria;
    }

    //
    // Other methods
    //
}