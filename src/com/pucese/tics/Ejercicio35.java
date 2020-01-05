package com.pucese.tics;

import java.util.Scanner;

public class Ejercicio35 {

	/* Anthony Aveiga
	 * 35. Suponga que b [] es una matriz de 100 elementos, con todas las entradas
	 * inicializadas en 0, y que a [] es una matriz de N elementos, cada uno de los
	 * cuales es un número entero entre 0 y 99. ¿Cuál es el efecto del siguiente
	 * ciclo? for (j = 0; j < N; j++) b[a[j]]++;
	 */

	public static void inicializarMatriz(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}

	}

	public static void llenarMatriz(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int rand = (int) Math.floor(Math.random() * 100);
			array[i] = rand;
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = 0;
		int[] b = new int[100];
		
		System.out.println("Ingrese el valor de N: ");
		N = input.nextInt();
		input.close();
		int[] a = new int[N];

		inicializarMatriz(b);
		llenarMatriz(a);
		
		System.out.println("Resultado del bucle: ");
		for (int j = 0; j < N; j++)
			System.out.printf("  " + b[a[j]]++);

	}
}