//Creare una classe Rettangolo con due attributi interi: base e altezza. 
//Aggiungere un opportuno costruttore con parametri. Aggiungere due metodi: 
//	calcolaArea e calcolaPerimetro che calcolano e restituiscono, rispettivamente, 
//	l’area e il perimetro del rettangolo.
//BONUS Aggiungere alla classe Rettangolo un metodo disegna che disegna in console 
//il rettangolo con le sue dimensioni, come nell’immagine allegata


package org.lessons.java.geometria;

import java.security.PublicKey;
import java.util.Iterator;

public class Rettangolo {
	int base;
	int altezza;
	
	 Rettangolo(int base, int altezza){
		 
		this.base = base;
		this.altezza = altezza;
		
	}
	 
	 public  int calcolaArea() {
		 
		 return base * altezza;
	 }
	 
	 public int calcolaPerimetro() {
		 
	        return  (base + altezza) * 2;
	    }
	 
	 public void disegna() {
		 for (int i = 0; i < base; i++) {
	            for (int j = 0; j < altezza; j++) {
	                if (i == 0 || i == base - 1 || j == 0 || j == altezza - 1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	 }
}
