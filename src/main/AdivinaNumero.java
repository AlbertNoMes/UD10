/*
 * AUTOR: ALBERT NOTARIO MESTRES
 * DATA: 7/02/22
 */

package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinaNumero {
	Scanner consola = new Scanner(System.in);
	static int numAleatorio = (int) Math.round(Math.random() * 499 + 1);

	public void aciertaNumero() {
		int seleccion = 0;
		int intentos = 0;

		do {
			try {
				System.out.println("Introduce un número entre 1 y 500:");
				seleccion = consola.nextInt();
				intentos++;

				esCorrecto(seleccion, intentos);

			} catch (InputMismatchException e) {
				System.out.println("Valor incorrecto.");
				consola.nextLine();
				intentos++;
			}
			
		} while (seleccion != numAleatorio);

	}
	
	public static void esCorrecto(int seleccion, int intentos) {
		
		if (seleccion > numAleatorio) {
			System.out.println("El número introducido es MAYOR, vuelve a intentar.");
		} else if (seleccion < numAleatorio) {
			System.out.println("El número introducido es MENOR, vuelve a intentar.");
		} else if (seleccion == numAleatorio) {
			System.out.println("¡CORRECTO! Has necesitado "+intentos+" intentos.");
		}
		
	}
	
}
