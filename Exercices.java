//Exercice 3.4

import java.util.*;

/**
*
*@author alexisperdereau
*
*/


public class Exercices {
	
	public static void main (String [] args) {
		
		System.out.println("Entrez une phrase : ");
		Scanner sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		String tmp = "";
		
		for (int i = 0; i < line.length(); i++) {
			if (!((line.charAt(i) >= 'a' && line.charAt(i) <= 'z') || (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z'))) {
				if (line.charAt(i) == ' ' || line.charAt(i) == '\'') {	
					if (tmp != "") System.out.println(tmp);
					tmp = "";
				}
			}
			else {
				tmp += line.charAt(i);
			}
		}
		System.out.println(tmp);
	}
}
