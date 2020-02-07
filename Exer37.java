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
public class Exer37 {
    
     public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        boolean notaValida = false;
        
        do{
            System.out.println("Entre com uma nota ");
        double nota = scan.nextDouble();
        
        if(nota >=0 && nota <=10){
            notaValida = true;
            System.out.println("Você digitou " + nota);
        } else{
            //notaValida = false;
            System.out.println("NOTA INVALIDA digite novamente!");
        }
        } while(!notaValida);
        
    }
    
}
        
        /* primeira versao do programa
        System.out.println("Entre com uma nota ");
        double nota = scan.nextDouble();
        
        if(nota >=0 && nota <=10){
            System.out.println("Você digitou " + nota);
        } else{
            System.out.println("NOTA INVALIDA digite novamente!");
        } */
           
     
