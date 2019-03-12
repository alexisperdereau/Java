//Exercice 3.6

import java.util.*;

/**
*
*@author alexisperdereau
*
*/


public class Ex3_6 {
	
	public static void main(String[] args) {
		
		int n = 10000;
		int cpt = 1;
		int  cptDiv= 0;
		int[] array = new int[n+1];
		array[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i%j == 0) {
					cptDiv++;
				}
			}
			array[i] = cptDiv;
			if (cptDiv >= cpt) {
				cpt = cptDiv;
			}
			cptDiv = 0;
		}
		System.out.println("Among integers between 1 and " + n + ",");
		System.out.println("The maximum number of divisors was " + cpt);
		System.out.println("Numbers with that many divisors include:");
		for (int i = 0; i <= n; i++) {
			if (array[i] == cpt) {
				System.out.println(i);
			}
		}
	}
}
