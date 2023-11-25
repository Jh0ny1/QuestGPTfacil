import java.util.Scanner;
//Essa linha importa a classe Scanner do pacote java.util. A classe Scanner é usada para obter entrada do usuário a partir do console.

public class D02Resolução {
    public static void main(String[] args) {
// Todo o código que será executado parte do "main"

        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita ao usuário que insira dois números. Os números são lidos como valores do tipo double usando o método nextDouble do objeto Scanner.
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            // Um menu é exibido no console, apresentando as opções de operações disponíveis.
            System.out.println("Escolha a operação:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");

            // O programa solicita ao usuário que escolha uma operação digitando o número correspondente. A escolha é lida como um valor do tipo int usando o método nextInt do objeto Scanner.
            System.out.print("Digite o número da operação desejada: ");
            int choice = scanner.nextInt();

            double result = 0;

            // Executa a operação escolhida e exibe o resultado
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    // Verifica se o segundo número é diferente de zero antes de realizar a divisão
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Erro: Não é possível dividir por zero.");
                        return; // Encerra o programa
                    }
                    break;
                default:
                    System.out.println("Erro: Operação inválida.");
                    return; // Encerra o programa
            }
            //O programa usa uma estrutura de switch para executar a operação escolhida pelo usuário. Dependendo da escolha, os números fornecidos pelo usuário são usados em uma operação específica (adição, subtração, multiplicação ou divisão). Se o usuário tentar dividir por zero, uma mensagem de erro é exibida e o programa é encerrado.

            // Exibe o resultado
            System.out.println("Resultado: " + result);
        }
    }
}
