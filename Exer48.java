/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CyberXamanCode3;

import java.util.Scanner;

/**
 *
 * @author Cleverneo / Exercicios Java do canal do Youtube: https://www.youtube.com/user/Loianeg
 */
public class Exer48 {
    
    
  public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o numero para gerar a tabuada: ");
        int num = scan.nextInt();
        
        System.out.println("TABUADA DE " + num);
        
        for(int i=0; i<10; i++){
          int resultado = num * i;

        System.out.println(num + " x " + i + " = " + resultado);
        }
        
        /* outro exemplo, menos codigo: 
          
        for(int i=0; i<10; i++){
         System.out.println(num + " x " + i + " = " + (num*1));
        }
           */
        
        
        
        
        
        
  }
    
}
