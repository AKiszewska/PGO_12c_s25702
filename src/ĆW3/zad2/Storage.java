package ĆW3.zad2;
import java.util.ArrayList;
public class Storage {
    private int deliveryTime;
    private ArrayList<Product> products = new ArrayList<>();

    public Storage(int deliveryTime) {
        this.setDeliveryTime(deliveryTime);
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }
    public void setDeliveryTime(int deliveryTime) {
        if(deliveryTime < 0){
            throw new RuntimeException("Incorrect delivery time");
        }
        this.deliveryTime = deliveryTime;
    }
}
