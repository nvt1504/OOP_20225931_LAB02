public class Aim {
    public static void main(String[] args) {
        // Create a new  cart
        Cart Cart = new Cart();
        // changed
        // Create some new DVDs
        DigitalVideoDisc movie1 = new DigitalVideoDisc("Inception", "Sci-Fi", 19.99f);
        DigitalVideoDisc movie2 = new DigitalVideoDisc("Interstellar", "Sci-Fi", "Christopher Nolan", 19.99f);
        DigitalVideoDisc movie3 = new DigitalVideoDisc("Dunkirk", "War", "Christopher Nolan", 19.99f, "Christopher Nolan", 107);

        // Add DVDs to the  cart
        Cart.addDisc(movie1);
        Cart.addDisc(movie2);
        Cart.addDisc(movie3);
        // Cart.addDVD(movie4); // Uncomment to add more DVDs

        // Display cart contents before removal
        System.out.println("Before removing a DVD:");
        Cart.showItems();

        Cart.printCartDetails();

        // Remove a DVD from the  cart
        boolean dvdRemoved = Cart.removeDisc(movie2);
        if (dvdRemoved) {
            System.out.println("DVD \"" + movie2.getTitle() + "\" has been removed from the  cart.");
        } else {
            System.out.println("DVD \"" + movie2.getTitle() + "\" could not be found in the  cart.");
        }
        
        // Display cart contents after removal
        System.out.println("After removing a DVD:");
        Cart.showItems();
    }
}

