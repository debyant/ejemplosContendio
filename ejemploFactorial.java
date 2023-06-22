package ejemplosContendio;

import java.util.Scanner;

public class ejemploFactorial {
	// Declaramos la clase Scanner
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int fact = 1;
		int num = 0;
		System.out.println("Introduce numero");
		// Pedimos el número por teclado
		num = teclado.nextInt();
		// Se calcula el factorial
		for (int ind = 1; ind <= num; ind++) {
			fact *= ind;
		}
		// Imprime el resultado
		System.out.println("El factorial es " + fact);
	}
}
