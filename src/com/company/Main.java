package com.company;

public class Main {

    public static void main(String[] args) {
	    /*
	        Sukurti skaičiuotuvo klasę, kurioje realizuoti statinius metodus sumai, skirtumui,
            sandaugai. Per parametrus bus naudojami sveiko tipo skaičiai.
	     */
        int a, b;
        a = 5;
        b = 6;
        Skaiciuotuvas objektas = new Skaiciuotuvas();

        System.out.println("Suma: " + objektas.suma(a, b));
        System.out.println("Skirtumas: " + objektas.skirtumas(a, b));
        System.out.println("Sandauga: " + objektas.sandauga(a, b));
    }
}
