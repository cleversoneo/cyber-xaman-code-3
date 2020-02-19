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
public class Exer49 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a BASE: ");
        int base = scan.nextInt();
        
        System.out.println("Informe a POTENCIA: ");
        int poten = scan.nextInt();
        
        //2^2 = 2 * 2
        
        int resultado = base;
                
        for(int i=1; i<poten; i++){
            resultado *= base;
        }
        System.out.println("RESULTADO " + resultado);
    }
    
}
