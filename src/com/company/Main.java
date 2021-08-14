package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Airbus");
        createObject("Fighter");
        createObject("Jet");
    }

    static Airplane createObject(String className) {
        switch (className) {
            case "Airbus":
                Airbus a = new Airbus("Молли", 40, 2);
                a.print();
                return a;
                case "Fighter":
                    Fighter b = new Fighter("Hjhb", 40.9, 343);
                    b.print();
                    return b;
            case "Jet":
                Jet c = new Jet("hjscjh", 40.9, 33);
                c.print();
                return c;

            }
        return null;
    }


}
