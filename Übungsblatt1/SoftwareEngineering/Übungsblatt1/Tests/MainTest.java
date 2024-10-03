package Tests;

import view.Client;

public class MainTest {
    public static void main(String[] args) {

        Client client = new Client();

        System.out.println("Test mit gültiger Zahl 5:");
        client.display(5);  // Erwartete Ausgabe: fünf


        System.out.println("\nTest mit ungültiger Zahl 11:");
        client.display(11);  // Erwartete Ausgabe: Fehlernachricht mit Versionsnummer

        // Testen mit einer weiteren gültigen Zahl (z.B. 1)
        System.out.println("\nTest mit gültiger Zahl 1:");
        client.display(1);  // Erwartete Ausgabe: eins



    }
}