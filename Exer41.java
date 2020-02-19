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
public class Exer41 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double popA;
        double popB;
        double taxaA;
        double taxaB;
        
        
        boolean valido = false;
        
        do {
            System.out.println("Informe a população A: ");
            popA = scan.nextDouble();
            
            if (popA > 0){
                valido = true;
            } else {
               System.out.println("Tem de ser maior que 0"); 
            }
         
        } while (!valido);
        
        
        valido = false;
        
        do {
            System.out.println("Informe a população B: ");
            popB = scan.nextDouble();
            
            if (popB > 0){
                valido = true;
            } else {
               System.out.println("Tem de ser maior que 0"); 
            }
         
        } while (!valido);
        
        
        valido = false;
        
        do {
            System.out.println("Informe a taxa de crescimento da população A: ");
            taxaA = scan.nextDouble();
            
            if (taxaA > 0){
                valido = true;
            } else {
               System.out.println("Tem de ser maior que 0"); 
            }
         
        } while (!valido);
        
        
        valido = false;
        
        do {
            System.out.println("Informe a taxa de crescimento da população B: ");
            taxaB = scan.nextDouble();
            
            if (taxaB > 0){
                valido = true;
            } else {
               System.out.println("Tem de ser maior que 0"); 
            }
         
        } while (!valido);
        
       
        int cont =0;
 
        while (popA < popB){
            
            popA += (popA/100) * taxaA;
            popB += (popB/100) * taxaB;
            cont++;
        }
        
        System.out.println("Populacao A: " + popA);
        System.out.println("Populacao A: " + popA);
        System.out.println("Quantidade de anos: " + cont);
        
        }

        
        
    
}
