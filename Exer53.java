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
public class Exer53 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um numero para calcular o fatorial: ");
        int num = scan.nextInt();
        
        System.out.println(num + "! =");
        
        int fatorial = 1;
        
        for(int i=num; i>0; i--){
            fatorial *= i;
            System.out.println(i);
        }
        
        System.out.println("Resultado: " + fatorial);
    }
    
}


/* loop interessante
int fatorial = num;
        
        for(int i=num; i>1; i++){
            fatorial *= i;
            System.out.println(i);
        }

    System.out.println("Resultado: " + fatorial);
*/