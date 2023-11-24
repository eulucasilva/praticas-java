package conversor;

import java.util.Scanner;

public class ConversorTemperatura {

	static double celsiusParaFahrenheit(double celsius) {

		double fahrenheit;

		fahrenheit = (celsius * 9 / 5) + 32;

		return fahrenheit;

	}

	static double fahrenheitParaCelsius(double fahrenheit) {

		double celsius = (fahrenheit - 32) / 1.8;

		return celsius;

	}

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite a temperatura: ");
			double temperatura;
			if (ler.hasNextDouble()) {
				temperatura = ler.nextDouble();
			} else {
				System.out.println("Entrada inválida para temperatura.");
				return;
			}

			System.out.println("Digite a unidade de origem [C] Celsius | [F] Fahrenheit: ");
			String unidade = ler.next().toLowerCase();

			if (unidade.equals("c")) {
				double fahrenheit = celsiusParaFahrenheit(temperatura);
				System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
			} else if (unidade.equals("f")) {
				double celsius = fahrenheitParaCelsius(temperatura);
				System.out.println("Temperatura em Celsius: " + celsius + "°C");
			} else {
				System.out.println("Unidade incorreta!");
			}
		}

	}
}
