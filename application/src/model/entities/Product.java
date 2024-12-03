package model.entities;

import java.util.Objects;

// A classe Product implementa a interface Comparable para permitir a comparação de produtos
public class Product implements Comparable<Product> {

    private String name; // Nome do produto
    private Double price; // Preço do produto

    // Construtor da classe Product
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    // Getters e Setters para os atributos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Método equals para comparar dois produtos
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Product product)) return false; // Verifica se o objeto é uma instância de Product
        return Objects.equals(name, product.name) && Objects.equals(price, product.price); // Compara nome e preço
    }

    // Método hashCode que deve ser sobrescrito quando equals é sobrescrito
    @Override
    public int hashCode() {
        return Objects.hash(name, price); // Gera um hash baseado no nome e preço
    }

    // Método toString para exibir informações do produto
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    // Método compareTo que define a ordem de comparação dos produtos
    @Override
    public int compareTo(Product other) {
        // Compara os nomes dos produtos em caixa alta, para uma comparação case-insensitive
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }
}