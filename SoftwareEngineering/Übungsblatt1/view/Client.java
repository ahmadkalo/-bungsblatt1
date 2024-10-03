package view;

import control.Translator;
import factory.Fabrik;

public class Client {

    public void display(int aNumber) {
        // In dieser Methode soll die Methode translateNumber
        // mit dem übergegebenen Wert der Variable aNumber
        // aufgerufen werden
        // Strenge Implementierung (nur) gegen das Interface Translator gewuenscht!
        Translator translator = Fabrik.createTranslator();
        // Verwendet die translateNumber Methode
        String ergebnis = translator.translateNumber(aNumber);

        System.out.println("Das Ergebnis der Berechnung: " + "[" + ergebnis + "]");

    }

}





