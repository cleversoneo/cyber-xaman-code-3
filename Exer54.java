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
public class Exer54 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero : ");
        int num = scan.nextInt();
        
        boolean primo = true;
        
        for(int i=2; i<num; i++){
           if(num % i == 0){
             System.out.println("Não é primo! - divisivel por: " + i);
             primo = false;
             //break;
           } 
        }
        if(primo){
        System.out.println("É primo!");
        
        }
        
    }
    
}
