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
        
        //pede para o usuário qual o tipo de computador a ser descrito
        System.out.println("---Cadastro Desktop/Notebook---");
        System.out.println("Entre com o tipo de dispositivo: ");
        System.out.println("(1) Desktop");
        System.out.println("(2) Notebook");
        
        //recebe o tipo de computador
        Tipo = input.nextInt();
        
        //while que garante que o tipo é somente os permitidos (1 e 2)
        while (Tipo != 2 && Tipo != 1){
            
            System.out.println("Tipo Inválido, informe novamente");
            Tipo = input.nextInt();
            
            }
                                
        //esvazia buffer para receber outro tipo de variável
        input.nextLine();
        
        //switch case para definir se o computador se trata de um notebook ou desktop
        switch (Tipo){
            case 1:
                
                //cria um desktop
                Desktop desktop1 = new Desktop();
                
                //define o tipo dentro de computador
                desktop1.setTipo(Tipo);
                
                //pede o processador para o usuário
                System.out.println("Entre com o Processador: ");
                System.out.println("Exemplo: Ryzen 7 1700");
                desktop1.setProcessador(input.nextLine());
                
                //pede a GPU para o usuário
                System.out.println("Entre com a GPU: ");
                System.out.println("Exemplo: Radeon HD 6850");
                desktop1.setGPU(input.nextLine());       
                
                //pede a quantidade de memória do sistema
                System.out.println("Entre com a memória em GB: ");
                System.out.println("Exemplo: 16");
                desktop1.setMemoria(input.nextFloat());
                
                //pergunta a quantidade de armazenamento total que o sistema possui
                System.out.println("Entre com o armazenamento em GB: ");
                System.out.println("Exemplo: 3480");
                desktop1.setArmazenamento(input.nextFloat());
                
                //esvazia buffer para receber outro tipo de variável
                input.nextLine();
                
                //pede o modelo de placa mãe do desktop
                System.out.println("Entre com o modelo da placa mãe: ");
                System.out.println("Exemplo: B350 Tomahawk");
                desktop1.setPlaca(input.nextLine());
                
                //pergunta a quantidade de Watts que a fonte do desktop possui
                System.out.println("Informe a quantidade de Watts da fonte: ");
                System.out.println("Exemplo: 500");
                desktop1.setFonte(input.nextFloat());
                
                //chama o metodo que informa as informações do desktop de acordo com
                //foi inserido pelo usuario
                desktop1.desk();
            break;
            case 2:
                
                //cria um notebook
                Notebook notebook1 = new Notebook();
                
                //define o tipo dentro de notebook
                notebook1.setTipo(Tipo);
                
                //pede o processador para o usuário
                System.out.println("Entre com o Processador: ");
                System.out.println("Exemplo: Ryzen 5 2500U");
                notebook1.setProcessador(input.nextLine());
                
                //pede a GPU para o usuário
                System.out.println("Entre com a GPU: ");
                System.out.println("Exemplo: MX150");
                notebook1.setGPU(input.nextLine());       
                
                //pede a quantidade de memória do sistema
                System.out.println("Entre com a memória em GB: ");
                System.out.println("Exemplo: 12");
                notebook1.setMemoria(input.nextFloat());
                
                //pergunta a quantidade de armazenamento total que o sistema possui
                System.out.println("Entre com o armazenamento em GB: ");
                System.out.println("Exemplo: 1000");
                notebook1.setArmazenamento(input.nextFloat());
                
                //pede o tamanho da tela do notebook
                System.out.println("Entre com o tamanho da tela em polegadas: ");
                System.out.println("Exemplo: 15.6");
                notebook1.setTela(input.nextFloat());
                
                //pergunta a capacidade da bateria do notebook
                System.out.println("Entre com a capacidade da bateria em mAh: ");
                System.out.println("Exemplo: 4050");
                notebook1.setBateria(input.nextFloat());
                
                //chama o metodo que informa as especificações do notebook de acordo
                //com oque o usuario inseriu
                notebook1.note();
                
            break;    
                
        }
      
    }
    
}
