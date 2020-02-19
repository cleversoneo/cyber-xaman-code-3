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
public class Exer44 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int num;
        
        int soma =0;
        int media;
        
        for(int i=0; i <5; i++){
            System.out.println("Informe 5 numeros");
            num = scan.nextInt();
            
            soma += num;
            
        }
        media = soma/5;
        
        System.out.println("soma " + soma);
        System.out.println("media " + media);
        
        
        
    }
    
}
