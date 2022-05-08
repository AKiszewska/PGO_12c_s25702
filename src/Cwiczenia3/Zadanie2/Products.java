package Cwiczenia3.Zadanie2;


import java.util.ArrayList;

public class Products {
    private String name;
    private ProductType productype;
    private double price;
    private int quantity;
    private Storage storage;
    ArrayList <Products> products = new ArrayList<>();

    public Products (String name, ProductType productype, double price, int quantity, Storage storage){
        this.name = name;
        this.productype = productype;
        this.price = price;
        this.quantity = quantity;
        this.storage = storage;
        products.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null){
            throw new RuntimeException("Name can't be empty");
        }
        this.name = name;
    }

    public ProductType getProductype() {
        return productype;
    }

    public void setProductype(ProductType productype) {
        if (productype == null){
            throw new RuntimeException("Product Type can't be empty");
        }
        this.productype = productype;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            throw new RuntimeException("Price must me positive number");
        }
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity<= 0){
            throw new RuntimeException("Quantity must be positive number");
        }
        this.quantity = quantity;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public boolean isAvaiable (){
        return this.quantity > 0;
    }

    public void sell(){
        if(this.isAvaiable()== true){
            this.quantity --;

        }
        else {
            throw new RuntimeException("Product is out of stock");
        }
    }
    public void IncreaseQuantity(int a){
        this.quantity = getQuantity() + a;
    }

    public int getDeliveryTime (){
        if (storage == null){
            return 0;
        }

        return storage.getDeliveryTime();
    }
}
