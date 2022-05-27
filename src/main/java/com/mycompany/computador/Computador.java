/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computador;

import java.util.Scanner;
/**
 *
 * @author rodrigo
 */


/**
 * Class Computador
 */
public class Computador {

    //
    // Fields
    //

    public float Memoria;
    public float Armazenamento;
    public String Processador;
    public String GPU;
    public int Tipo;
  
    //
    // Constructors
    //
    public Computador () { };
    
    Scanner input = new Scanner(System.in);
    //
    // Methods
    //


    //
    // Accessor methods
    //
    
    /**
     * Set the value of Tipo
     * @param newVar the new value of Tipo
     */
    
    public void setTipo (int newVar) {
        
        Tipo = newVar;
        
    }

    /**
     * Get the value of Tipo
     * @return the value of Tipo
     */
    public int getTipo () {
        return Tipo;
    }
    
    public void setMemoria (float newVar) {
        Memoria = newVar;
    }

    /**
     * Get the value of Memoria
     * @return the value of Memoria
     */
    public float getMemoria () {
        return Memoria;
    }

    /**
     * Set the value of Armazenamento
     * @param newVar the new value of Armazenamento
     */
    public void setArmazenamento (float newVar) {
        Armazenamento = newVar;
    }

    /**
     * Get the value of Armazenamento
     * @return the value of Armazenamento
     */
    public float getArmazenamento () {
        return Armazenamento;
    }

    /**
     * Set the value of Processador
     * @param newVar the new value of Processador
     */
    public void setProcessador (String newVar) {
        Processador = newVar;
    }

    /**
     * Get the value of Processador
     * @return the value of Processador
     */
    public String getProcessador () {
        return Processador;
    }

    /**
     * Set the value of GPU
     * @param newVar the new value of GPU
     */
    public void setGPU (String newVar) {
        GPU = newVar;
    }

    /**
     * Get the value of GPU
     * @return the value of GPU
     */
    public String getGPU () {
        return GPU;
    }

    //
    // Other methods
    //
    protected void informar(){
      
        System.out.print("O Processador do sistema é um " + Processador);
        System.out.println(" e a placa de video do é uma " + GPU);
        System.out.print("A RAM é de " + Memoria + "GB");
        System.out.println(" e possui HD/SSD com " + Armazenamento + "GB de armazenamento");              
        
    }
    

}