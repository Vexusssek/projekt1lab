package org.example;

public abstract class Vehicle {
    protected String brand, model, id;
    protected int year, price;
    protected boolean rented;

    public abstract String toCSV();
    public abstract String toString();
}
