import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma string para inverter:");
        String input = scanner.nextLine();

        String stringInvertida = inverteString(input);

        System.out.println("String invertida: " + stringInvertida);
    }

    public static String inverteString(String input) {
        char[] caracteres = input.toCharArray();
        int esq = 0;
        int dir = caracteres.length - 1;

        while (esq < dir) {
            char temp = caracteres[esq];
            caracteres[esq] = caracteres[dir];
            caracteres[dir] = temp;

            esq++;
            dir--;
        }

        return new String(caracteres);
    }
}
