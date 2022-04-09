package ĆW2.Zad5;
import java.time.Duration;
import java.time.LocalDate;
public class Person {
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private Address address;

    public Person(String name, String surname, LocalDate dateOfBirth, Address address) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name == null){
            throw new RuntimeException("Wartość name nie może być pusta");
        } else {
            this.name = name;
        }
    }



    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname.isEmpty() || surname == null){
            throw new RuntimeException("Wartość surname nie może być pusta");
        } else {
            this.surname = surname;
        }
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if(dateOfBirth.equals(null)) {
            throw new RuntimeException("Data urodzenia nie może być pusta");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getAge(){
        return Duration.between(LocalDate.now(), dateOfBirth).toDays();
    }
    public void publishBook(){
        Book book = new Book();
        book.setAuthor(this);
    }
}

