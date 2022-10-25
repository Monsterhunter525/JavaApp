package calculatePrice;

public class Main {
    public static void main(String[] args) {
        Product potato = new Product();
        potato.name = "Potato";
        potato.price = 240;

        Product bread = new Product();
        bread.name = "Bread";
        bread.price = 35;

        Product butter = new Product();
        butter.name = "Butter";
        butter.price = 99;

        Product[] products = new Product[] {potato, bread, butter};
        MakeOrder makeOrder = new MakeOrder();

        for (Product product: products) {
            System.out.println(product.price);

        }
        System.out.println(makeOrder.calculatePrice(products));
    }
}
