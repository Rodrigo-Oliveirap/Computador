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
 * Class Desktop
 */
public class Desktop extends Computador {

    //
    // Fields
    //

    public String Placa;
    public float Fonte;
    
    //
    // Constructors
    //
    public Desktop () { };
    
    //
    // Methods
    //


    //
    // Accessor methods
    //

    /**
     * Set the value of Placa
     * @param newVar the new value of Placa
     */
    public void setPlaca (String newVar) {
        Placa = newVar;
    }

    /**
     * Get the value of Placa
     * @return the value of Placa
     */
    public String getPlaca () {
        return Placa;
    }

    /**
     * Set the value of Fonte
     * @param newVar the new value of Fonte
     */
    public void setFonte (float newVar) {
        Fonte = newVar;
    }

    /**
     * Get the value of Fonte
     * @return the value of Fonte
     */
    public float getFonte () {
        return Fonte;
    }

    //
    // Other methods
    //

}