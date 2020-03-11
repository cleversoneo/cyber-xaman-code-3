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
public class Exer51 {
    
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o N-ésimo numero da serie de Fibonacci: ");
        int n = scan.nextInt();
        
        int primeiro = 1;
        int segundo = 1;
        int proximo;
        
        System.out.println(primeiro);
        System.out.println(segundo);
        
        for(int i =3; i<=n; i++){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
            
            System.out.println(proximo);
        }
       
        
        
        
        /*if(n<2){
            return n;
        } else{
            (n - 1) + (n - 2);
        }*/
        
        /* FIBONACCI EM LINGUAGEM C
        main(){
	int N, num, numA, numB, i;
	printf("Digite quantos termos devem aparecer.\n");
	scanf("%d", &N);
	numA=1;numB=0;i=0;
	while(i<N){
	printf("%d, ", numA);
	num=numA+numB;
	numB=numA;
	numA=num;
	i++;}
}
        
        
        
        
        */
        
    }
    
}
