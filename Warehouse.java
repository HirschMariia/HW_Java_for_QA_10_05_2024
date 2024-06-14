import java.util.Queue;
import java.util.LinkedList;

public class Warehouse {
    Queue<String> products = new LinkedList<>();

    public void loadProduct(String product) {
        products.offer(product);
        System.out.println("Product " + product + " loaded");
    }

    public String shipProduct() {
        if(products.isEmpty()) {
            System.out.println("No products to ship");
            return null;
        }
        String product = products.poll();
        System.out.println("Product " + product + " shipped");
        return product;
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.loadProduct("Brick1");
        warehouse.loadProduct("Brick2");
        warehouse.shipProduct();
    }
}
