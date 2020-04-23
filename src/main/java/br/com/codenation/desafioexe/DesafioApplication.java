package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {

		List<Integer> listaFibonacci = new ArrayList<>();

		int i = 2;

		listaFibonacci.add(0);
		listaFibonacci.add(1);

		while (listaFibonacci.get(listaFibonacci.size() - 1) < 350) {

			listaFibonacci.add(listaFibonacci.get(i - 1) + listaFibonacci.get(i - 2));

			i++;
		}

		return listaFibonacci;
	}

	public static Boolean isFibonacci(Integer a) {

		if( fibonacci().contains(a)){
			return true;
		}else {
			return false;	
		}
	}

}