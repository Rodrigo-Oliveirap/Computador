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
    
    //método que informa as especificações do notebook ditas pelo usuario
    protected void note() {
        
        System.out.print("O Processador do sistema é um " + Processador);
        System.out.println(" e a placa de video do notebook é uma " + GPU);
        System.out.print("A RAM é de " + Memoria + "GB");
        System.out.println(" e possui HD/SSD com " + Armazenamento + "GB de armazenamento");
        System.out.println("A tela integrada possui um tamanho de " + Tela + " polegadas");
        System.out.println("E possui também uma bateria de " + Bateria + " mAh");
    }
}