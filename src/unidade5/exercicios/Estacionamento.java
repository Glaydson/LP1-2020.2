package unidade5.exercicios;

import java.util.Scanner;

public class Estacionamento {

	public static void main(String[] args) {
		/*
		 * Um estacionamento cobra uma tarifa m�nima de R$ 2,00 para estacionar por at�
		 * tr�s horas. Um adicional de R$ 0,50 por hora n�o necessariamente inteira �
		 * cobrado ap�s as tr�s primeiras horas. A tarifa m�xima para qualquer dado
		 * per�odo de 24 horas � R$ 10,00. Suponha que nenhum carro fique estacionado
		 * por mais de 24 horas por vez. Escreva um aplicativo que calcule e exiba as
		 * tarifas de estacionamento para cada cliente que estacionou nessa garagem
		 * ontem. Voc� deve inserir as horas de estacionamento para cada cliente. O
		 * programa deve exibir a cobran�a para o cliente atual e calcular e exibir o
		 * total dos recibos de ontem. Ele deve utilizar o m�todo calculaTarifas para
		 * determinar a tarifa para cada cliente.
		 */

		Scanner entrada = new Scanner(System.in);
		System.out.println(
				"Digite a quantidade de horas estacionadas para o cliente atual ou o valor zero (0) para terminar: ");
		int horas = entrada.nextInt();
		double tarifa = 0, totalTarifas = 0;
		while (horas != 0) {
			tarifa = calcularTarifa(horas);
			totalTarifas = totalTarifas + tarifa;
			System.out.printf("Tarifa para o cliente atual � R$ %.2f%n", tarifa);
			System.out.println(
					"Digite a quantidade de horas estacionadas para o cliente atual ou o valor zero (0) para terminar: ");
			horas = entrada.nextInt();
		}
		
		System.out.printf("Total de tarifas: %.2f%n", totalTarifas);

	}

	private static double calcularTarifa(int qtdeHoras) {

		double tarifa = 0;

		if (qtdeHoras <= 3) {
			tarifa = 2;
		} else {
			tarifa = 2 + (0.50 * (qtdeHoras - 3));
			if (tarifa > 10) {
				tarifa = 10;
			}
		}

		return tarifa;
	}

}
