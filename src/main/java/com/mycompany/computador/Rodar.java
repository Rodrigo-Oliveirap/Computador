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
        
        //variáveis
        int Tipo;
        
        System.out.println("---Cadastro Computador/Celular/Notebook---");
        System.out.println("Entre com o tipo de dispositivo: ");
        System.out.println("(1) Desktop");
        System.out.println("(2) Notebook");
        
        Tipo = input.nextInt();
        
        

        
        while (Tipo != 2 && Tipo != 1){
            
            System.out.println("Tipo Inválido, informe novamente");
            Tipo = input.nextInt();
            
            }
                                
        //esvazia buffer para receber outro tipo de variável
        input.nextLine();
        
        switch (Tipo){
            case 1:
                
                Desktop desktop1 = new Desktop();
                
                 desktop1.setTipo(Tipo);
                
                System.out.println("Entre com o Processador: ");
                System.out.println("Exemplo: Ryzen 7 1700");
                desktop1.setProcessador(input.nextLine());

                System.out.println("Entre com a GPU: ");
                System.out.println("Exemplo: Radeon HD 6850");
                desktop1.setGPU(input.nextLine());       
        
                System.out.println("Entre com a memória em GB: ");
                System.out.println("Exemplo: 16");
                desktop1.setMemoria(input.nextFloat());
        
                System.out.println("Entre com o armazenamento em GB: ");
                System.out.println("Exemplo: 3480");
                desktop1.setArmazenamento(input.nextFloat());
        
                System.out.println("Entre com o modelo da placa mãe: ");
                System.out.println("Exemplo: B350 Tomahawk");
                desktop1.setPlaca(input.nextLine());
                
                System.out.println("Informe a quantidade de Watts da fonte: ");
                System.out.println("Exemplo: 500");
                desktop1.setFonte(input.nextFloat());
                
                desktop1.desk();
            break;
            case 2:
            
                Notebook notebook1 = new Notebook();
                
                 notebook1.setTipo(Tipo);
                
                System.out.println("Entre com o Processador: ");
                System.out.println("Exemplo: Ryzen 5 2500U");
                notebook1.setProcessador(input.nextLine());

                System.out.println("Entre com a GPU: ");
                System.out.println("Exemplo: MX150");
                notebook1.setGPU(input.nextLine());       
        
                System.out.println("Entre com a memória em GB: ");
                System.out.println("Exemplo: 12");
                notebook1.setMemoria(input.nextFloat());
        
                System.out.println("Entre com o armazenamento em GB: ");
                System.out.println("Exemplo: 1000");
                notebook1.setArmazenamento(input.nextFloat());
                
                System.out.println("Entre com o tamanho da tela em polegadas: ");
                System.out.println("Exemplo: 15,6");
                notebook1.setTela(input.nextFloat());
        
                System.out.println("Entre com a capacidade da bateria em mAh: ");
                System.out.println("Exemplo: 4050");
                notebook1.setBateria(input.nextFloat());
                
                notebook1.informar();
            break;    
                
        }
      
    }
    
}
