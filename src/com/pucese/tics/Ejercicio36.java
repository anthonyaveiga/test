package com.pucese.tics;

public class Ejercicio36 {
	
	/*	Anthony Aveiga 
	 * 36. Modifique RandomStudent.java para que almacene una matriz paralela de tipo
	 * booleano llamada isFemale, donde el elemento i es verdadero si el estudiante
	 * i es femenino y falso de lo contrario. Ahora, imprima un estudiante masculino
	 * al azar y una estudiante femenina al azar. Sugerencia: use un bucle do-while
	 * para generar enteros aleatorios hasta que obtenga uno que indexe a un
	 * estudiante masculino.
	 */

	public static void main(String[] args) {

		String[] names = {
				"Clelia Zacharias", "Hannah Xu",
	            "Virginia Wylly",   "Wendy Wu",
	            "Ashely Wolf",      "Eric Whitman",
	            "Will Weidman",     "Sharon Weeks",
	            "Mary Wathall",     "Sarah Wang",
	            "Michael Wang",     "Madeleine Walsh"
	        };

		boolean[] isFemale = { 
							true, true, 
							true, true, 
							true, false, 
							false, true, 
							true, true, 
							false, true 
			};

		int n = names.length;
		int r;
		
		do {
			r = (int) (Math.random() * n);
		} while (isFemale[r]);
		System.out.println("Estudiante masculino: " +names[r]);
		
		do {
			r = (int) (Math.random() * n);
		} while (!isFemale[r]);
		System.out.println("Estudiante femenina: " +names[r]);
	}
}
