public interface Cart {
    public void addItem(ShoppingCartItem shoppingCartItem);
    public void removeItem(ShoppingCartItem shoppingCartItem);
    public int getTotalPrice();
    public void setDiscount(int discount);
    public void printCart();
}
