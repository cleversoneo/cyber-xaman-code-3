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
public class Exer46 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com primeiro numero: ");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com segundo numero: ");
        int num2 = scan.nextInt();
        
        for(int i=num1; i<num2; i++){
            System.out.println(i);
        }
        
        
        
    }
    
}
