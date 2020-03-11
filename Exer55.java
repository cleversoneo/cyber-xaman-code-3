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
public class Exer55 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite com a quantidade de notas : ");
        int notas = scan.nextInt();
        
        int soma = 0;
        int nota;
        int media;
        
        for(int i=0; i<notas; i++){
          System.out.println("Digite a nota: " + (i+1));
          nota = scan.nextInt();
          soma += nota;           //soma = soma + nota;
        }
        
        media = soma / notas;
        
        System.out.println("SOMA: " + soma);
        System.out.println("MEDIA:" + media);
    }
    
    
}
