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
public class Exer57 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o numero de turmas: ");
        int numTurmas = scan.nextInt();
        
        int numAlunos;
        int soma =0;
        boolean invalido = true;
        
        
        for(int i=0; i<numTurmas; i++){
            
         do {
            System.out.println("Entre com o numero de alunos da turma: " + i);
            numAlunos = scan.nextInt();
            
            if(numAlunos < 40){
            invalido = false;
            } else{
             System.out.println("Numero de alunos invalido. Digite novamente.");  
            }
                
          }while(invalido);
         
          soma += numAlunos;
               
        }
        
        double media = soma / numTurmas;
        
        System.out.println("Media: "+ media);
             
      }
        
}
