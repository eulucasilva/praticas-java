package conversor;

import java.util.Scanner;

public class ConvertorTemperatura {
	
	static double celsiusParaFahrenheit (double celsius) {
		
		double fahrenheit;
		
		fahrenheit = (celsius * 9/5) + 32;
		
		return fahrenheit;
		
	}
	
	static double fahrenheitParaCelsius (double fahrenheit) {
		
		double celsius = (fahrenheit - 32) / 1.8;
		
		return celsius;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Digite a temperatura: ");
		Scanner ler = new Scanner(System.in);
		double temperatura = ler.nextDouble();
		
		System.out.println("Digite a unidade de origem [C] Celsius |[F] Fahrenheit: ");
		ler = new Scanner(System.in);
		String unidade = ler.nextLine();
		
		if(unidade.equals("C") || unidade.equals("c")) {
			double fahrenheit = celsiusParaFahrenheit (temperatura);
			System.out.println("Temperatura em Fahrenheit: " + fahrenheit + "°F");
		}
		else if (unidade.equals("F") || unidade.equals("f")){
			double celsius = fahrenheitParaCelsius(temperatura);
			System.out.println("Temperatura em Celsius: " + celsius + "°C");
		}
		else {
			System.out.println("Unidade incorreta!");
		}
	}

}
