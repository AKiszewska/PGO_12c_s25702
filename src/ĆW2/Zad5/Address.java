package ĆW2.Zad5;

public class Address {

        private String country;
        private String city;
        private String street;
        private int house;
        private int flat;

        public Address(String country, String city, String street, int house, int flat) {
            this.country = country;
            this.city = city;
            this.street = street;
            this.house = house;
            this.flat = flat;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            if(country == null || country.isEmpty()){
                throw new RuntimeException("Wartość country nie może być pusta");
            } else {
                this.country = country;
            }
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            if(city == null || city.isEmpty()){
                throw new RuntimeException("Wartość city nie może być pusta");
            } else {
                this.city = city;
            }
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            if(street == null || street.isEmpty()){
                throw new RuntimeException("Wartość street nie może być pusta");
            } else {
                this.street = street;
            }
        }

        public int getHouse() {
            return house;
        }

        public void setHouse(int house) {
            if(house <= 0){
                throw new RuntimeException("Wartość house nie może być mniejsza od 1");
            } else {
                this.house = house;
            }
        }

        public int getFlat() {
            return flat;
        }

        public void setFlat(int flat) {
            this.flat = flat;
        }
    }



