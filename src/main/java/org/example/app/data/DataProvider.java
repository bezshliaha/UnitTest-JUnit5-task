package org.example.app.data;

import java.util.Scanner;

public class DataProvider {

    public int getTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature from -10 to 35 degrees: ");
        return scanner.nextInt();
    }
}
