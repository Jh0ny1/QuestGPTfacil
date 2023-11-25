import java.util.Scanner;

public class D04Resolução {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a temperatura e a unidade de medida
        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Digite a unidade de medida (C para Celsius, F para Fahrenheit, K para Kelvin): ");
        char unidade = scanner.next().charAt(0);

        // Converte a temperatura para as outras unidades e exibe o resultado
        if (unidade == 'C' || unidade == 'c') {
            exibirResultados(temperatura, "Celsius", celsiusParaFahrenheit(temperatura), celsiusParaKelvin(temperatura));
        } else if (unidade == 'F' || unidade == 'f') {
            exibirResultados(temperatura, "Fahrenheit", fahrenheitParaCelsius(temperatura), fahrenheitParaKelvin(temperatura));
        } else if (unidade == 'K' || unidade == 'k') {
            exibirResultados(temperatura, "Kelvin", kelvinParaCelsius(temperatura), kelvinParaFahrenheit(temperatura));
        } else {
            System.out.println("Unidade de medida inválida. Use C, F ou K.");
        }
    }

    // Método para converter Celsius para Fahrenheit
    static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Método para converter Celsius para Kelvin
    static double celsiusParaKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Método para converter Fahrenheit para Celsius
    static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Método para converter Fahrenheit para Kelvin
    static double fahrenheitParaKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    // Método para converter Kelvin para Celsius
    static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Método para converter Kelvin para Fahrenheit
    static double kelvinParaFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }

    // Método para exibir os resultados da conversão
    static void exibirResultados(double valorOriginal, String unidadeOriginal, double valorConvertido1, double valorConvertido2) {
        System.out.println(valorOriginal + " " + unidadeOriginal + " é equivalente a:");
        System.out.println(valorConvertido1 + " Fahrenheit");
        System.out.println(valorConvertido2 + " Kelvin");
    }
}
