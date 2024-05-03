package org.example;
import javax.lang.model.element.Element;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> myNumberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        for (Integer element : myNumberList) {
            System.out.println(element);
        }

        System.out.println("-------------------------");


        myNumberList.stream().forEach(System.out::println);

        List<Integer> listAfterStream = myNumberList.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("--------------------");

        System.out.println("Gerade Zahlen");
        for (Integer element : listAfterStream) {
            System.out.println(element);
        }


    }
}