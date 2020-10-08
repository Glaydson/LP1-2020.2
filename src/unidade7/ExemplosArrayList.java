package unidade7;

import java.util.ArrayList;

public class ExemplosArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(3);
		numeros.add(4);
		numeros.add(Integer.parseInt("5"));
		numeros.add(1,10);
		
		for (Integer x: numeros) {
			System.out.print(x + " ");
		}
		
		numeros.remove(0);
		System.out.println();
		for (Integer x: numeros) {
			System.out.print(x + " ");
		}

	}

}
