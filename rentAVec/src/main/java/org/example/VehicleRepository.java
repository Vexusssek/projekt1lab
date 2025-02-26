package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VehicleRepository implements IVehicleRepository{

    public VehicleRepository
    private List<Vehicle> vehicles = new ArrayList<>();
    private final String fileName = "vehicles.txt";

    @Override
    public void rentVehicle(String id) {

        for(Vehicle v : vehicles)
        {
            if(v.id.equals(id) && !v.rented)
            {
                v.rented = true;
                save();
                System.out.println("Wypożyczono: " + v);
                return;
            }
        }
        System.out.println("Pojaz jest niedostępny");

    }

    @Override
    public void returnVehicle(String id) {
        for(Vehicle v : vehicles)
        {
            if(v.id.equals(id) && v.rented)
            {
                v.rented = false;
                save();
                System.out.println("Zwrócono: " + v);
                return;
            }
        }
        System.out.println("Nie znaleziono pojazdu");
    }

    @Override
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public void save() {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            for(Vehicle v : vehicles)
            {
                writer.write(v.toCSV());
            }

        } catch (IOException e) {
            System.out.println("Błąd zapisu");
        }
    }

    private void loadFromFile() {


    }

}
