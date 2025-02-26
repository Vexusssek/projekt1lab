package org.example;

public class Motorcycle extends Vehicle{

    public String category;
    @Override
    public String toCSV() {
        return brand + ";" + model + ";" + year + ";" + price + ";" + rented + ";" + id + ";" + category;

    }

    @Override
    public String toString() {
        return "Marka: " +  brand + ", Model: " + model + ", Rocznik: " + year + ", Cena:" + price + ", Wypożyczony: " + rented + ", ID:" + id + ", Kategoria: " + category;

    }
}
