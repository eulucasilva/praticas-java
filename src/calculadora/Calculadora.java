/*
 * 1. O que é uma exceção em Java e qual é o propósito de usá-las em programas?

Em Java, uma exceção é um evento anormal que ocorre durante a execução de um programa, que interfere no fluxo normal de execução. 
As exceções podem ser causadas por diversos motivos, como erros de programação, condições inesperadas ou falhas em tempo de execução.
O propósito de usar exceções em programas é lidar com situações excepcionais de forma controlada e elegante, em vez de simplesmente 
interromper abruptamente a execução do programa. Ao usar exceções, os programadores podem criar um código mais robusto, capaz de lidar 
com erros de maneira adequada, fornecendo informações úteis sobre o que deu errado e permitindo que o programa tome medidas apropriadas.
  
  
 * 2. Pesquise sobre a diferença entre exceções verificadas e não verificadas em Java. Dê exemplos de cada uma.

Exceções verificadas: São exceções que o compilador exige que sejam tratadas explicitamente ou declaradas no método que as lança. 
Essas exceções são subclasses de Exception, excluindo RuntimeException e suas subclasses. EExemplo:

import java.io.IOException;

public class ExcecaoVerificada {
    public static void main(String[] args) {
        try {
            throw new IOException("Exceção verificada");
        } catch (IOException e) {
            System.out.println("Tratando a exceção: " + e.getMessage());
        }
    }
}

Exceções não verificadas: Também conhecidas como exceções de tempo de execução, não são verificadas pelo compilador. 
São subclasses de RuntimeException e suas subclasses.

public class ExcecaoNaoVerificada {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(array[5]);  // ArrayIndexOutOfBoundsException
    }
}

 * 3. Como você pode lidar com exceções em Java? Quais são as palavras-chave e as práticas comuns para tratamento de exceções?

Em Java, as palavras-chave fundamentais para lidar com exceções são try, catch, throw, throws e finally.

-try: Define um bloco de código no qual exceções podem ocorrer.
-catch: Captura exceções lançadas dentro do bloco try. Pode haver vários blocos catch para tratar diferentes tipos de exceções.
-throw: Lança explicitamente uma exceção.
-throws: Declara que um método pode lançar uma exceção específica.
-finally: Define um bloco de código que será executado independentemente de ocorrer ou não uma exceção.

Práticas comuns incluem:

Capturar exceções específicas para tratamento diferenciado.
Utilizar finally para código que deve ser executado independentemente de exceções.
Lançar exceções personalizadas quando necessário.

 * 4. O que é o bloco "try-catch" em Java? Como ele funciona e por que é importante usá-lo ao lidar com exceções?

O bloco try-catch é usado para envolver um código onde exceções podem ocorrer. O bloco try contém o código que pode gerar exceções, 
enquanto o bloco catch contém o código para lidar com exceções específicas.

O bloco try funciona da seguinte forma:

O código dentro do bloco try é executado.
Se ocorrer uma exceção, a execução é interrompida no ponto da exceção, e o controle passa para o bloco catch correspondente.
É importante usar o bloco try-catch porque permite que o programa lide com exceções de maneira controlada, evitando falhas 
inesperadas e fornecendo um mecanismo para tratar erros de forma adequada.


 * 5. Quando é apropriado criar suas próprias exceções personalizadas em Java e como você pode fazer isso? 
 Dê um exemplo de quando e por que você criaria uma exceção personalizada.

É apropriado criar suas próprias exceções personalizadas quando você precisa representar uma situação específica no seu domínio 
de problema que não é adequadamente coberta por exceções padrão. Isso torna o código mais legível e ajuda a distinguir entre 
diferentes tipos de erros.
Para criar uma exceção personalizada, você deve criar uma classe que herda de Exception (ou uma de suas subclasses) e pode 
adicionar campos ou métodos personalizados conforme necessário.
 * 
 * */

package calculadora;

public class Calculadora {
	public static int dividir(int numerador, int denominador) throws DivisionByZeroException {
        if (denominador == 0) {
            throw new DivisionByZeroException("Divisão por zero não é permitida.");
        }
        return numerador / denominador;
    }

    public static void main(String[] args) {
        try {
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (DivisionByZeroException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}
