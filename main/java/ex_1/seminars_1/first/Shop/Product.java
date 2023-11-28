package ex_1.seminars_1.first.Shop;

import java.util.Comparator;

public class Product implements Comparable<Product>{
    private Integer cost; // Стоимость продукта
    private String title; // Название

    // Геттеры, сеттеры:
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Product o) {


        return this.cost.compareTo(o.getCost());
    }

    @Override
    public String toString() {
        return "Product{" +
                "cost=" + cost +
                '}';
    }
}

