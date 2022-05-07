package ĆW3.zad2;

public class Main {
    public static void chceck(){

        Person personX = new Person("Jan", "Kowalski", 4567, 1234);
        personX.makeOrder();


        Product book = new Product("Book", ProductType.Entertainment, 35, 20);
        Product phone = new Product("Phone", ProductType.Electronic, 400, 3);
        Product juice = new Product("Juice", ProductType.Consumable, 1.5, 300);



        Storage computerStorage = new Storage(10);
        Product computer = new Product("Computer", ProductType.Electronic, 200, 200, computerStorage);


        personX.showBalance();
        personX.makeOrder();
        personX.addToCart(juice);
        personX.addToCart(book);
        personX.addToCart(phone);
        personX.showCurrentCart();
        personX.buyByCard();

        personX.makeOrder();
        personX.addToCart(computer);
        personX.showCurrentCart();
        personX.buyByCash();
        personX.showHistoryCarts();
        personX.showBalance();
        Product.showAllProducts();
        juice.increaseQuantity(10);
        phone.increaseQuantity(1);
        book.increaseQuantity(5);
        computer.increaseQuantity(120);
        Product.showAllProducts();
    }
}

