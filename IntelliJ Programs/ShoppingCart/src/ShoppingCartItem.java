public class ShoppingCartItem extends Item {
    Item item;
    int quantity;

    public ShoppingCartItem(Item item) {
        super();
        this.item = item;
        this.quantity = 1;
    }

    public void addQuantity() {
        this.quantity += 1;
    }

    public void removeQuantity() {
        this.quantity -= 1;
    }
}