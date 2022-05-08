package Cwiczenia3.Zadanie2;

public class Storage {
    private int deliveryTime;

    public Storage(int deliveryTime){
        this.deliveryTime = deliveryTime;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        if (deliveryTime < 0){
            throw new RuntimeException("Delivery Time must be positive number");
        }
        this.deliveryTime = deliveryTime;
    }
}
