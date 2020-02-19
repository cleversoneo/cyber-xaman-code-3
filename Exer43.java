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
public class Exer43 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int num;
        int maior = Integer.MIN_VALUE;
        
        for (int i=0; i<5; i++){
            
            System.out.println("Entre com um numero inteiro: ");
            num = scan.nextInt();
            
            if(num > maior){
                maior = num;
                System.out.println("O numero maior mudou " + maior);
            }
        }
        
        System.out.println("O maior numero digitado foi " + maior);
        
        
    }
    
}
