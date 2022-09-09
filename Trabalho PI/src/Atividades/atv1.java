package Atividades;
import java.util.Scanner;

public class atv1 {
public static void main (String [] args) {
	Scanner ler = new Scanner (System.in);
	int n [] = new int [5];
	int maior = 0, menor = 0;
	for (int i = 0; i < 5; i++) {
     System.out.println ("Informe o " + (i  + 1)+ " numero!");
     n [i] = ler.nextInt ();
     if (n [i] > maior) {
    	 maior = i;
     }
  }  
	for (int j = 0; j < 5; j++) {
		if(n [j] < menor){
			menor = j;
		}
	}
	System.out.println("O maior numero e: " + maior);
	System.out.println("O menor numero e: " + menor);
   }
}
