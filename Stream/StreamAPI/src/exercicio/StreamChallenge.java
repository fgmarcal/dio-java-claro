package exercicio;

import java.util.List;
import java.util.stream.IntStream;

public class StreamChallenge {

    //"Desafio 1 - Mostre a lista na ordem numérica: "
    public static List<Integer> orderList(List<Integer> list) {
        var inOrder = list.stream()
                .sorted()
                .toList();
        return inOrder;
    }

    //"Desafio 2 - Imprima a soma dos números pares da lista: "
    public static int sumThePairs(List<Integer> list) {
        var pairs = list.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0,(a, b) -> a + b);
        return pairs;
    }

    //Desafio 3 - Verifique se todos os números da lista são positivos:
    public static boolean areAllPositive(List<Integer> list) {
        var positives = list.stream()
                .allMatch(n -> n > 0);
        return positives;
    }

    //Desafio 4 - Remova todos os valores ímpares
    public static List<Integer> removeOdds(List<Integer> list) {
        var onlyPairs = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        return onlyPairs;
    }

    //Desafio 5 - Calcule a média dos números maiores que 5:
    public static double returnTheAverageAboveFive(List<Integer> list) {
        var aboveFiveOnly = list.stream()
                .filter(n -> n > 5)
                .count();

        var sumAboveFive = list.stream()
                .filter(n -> n > 5)
                .mapToInt(n -> n)
                .sum();

        double media = sumAboveFive / aboveFiveOnly;
        return media > 0 ? media:0;
    }

    //Desafio 6 - Verificar se a lista contém algum número maior que 10:
    public static boolean hasNumberAboveTen(List<Integer> list) {
        var result = list.stream()
                .anyMatch(n -> n > 10);
        return result;
    }

    //Desafio 7 - Encontrar o segundo número maior da lista:
    public static int findSecondLargest(List<Integer> list) {
        var maxNumber = list.stream().max(Integer::compare).get();
        var secondLargest = list.stream()
                .filter(n -> n < maxNumber)
                .max(Integer::compare).get();

        return secondLargest;
    }

    //Desafio 8 - Somar os dígitos de todos os números da lista:
    public static int sumAllDigits(List<Integer> list) {
        var sum = list.stream().mapToInt(Integer::intValue).sum();
        return sum;
    }

    //Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
    public static List<Integer> removeRepetitions(List<Integer> list) {
        var distinct = list.stream()
                .distinct()
                .toList();
        return distinct;
    }

    //Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
    public static List<Integer> groupOddsDivisibleBy3or5(List<Integer> list) {
        var result = list.stream()
                .filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0))
                .toList();
        return result;
    }


    //Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
    public static int sumOfSquares(List<Integer> list) {
        var sum = list.stream()
                .mapToInt(n -> n * n)
                .sum();
        return sum;
    }

    //Desafio 12 - Encontre o produto de todos os números da lista:
    public static int productOfAllNumbers(List<Integer> list) {
        var result = list.stream()
                .reduce(1, (a, b) -> a * b);

        return result;
    }

    //Desafio 13 - Filtrar os números que estão dentro de um intervalo:
    public static List<Integer> filterInterval(List<Integer> list, int minValue, int maxValue) {
        var filtered = list.stream()
                .filter(n -> n >= minValue && n <= maxValue)
                .toList();
        return filtered;
    }

    //Desafio 14 - Encontre o maior número primo da lista:
    public static int largestPrimeNumber(List<Integer> list) {
        var primes = list.stream()
                .filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
                        .noneMatch((number) -> n % number == 0))
                .toList();

        var largestPrime = primes.stream().max(Integer::compare).get();
        return largestPrime;
    }

    //Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
    public static boolean containsNegative(List<Integer> list) {
        var hasNegative = list.stream()
                .anyMatch(n -> n < 0);
        return hasNegative;
    }

    //Desafio 16 - Agrupe os números em pares e ímpares:
    public static List<List<Integer>> segregatePairsAndOdds(List<Integer> list) {
        var onlyOdd = list.stream()
                .filter(n -> n % 2 != 0)
                .toList();
        var onlyPairs = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        return List.of(onlyPairs, onlyOdd);
    }

    // Desafio 17 - Filtrar os números primos da lista:
    public static List<Integer> onlyPrimes(List<Integer> list) {
        var primes = list.stream()
                .filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
                        .noneMatch((number) -> n % number == 0))
                .toList();
        return primes;
    }

    // Desafio 18 - Verifique se todos os números da lista são iguais:
    public static boolean areAllEqual(List<Integer> list) {
        var isEqual = list.stream()
                .distinct().count();
        return isEqual <= 1;
    }

    // Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
    public static int sumIfDivisibleBy3and5(List<Integer> list) {
        var result = list.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        return result;
    }


}
