package calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		System.out.println("Digite o primeiro número: ");
		Scanner ler = new Scanner(System.in);
		String num1 = ler.nextLine();
		int number1 = Integer.parseInt(num1);
		
		System.out.println("Digite o segundo número: ");
		ler = new Scanner(System.in);
		String num2 = ler.nextLine();
		int number2 = Integer.parseInt(num2);
		
		System.out.println("Digite a operação (+, -, *, /): ");
		ler = new Scanner(System.in);
		String opcao = ler.nextLine();
		
		switch(opcao) {
			case "+":
				System.out.println("Soma: " + (number1+number2));
				break;
			case "-":
				System.out.println("Subtração: " + (number1-number2));
				break;
			case "*":
				System.out.println("Multiplicação: " + (number1*number2));
				break;
			case "/":
				System.out.println("Divisão: " + (number1/number2));
				break;
			default:
				System.out.println("Operação incorreta!!");
		}
	}

}
