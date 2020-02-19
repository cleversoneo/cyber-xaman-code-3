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
public class Exer39 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        boolean ValidaInfos = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        
        do {
            
            System.out.println("Digite seu nome: ");
            nome = scan.next();
            
            if(nome.length() >= 3){
                ValidaInfos = true;
            } else {
                System.out.println("nome precisa no minimo 3 caracteres.");
            }
            
            
        } while(!ValidaInfos);
        
        
        ValidaInfos = false;
        
        do {
            
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();
            
            if(idade >= 0 && idade <= 150){
                ValidaInfos = true;
            } else {
                System.out.println("idade entre 0 e 150.");
            }
            
            
        } while(!ValidaInfos);
        
        
        ValidaInfos = false;
        
        do {
            
            System.out.println("Digite seu salario ");
            salario = scan.nextDouble();
            
            if(salario > 0 ){
                ValidaInfos = true;
            } else {
                System.out.println("salario precisa ser maior que 0.");
            }
            
            
        } while(!ValidaInfos);
        
        
        ValidaInfos = false;
        
        do {
            
            System.out.println("Digite seu sexo ");
            sexo = scan.next();
            
            if(sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")){
                ValidaInfos = true;
            } else {
                System.out.println("sexo precisa ser 'M' ou 'F'.");
            }
            
            
        } while(!ValidaInfos);
        
        ValidaInfos = false;
        
        do {
            
            System.out.println("Digite com seu estado civil ");
            estadoCivil = scan.next();
            
            if(estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") ||
                    estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")){
                ValidaInfos = true;
            } else {
                System.out.println("Estado civil precisa ser 'S', 'C', 'V' ou 'D'.");
            }
            
            
        } while(!ValidaInfos);
        
        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + idade);
        System.out.println("Nome: " + salario);
        System.out.println("Nome: " + sexo);
        System.out.println("Nome: " + estadoCivil);
    }
    
    
    
}
