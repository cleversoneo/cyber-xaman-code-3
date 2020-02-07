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
public class Exer38 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        boolean ValidaInfos = false;
        do {
            
        
        
        System.out.println("Digite um nome de usuario: ");
        String name = scan.next();
        
        System.out.println("Digite uma senha: ");
        String password = scan.next();
        
        if(password.equals(name)){
            //ValidaInfos = false;   nao precisa pois acima já está false
            System.out.println("ERRO (Usuario e senha iguais) - digite novamente");   
        } else {
            ValidaInfos = true;
            System.out.println("OK dados cadastrados com sucesso");
        }
        
    } while(!ValidaInfos);
        
        }
    
}
