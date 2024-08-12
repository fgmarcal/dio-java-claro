import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SemanaMaiorConsumo {

    // Função para calcular o consumo total de dados móveis
    public static int calcularConsumoTotal(String[] consumoSemanal) {
        int total = 0;
        List<String> cons = Arrays.asList(consumoSemanal);
        total = cons.stream()
                .map((consumo) -> consumo = String.valueOf(Integer.parseInt(consumo)))
                .mapToInt(Integer::parseInt).sum();


        return total;
    }

    // Função para calcular a média semanal de consumo de dados móveis
    public static int calcularMediaSemanal(int totalConsumo, int numeroDeSemanas) {
        return totalConsumo / numeroDeSemanas;
    }

    // Função para identificar a semana de maior consumo
    public static int identificarSemanaDeMaiorConsumo(String[] consumoSemanal) {
        int consumo = 0;
        int semanaDeMaiorConsumo = 0;
        int maiorConsumo = 0;

        // Função para identificar a semana de maior consumo
        for (int i = 0; i < consumoSemanal.length; i++) {
            consumo = Integer.parseInt(consumoSemanal[i].trim());
            if(consumo > maiorConsumo) {
                maiorConsumo = consumo;
                semanaDeMaiorConsumo = i;
            }
        }
        return semanaDeMaiorConsumo+1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de consumos semanais em MB
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] consumoSemanal = input.split(",");

        // Calculando o consumo total de dados móveis no mês
        int totalConsumo = calcularConsumoTotal(consumoSemanal);

        // Calculando a média semanal de consumo de dados móveis
        int mediaSemanal = calcularMediaSemanal(totalConsumo, consumoSemanal.length);

        // Identificando a semana de maior consumo
        int semanaDeMaiorConsumo = identificarSemanaDeMaiorConsumo(consumoSemanal);

        // Exibindo o consumo total de dados móveis no mês
        System.out.println("Total mensal: " + totalConsumo + " MB");

        // Exibindo a média semanal de consumo
        System.out.println("Media semanal: " + mediaSemanal + " MB");

        // Exibindo a semana de maior consumo
        System.out.println("Maior consumo: Semana " + semanaDeMaiorConsumo);

        scanner.close();
    }
}
