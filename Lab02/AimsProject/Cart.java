import java.util.ArrayList;

public class Cart {
    private ArrayList<DigitalVideoDisc> dvdList;
    private final int capacity;

    public Cart() {
        this.dvdList = new ArrayList<>();
        this.capacity = 20; // Giới hạn tối đa cho giỏ hàng
    }

    public ArrayList<DigitalVideoDisc> getDvdList() {
        return dvdList;
    }

    public void addDisc(DigitalVideoDisc disc) {
        if (dvdList.size() < capacity) {
            dvdList.add(disc);
            System.out.println("DVD \"" + disc.getTitle() + "\" đã được thêm vào giỏ hàng.");
        } else {
            System.out.println("Không thể thêm DVD. Giỏ hàng đã đầy.");
        }
    }

    public boolean removeDisc(DigitalVideoDisc disc) {
        boolean isRemoved = dvdList.remove(disc);
        if (isRemoved) {
            System.out.println("DVD \"" + disc.getTitle() + "\" đã được xóa khỏi giỏ hàng.");
        } else {
            System.out.println("DVD \"" + disc.getTitle() + "\" không tìm thấy trong giỏ hàng.");
        }
        return isRemoved;
    }

    public float calculateTotalPrice() {
        float totalPrice = 0;
        for (DigitalVideoDisc disc : dvdList) {
            totalPrice += disc.getCost();
        }
        return totalPrice;
    }

    public void showItems() {
        System.out.println("Giỏ hàng có " + dvdList.size() + " DVD:");
        for (DigitalVideoDisc disc : dvdList) {
            disc.displayInfo();
            System.out.println();
        }
        System.out.println("Tổng giá: $" + calculateTotalPrice());
    }
}
