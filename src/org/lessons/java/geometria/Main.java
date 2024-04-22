//Creare una classe Main contenente il metodo main(), nel quale chiedete all’utente 
//di inserire, da console, i valori di base e di altezza con cui istanziare un nuovo 
//Rettangolo. Dopo averlo istanziato, stampate a video il perimetro e l’area.

package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il valore della base del rettangolo");
		int base = scan.nextInt();
		
		System.out.println("Inserisci il valore dell'altezza del rettangolo");
		int altezza = scan.nextInt();
		
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		
		int area = rettangolo.calcolaArea();
		int perimetro = rettangolo.calcolaPerimetro();
		rettangolo.disegna();
        
        System.out.println("Area del rettangolo: " + area);
        System.out.println("Perimetro del rettangolo: " + perimetro);
	}

}
