import java.util.Scanner;

public class SequenciaFibonacci {

    // 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
    // sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
    // 13, 21, 34...), escreva um programa em java onde, informado um número, ele
    // calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número
    // informado pertence ou não a sequência.

    // IMPORTANTE:

    // Esse número pode ser informado através de qualquer entrada de sua preferência
    // ou pode ser previamente definido no código;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (estaNaSequenciaFibonacci(numero)) {
            System.out.println("O número informado pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número informado NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean estaNaSequenciaFibonacci(int numero) {
        int a = 0;
        int b = 1;

        while (b < numero) {
            int temp = b;
            b += a;
            a = temp;
        }

        return b == numero;
    }
}
