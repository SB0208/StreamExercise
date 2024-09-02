package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);


        for (Integer number : numbers){
            if (number % 2 == 0){

                System.out.println(number);
            }


        }


     int sum =   numbers.stream()
             .filter(number -> number % 2 == 0 )
             .sorted(Comparator.reverseOrder())
             .map(number ->  number * 2)
             .reduce(0, Integer::sum);


        System.out.println(sum);


        numbers.stream()
                .filter(number -> number % 2 == 0 )
                .sorted(Comparator.reverseOrder())
                .map(number -> "Double=" + number * 2)
                .forEach(num -> System.out.println(num));


        System.out.println(numbers);


        numbers.stream()
                .filter(number -> number % 2 == 0 )
                .sorted(Comparator.reverseOrder())
                .map(number -> "Double=" + number * 2)
                .collect(Collectors.toList());



        System.out.println(numbers);

    }
}