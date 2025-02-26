package org.example;

public class Car extends Vehicle{
    @Override
    public String toCSV() {
        return brand + ";" + model + ";" + year + ";" + price + ";" + rented + ";" + id;
    }

    @Override
    public String toString() {
        return "Marka: " +  brand + ", Model: " + model + ", Rocznik: " + year + ", Cena:" + price + ", Wypożyczony: " + rented + ", ID:" + id;
    }
}
