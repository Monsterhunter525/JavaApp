package calculatePrice;

public class MakeOrder {
    public int calculatePrice(Product[] products) {
        int sumPrice = 0;
        for(int i =  0; i < products.length; i++) {
        sumPrice += products[i].price;

        }

        return sumPrice;
    }
}
