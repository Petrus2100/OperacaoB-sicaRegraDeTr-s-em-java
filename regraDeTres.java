package aritimeticos;

import java.util.Scanner;

import java.text.DecimalFormat;

public class regraDeTres {

	public static void main(String[] args) {
		double litros, m, m2, x;
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		
		System.out.println("Digite o primeiro valor: ");
		litros = sc.nextDouble();
		
		System.out.println("Digite segundo valor: ");
		m = sc.nextDouble();
		
		System.out.println("Digite o terceiro valor: ");
		m2 = sc.nextDouble();
		
		x = m;
		
		m = (litros * m2) / m;
		
		System.out.println("O resultado da formula eh: " + formatador.format(m));
		 
	}

}
