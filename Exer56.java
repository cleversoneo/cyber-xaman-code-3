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
public class Exer56 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite com a quantidade de idades : ");
        int idades = scan.nextInt();
        
        int idade;
        int soma = 0;
        
        for(int i=0; i<idades; i++){
            System.out.println("Entre com a idade da pessoa " + (i+1));
            idade = scan.nextInt();
            
            soma += idade;
        }
        
        double media = soma / idades;
        
        System.out.println("Media de idades: " + media);
        
        if(media >= 0 && media <=25){
            System.out.println("jovem");
        } else if(media >= 26 && media <=60) {
            System.out.println("adulta");
        } else if(media >60) {
            System.out.println("idoso");
        }
    }
}
