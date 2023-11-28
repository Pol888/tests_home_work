package ex_1.seminars_1.first.Shop;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
public class ShopTest {
    public static void main(String[] args) {
    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
        Shop shop = new Shop();
        List<Product> list_p = new ArrayList<>();
        Product a = new Product();
        a.setCost(55);
        a.setTitle("Мороженое");
        Product b = new Product();
        b.setCost(10);
        b.setTitle("Вафля");
        Product c = new Product();
        c.setCost(100);
        c.setTitle("Сыр");
        list_p.add(a);
        list_p.add(b);
        list_p.add(c);
        shop.setProducts(list_p);

        // проверка списка
        assertThat(shop.getProducts()).hasSize(3);
        assertThat(shop.getProducts().get(0).getTitle()).isEqualTo("Мороженое");
        assertThat(shop.getProducts().get(1).getTitle()).isEqualTo("Вафля");
        assertThat(shop.getProducts().get(2).getTitle()).isEqualTo("Сыр");
        assertThat(shop.getProducts().get(0).getCost()).isEqualTo(55);
        assertThat(shop.getProducts().get(1).getCost()).isEqualTo(10);
        assertThat(shop.getProducts().get(2).getCost()).isEqualTo(100);



        // проверка сортировки
        assertThat(shop.sortProductsByPrice().get(0).getCost()).isEqualTo(100);
        assertThat(shop.sortProductsByPrice().get(0).getTitle()).isEqualTo("Сыр");

        assertThat(shop.sortProductsByPrice().get(1).getCost()).isEqualTo(55);
        assertThat(shop.sortProductsByPrice().get(1).getTitle()).isEqualTo("Мороженое");

        assertThat(shop.sortProductsByPrice().get(2).getCost()).isEqualTo(10);
        assertThat(shop.sortProductsByPrice().get(2).getTitle()).isEqualTo("Вафля");

        // самый дорогой продукт
        assertThat(shop.getMostExpensiveProduct().getTitle()).isEqualTo("Сыр");
        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(100);
    }

}