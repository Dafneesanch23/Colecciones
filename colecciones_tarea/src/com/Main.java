package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Crear un programa en Java que realice lo siguiente:
Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utiliza un objeto HashMap para almacenar los pares de palabras.
Debe solicitar al usuario una palabra en español e imprimir por consola la palabra en inglés.
Si la palabra escrita no se encuentra en el diccionario debe imprimir un mensaje por consola, diciendo que: “La palabra no se encuentra en el diccionario.”.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
gato
cat
Entradas: 
Salida:
Siempre y cuando la palabra se encuentre en el diccionario
		 */
		Scanner scanner = new Scanner (System.in);
		
		Map <String, String> animalsTranslate = new HashMap<>();
		
		animalsTranslate.put("gato", "cat");
		animalsTranslate.put("carpincho", "capibara");
		animalsTranslate.put("tortuga", "turtle");
		animalsTranslate.put("perro", "dog");
		animalsTranslate.put("delfin", "dolphin");
		animalsTranslate.put("mariposa", "butterfly");
		animalsTranslate.put("puercoespin", "porcupine");
		animalsTranslate.put("vaca", "cow");
		animalsTranslate.put("caballo", "horse");
		animalsTranslate.put("nutria", "otter");
		animalsTranslate.put("ballena", "whale");
		animalsTranslate.put("conejo", "rabbit");
		animalsTranslate.put("mapache", "raccoon");
		animalsTranslate.put("manatí", "manatee");
		animalsTranslate.put("perico", "parakeet");
		animalsTranslate.put("pulpo", "octopus");
		animalsTranslate.put("perezoso", "sloth");
		animalsTranslate.put("buho", "owl");
		animalsTranslate.put("pingüino", "penguin");
		animalsTranslate.put("ardilla", "squirrel");
		animalsTranslate.put("erizo", "hedgehog");
		
		
		System.out.println("Ingrese el nombre del animal que desee traducir: ");
		String requestedAnimal = scanner.nextLine().toLowerCase();
		
		//Validar que el animal solicitado se encuentre en la colección
		String animal = animalsTranslate.get(requestedAnimal);
		if (animal == null) {
			System.out.println("El animal solicitado no se encuentra en el diccionario");
		} else { System.out.println("La traducción es: " + animal);
		}
	}

}

