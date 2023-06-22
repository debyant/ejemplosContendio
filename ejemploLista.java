package ejemplosContendio;

import java.util.ArrayList;
import java.util.Collections;

public class ejemploLista {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		numeros.add(4);
		numeros.add(2);
		numeros.add(3);
		System.out.println("ArrayList no ordenado: " + numeros);
		Collections.sort(numeros);
		System.out.println("ArrayList ordenado: " + numeros);
	}
}
