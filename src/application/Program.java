package application;

import entities.Product;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Program {
    public static void main(String args[]){

        List<Product> list = new ArrayList<>();

        list.add(new Product("tv",500.00));
        list.add(new Product("Geladeira",800.00));
        list.add(new Product("mouse",30.00));

        //a função map aplica a funcao em cada elemento da stream, gerando uma nova stream com elementos transformados
        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}
