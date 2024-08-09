import exercicio.StreamChallenge;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamChallengeTest {

    @Test
    public void shouldPrintOrderedList(){
        List<Integer> unOrdered= List.of(5,6,1,2,3,4);
        List<Integer> ordered= List.of(1,2,3,4,5,6);

        var result = StreamChallenge.orderList(unOrdered);

        Assertions.assertEquals(ordered,result);
    }

    @Test
    public void shouldSumThePairsOnly(){
        List<Integer> list = List.of(1,2,3,4,5,6);
        int pairsSum = 12;

        var result = StreamChallenge.sumThePairs(list);

        Assertions.assertEquals(pairsSum,result);
    }

    @Test
    public void shouldReturnTrueForAllPositives(){
        List<Integer> list = List.of(1,2,3,4,5,6);

        var result = StreamChallenge.areAllPositive(list);

        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForAllPositives(){
        List<Integer> list = List.of(1,-2,3,4,5,6);

        var result = StreamChallenge.areAllPositive(list);

        Assertions.assertFalse(result);
    }

    @Test
    public void shouldRemoveTheOdds(){
        List<Integer> list = List.of(1,2,3,4,5,6);
        List<Integer> pairsOnly = List.of(2,4,6);

        var result = StreamChallenge.removeOdds(list);

        Assertions.assertEquals(pairsOnly,result);
    }

    @Test
    public void shouldReturnTheAverageIfNumbersAreAboveFive(){
        List<Integer> list = List.of(1,2,3,4,5,6,7);

        double average = (7+6)/2;

        var result = StreamChallenge.returnTheAverageAboveFive(list);

        Assertions.assertEquals(average,result);
    }

    @Test
    public void shouldReturnTrueIfHasNumberAbove10(){
        List<Integer> list = List.of(1,2,3,4,5,6,12);

        var result = StreamChallenge.hasNumberAboveTen(list);

        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForDoesntHaveNumberAbove10(){
        List<Integer> list = List.of(1,2,3,4,5,6);

        var result = StreamChallenge.hasNumberAboveTen(list);

        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnSecondLargest(){
        List<Integer> list = List.of(3,5,6,7);

        int secondLargest = 6;

        var result = StreamChallenge.findSecondLargest(list);

        Assertions.assertEquals(secondLargest,result);
    }

    @Test
    public void shouldReturnTheSumOfAllNumbers(){
        List<Integer> list = List.of(1,2,3,4,5,6);

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        var result = StreamChallenge.sumAllDigits(list);

        Assertions.assertEquals(sum,result);
    }

    @Test
    public void shouldReturnAListWithUniqueElements(){
        List<Integer> list = List.of(1,2,3,4,5,6,6,7,1);
        List<Integer> unique = List.of(1,2,3,4,5,6,7);
        var result = StreamChallenge.removeRepetitions(list);

        Assertions.assertEquals(unique, result);
    }

    @Test
    public void shouldReturnAListOfMultiplesBy3or5(){
        List<Integer> list = List.of(1,3,5,11,15,9,4);
        List<Integer> multiplesOnly = List.of(3,5,15,9);

        var result = StreamChallenge.groupOddsDivisibleBy3or5(list);

        Assertions.assertEquals(multiplesOnly,result);
    }

    @Test
    public void shouldReturnAnEmptyList(){
        List<Integer> list = List.of(1,2,8);

        List<Integer> empty = List.of();

        var result = StreamChallenge.groupOddsDivisibleBy3or5(list);

        Assertions.assertEquals(empty,result);
    }

    @Test
    public void shouldReturnTheSumOfSquaresOfAllNumbers(){
        List<Integer> list = List.of(1,2,3);

        int squared = (1+4+9);

        var result = StreamChallenge.sumOfSquares(list);

        Assertions.assertEquals(squared,result);
    }

    @Test
    public void shouldReturnTheProductOfAllNumbers(){
        List<Integer> list = List.of(1,2,3);

        int product = (1*2*3);

        var result = StreamChallenge.productOfAllNumbers(list);

        Assertions.assertEquals(product,result);
    }

    @Test
    public void shouldReturnAFilteredList(){
        List<Integer> list = List.of(1,2,3,4,5,6);
        int minValue = 2;
        int maxValue = 5;
        List<Integer> filtered = List.of(2,3,4,5);

        var result = StreamChallenge.filterInterval(list, minValue, maxValue);

        Assertions.assertEquals(filtered,result);
    }

    @Test
    public void shouldReturnAnEmptyListIfFilterNotApplicableToList(){
        List<Integer> list = List.of(1,2,3,4,5,6);
        int minValue = 7;
        int maxValue = 10;
        List<Integer> filtered = List.of();

        var result = StreamChallenge.filterInterval(list, minValue, maxValue);

        Assertions.assertEquals(filtered,result);
    }

    @Test
    public void shouldReturnLargestPrime(){
        List<Integer> list = List.of(1,2,3,4,5,6,11,97);

        int largestPrime = 97;

        var result = StreamChallenge.largestPrimeNumber(list);

        Assertions.assertEquals(largestPrime,result);
    }

    @Test
    public void shouldReturnFalseForNegativeOnList(){
        List<Integer> list = List.of(1,2,3,4,5,6);

        var result = StreamChallenge.containsNegative(list);

        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnTrueForNegativeOnList(){
        List<Integer> list = List.of(1,2,-3,4,5,6);

        var result = StreamChallenge.containsNegative(list);

        Assertions.assertTrue(result);
    }

    @Test
    public void shouldSegregatePairsAndOddsIntoTwoLists(){
        List<Integer> list = List.of(1,2,3,4,5,6);

        List<List<Integer>> segregated = List.of(Arrays.asList(2,4,6), Arrays.asList(1,3,5));

        var result = StreamChallenge.segregatePairsAndOdds(list);

        Assertions.assertEquals(segregated,result);
    }

    @Test
    public void shouldReturnOnlyPrimeNumbers(){
        List<Integer> list = List.of(1,2,3,4,5,6,7,11);

        List<Integer> onlyPrimes = List.of(2,3,5,7,11);

        var result = StreamChallenge.onlyPrimes(list);

        Assertions.assertEquals(onlyPrimes,result);
    }

    @Test
    public void shouldReturnTrueIfAllAreEqual(){
        List<Integer> list = List.of(1,1,1,1,1,1,1);

        var result = StreamChallenge.areAllEqual(list);

        Assertions.assertTrue(result);
    }

    @Test
    public void shouldReturnFalseAllAreEqual(){
        List<Integer> list = List.of(1,1,2,1,1,1,1);

        var result = StreamChallenge.areAllEqual(list);

        Assertions.assertFalse(result);
    }

    @Test
    public void shouldReturnTheSumIfDivisibleBy3or5(){
        List<Integer> list = List.of(1,2,3,4,5,6,25,15);
        int sum = 15;

        var result = StreamChallenge.sumIfDivisibleBy3and5(list);

        Assertions.assertEquals(sum,result);
    }

    @Test
    public void shouldReturnZeroIfNoneIsDivisibleBy3or5(){
        List<Integer> list = List.of(1,2,3,4,5,6,25);
        int zero = 0;

        var result = StreamChallenge.sumIfDivisibleBy3and5(list);

        Assertions.assertEquals(zero,result);
    }
}
