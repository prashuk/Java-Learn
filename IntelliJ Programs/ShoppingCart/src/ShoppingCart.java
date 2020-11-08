import java.util.*;

public class ShoppingCart implements Cart {
    List<ShoppingCartItem> items;
    int totalPrice;
    int discount;

    public ShoppingCart() {
        totalPrice = 0;
        discount = 0;
        items = new ArrayList<>();
    }

    public void addItem(ShoppingCartItem shoppingCartItem) {
        try {
            this.items.add(shoppingCartItem);
            this.totalPrice += shoppingCartItem.item.cost * shoppingCartItem.quantity;
        } catch (RemoveItemException e) {
            System.out.println(e.getMessage());
        }

    }

    public void removeItem(ShoppingCartItem shoppingCartItem) {
        this.items.remove(shoppingCartItem);
        this.totalPrice -= shoppingCartItem.item.cost * shoppingCartItem.quantity;
    }

    public int getTotalPrice() {
        return totalPrice - discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void printCart() {
        for(ShoppingCartItem item: items) {
            System.out.println(item.item.toString() + ", Quantity: " + item.quantity);
        }
    }
}