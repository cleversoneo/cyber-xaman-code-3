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
public class Exer40 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int popA = 80000;
        int popB = 200000;
        int cont = 0;
        
        while (popA <= popB){
            
            popA += (popA/100) * 3;
            popB += (popB/100) * 1.5;
            cont++;
        }
        
        System.out.println("Populacao A: " + popA);
        System.out.println("Populacao A: " + popA);
        System.out.println("Quantidade de anos: " + cont);
        
    }
    
}
