import java.util.Scanner;

public class D03Resolução {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário que insira um número
            System.out.print("Digite um número inteiro positivo: ");
            int numero = scanner.nextInt();
//O programa solicita que o usuário insira um número inteiro positivo. O número é lido como um valor do tipo int usando o método nextInt do objeto Scanner.

            // Verifica se o número é primo
            if (ehPrimo(numero)) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }
    }

    // Método para verificar se um número é primo
    static boolean ehPrimo(int num) {
        // Um número primo é um número maior que 1 que não é divisível por nenhum número, exceto por 1 e ele mesmo.
        if (num <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Se for divisível por algum número entre 2 e a raiz quadrada do número, não é primo
            }
        }
        return true; // Se não foi divisível por nenhum número, é primo
    }
}
