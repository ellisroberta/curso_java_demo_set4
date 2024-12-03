package application;

import model.entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static void main(String[] args) {

        // Cria um TreeSet que armazenará objetos do tipo Product
        Set<Product> set = new TreeSet<>();

        // Adiciona produtos ao conjunto
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));

        // Itera sobre o conjunto e imprime cada produto
        for (Product p : set) {
            System.out.println(p); // Utiliza o método toString para exibir informações do produto
        }
    }
}