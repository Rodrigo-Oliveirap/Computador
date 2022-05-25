/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.computador;

//importa o scanner
import java.util.Scanner;


/**
 *
 * @author rodrigo
 */
public class Rodar {
    
    public static void main(String[] args) {
        
        //inicia o scanner
        Scanner input = new Scanner(System.in);
        Computador computador1 = new Computador();
        
        //variáveis
        int Tipo;
        String Placa;
        
        System.out.println("---Cadastro Computador/Celular/Notebook---");
        System.out.println("Entre com o tipo de dispositivo: ");
        System.out.println("(1) Desktop");
        System.out.println("(2) Notebook");
        
        Tipo = input.nextInt();
        
        while (Tipo != 2 && Tipo != 1){
            
            System.out.println("Tipo Inválido, informe novamente");
            Tipo = input.nextInt();
            
            }
        
        computador1.setTipo(Tipo);
                                
        //esvazia buffer para receber outro tipo de variável
        input.nextLine();
        
        System.out.println("Entre com o Processador: ");
        computador1.setProcessador(input.nextLine());

        System.out.println("Entre com a GPU: ");
        computador1.setGPU(input.nextLine());       
        
        System.out.println("Entre com a memória em GB: ");
        computador1.setMemoria(input.nextFloat());
        
        System.out.println("Entre com o armazenamento em GB: ");
        computador1.setArmazenamento(input.nextFloat());
        
        switch (Tipo){
            case 1:
                System.out.println("Entre com o modelo da placa mãe: ");
                Placa = input.nextLine();
                computador1.setPlaca(Placa);
                System.out.println("Informe a quantidade de Watts da fonte: ");
                computador1.setFonte(input.nextFloat());
            break;
            
            case 2:
                computador1.desktop();
                
        }
        
        computador1.informar();
        
        

        
        
    }
    
}
