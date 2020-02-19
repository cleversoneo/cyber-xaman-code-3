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
public class Exer50 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int numero;
        int pares=0;
        int impares=0;
        
        for(int i=0; i<10; i++){
        System.out.println("Informe um numero ");
        numero = scan.nextInt();
        
        if(numero % 2 != 0){  
              impares++;
        } else{
            pares++;
            }  
        }
        
        System.out.println("quantidade de numeros impares: " +impares);
        System.out.println("quantidade de numeros pares: " +pares);
        
    }
    
}
