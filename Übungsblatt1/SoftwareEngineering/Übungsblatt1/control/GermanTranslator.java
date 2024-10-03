package control;

import java.util.ArrayList;
import java.util.List;

public class GermanTranslator implements Translator {

    private String date = "Okt/2024"; // Default-Wert


    // Methode zur Übersetzung einer Zahl in eine String-Repräsentation
    public String translateNumber(int number) {

        String[] zahlen = {"eins","zwei", "drei", "vier", "fünf", "sechs", "sieben", "acht", "neun", "zehn"};


        if (number >= 1 && number <= 10) {
            return zahlen[number-1];
        } else {
                return "Übersetzung der Zahl " + number + " nicht möglich (" + "Translator Version " + Translator.version + ")";
            }
        }

        /**
         * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Info.
         */
        public void printInfo () {
            System.out.println("GermanTranslator v1.9, erzeugt am " + this.date);
        }

        /**
         * Setzen des Datums, wann der Uebersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: "Okt/2024"))
         * Das Datum sollte system-intern durch eine Factory-Klasse gesetzt werden und nicht von externen View-Klassen
         */
        public void setDate (String date ){
            this.date = date;
        }

    }
