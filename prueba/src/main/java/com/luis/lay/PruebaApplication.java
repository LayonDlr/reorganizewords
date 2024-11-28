package com.luis.lay;

import org.hibernate.Length;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PruebaApplication {

	public String reorganize_words(String input){
		String cadena = "apple orange banana peach grape";
		String impares = "";
		String par = "";
		int ini = 0;
		for(int i = 0; i < cadena.length(); i++) {

			if (cadena.charAt(i) == ' ') {
				int longitud = cadena.substring(ini,i).length();
				//System.out.println(longitud % 2);
				//System.out.print("Longitud" + cadena.substring(ini,i).length());
				
				if ((cadena.substring(ini,i).length()) % 2  == 0) {
					System.out.print(cadena.substring(ini,i).length());
					impares += cadena.substring(ini,i);
				}else {
					par += cadena.substring(ini,i);
				}
				ini = i;
			}
		}
		String resultado = impares + par;
			
		JsonObject jsonObject = new JsonObject();

			
		return String.json();
		System.out.println(resultado);

	}
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaApplication.class, args);
		
		/*Dado un string con palabras separadas por espacios, 
		reorganízalo de forma que las palabras con una cantidad 
		impar de letras aparezcan primero (en el orden en que están) y 
		luego las palabras con una cantidad par de letras, también en su orden original.*/
		
		
		
		
	
	}

}
