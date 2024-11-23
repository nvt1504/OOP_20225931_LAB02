public class CartDemo {
    public static void main(String[] args) {
        // Create a new  cart
        ShoppingCart Cart = new ShoppingCart();

        // Create some new DVDs
        DigitalVideoDisc movie1 = new DigitalVideoDisc("Inception", "Sci-Fi", 19.99f);
        DigitalVideoDisc movie2 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 19.99f);
        DigitalVideoDisc movie3 = new DigitalVideoDisc("Dunkirk", "War", "Christopher Nolan", 19.99f, "Christopher Nolan", 107);

        // Add DVDs to the shopping cart
        shoppingCart.addDVD(movie1);
        shoppingCart.addDVD(movie2);
        shoppingCart.addDVD(movie3);
        // shoppingCart.addDVD(movie4); // Uncomment to add more DVDs

        // Display cart contents before removal
        System.out.println("Before removing a DVD:");
        shoppingCart.displayItems();

        // Remove a DVD from the shopping cart
        boolean dvdRemoved = shoppingCart.removeDVD(movie2);
        if (dvdRemoved) {
            System.out.println("DVD \"" + movie2.getTitle() + "\" has been removed from the shopping cart.");
        } else {
            System.out.println("DVD \"" + movie2.getTitle() + "\" could not be found in the shopping cart.");
        }

        // Display cart contents after removal
        System.out.println("After removing a DVD:");
        shoppingCart.displayItems();
    }
}
