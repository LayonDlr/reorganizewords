package com.luis.lay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ServiceReorganize {

	public String organiza(String input) {
		JSONObject jsonObject = new JSONObject(input);
		String llave = jsonObject.keys().next();
        String valor = jsonObject.get(llave).toString();
	
		String[] palabras = valor.split("\\s+");
		
		String pares = "";
		String impares = "";
		
			for (String palabra : palabras) {
				
				if (palabra.length() %2 == 0){
					pares = pares +" "+ palabra;
					
				}else {
					impares = impares +" "+palabra;
					
				}
				
        }
		System.out.println(pares+" "+impares);
		String respuesta  = impares.trim()+" "+pares.trim();
		String jsonResult = "{ \""+llave+"\": \"" + respuesta + "\" }";
		return jsonResult;
	
	}
}
