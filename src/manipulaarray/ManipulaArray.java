package manipulaarray;

import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {
	
	public static int[] criarArrayDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        
        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        

        return array;
    }

    public static int[] criarArrayAleatorio(int tamanho, int limite) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(limite);
        }

        return array;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int elemento : array) {
            soma += elemento;
        }
        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int elemento : array) {
            if (elemento > maior) {
                maior = elemento;
            }
        }
        return maior;
    }

    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int elemento : array) {
            if (elemento < menor) {
                menor = elemento;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] arrayUsuario = criarArrayDoUsuario();
        System.out.println("Array criado pelo usuário: " + java.util.Arrays.toString(arrayUsuario));

       
        System.out.print("Digite o tamanho do array aleatório: ");
        int tamanhoAleatorio = scanner.nextInt();
        System.out.print("Digite o limite para os valores aleatórios: ");
        int limiteAleatorio = scanner.nextInt();
        int[] arrayAleatorio = criarArrayAleatorio(tamanhoAleatorio, limiteAleatorio);
        System.out.println("Array criado aleatoriamente: " + java.util.Arrays.toString(arrayAleatorio));

        
        int soma = calcularSoma(arrayUsuario);
        System.out.println("Soma dos elementos do array do usuário: " + soma);

        
        int maiorValor = encontrarMaiorValor(arrayAleatorio);
        int menorValor = encontrarMenorValor(arrayAleatorio);
        System.out.println("Maior valor no array aleatório: " + maiorValor);
        System.out.println("Menor valor no array aleatório: " + menorValor);
        
    }

}
