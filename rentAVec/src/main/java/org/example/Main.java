package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        VehicleRepository rep = new VehicleRepository();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("1. Wypożycz auto");
            System.out.println("2. Zwróć auto");

            int option = scanner.nextInt();

            switch(option)
            {
                case 1:
                    System.out.println("Lista dostępnych pojazdów, wybierz, który chcesz wypożyczyć: ");
                    for(Vehicle v : rep.getVehicles())
                    {
                        if(!v.rented)
                        {
                            System.out.println(v.toString());
                        }
                        else
                        {
                            System.out.println("Aktualnie brak pojazdów do wypożyczenia.");
                        }
                    }
                    String rentID = scanner.nextLine();
                    rep.rentVehicle(rentID);

                case 2:
                    System.out.println("Wprowadź ID pojazdu, który chcesz oddać: ");
                    String returnID = scanner.nextLine();

            }

        }

    }
}