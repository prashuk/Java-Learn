public class ShoppingCartApplication {
    public static void main(String[] args) {
        Item itemA = new Item("Item A", 10);
        ShoppingCartItem scItemA = new ShoppingCartItem(itemA);

        Item itemB = new Item("Item B", 20);
        ShoppingCartItem scItemB = new ShoppingCartItem(itemB);

        ShoppingCart sc = new ShoppingCart();

        sc.addItem(scItemA);
        sc.addItem(scItemB);
        sc.printCart();

        sc.setDiscount(10);
        System.out.println(sc.getTotalPrice());
    }
}
