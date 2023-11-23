package calculadora;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		System.out.println("Digite o primeiro número: ");
		Scanner ler = new Scanner(System.in);
		int num1 = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		ler = new Scanner(System.in);
		int num2 = ler.nextInt();
		
		System.out.println("Digite a operação (+, -, *, /): ");
		ler = new Scanner(System.in);
		String opcao = ler.nextLine();
		
		switch(opcao) {
			case "+":
				System.out.println("Soma: " + (num1+num2));
				break;
			case "-":
				System.out.println("Subtração: " + (num1-num2));
				break;
			case "*":
				System.out.println("Multiplicação: " + (num1*num2));
				break;
			case "/":
				System.out.println("Divisão: " + (num1/num2));
				break;
			default:
				System.out.println("Operação incorreta!!");
		}
	}

}
