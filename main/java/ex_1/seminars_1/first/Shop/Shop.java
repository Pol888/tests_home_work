package ex_1.seminars_1.first.Shop;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию цены список продуктов
    public List<Product> sortProductsByPrice() {
        List<Product> a = this.products;
        a.sort(Comparator.reverseOrder());
        return a;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        Product product = new Product();
        product.setCost(0);
        for (int i = 0; i < this.products.size(); i++) {
            if (this.products.get(i).getCost() > product.getCost()){
                product = this.products.get(i);
            }
        }
        return product;
    }

}