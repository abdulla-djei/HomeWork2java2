package com.company;


public class Airbus extends Airplane implements Printable {
    private double flyAtAltitude;

    public Airbus(String name, double speed, double flyAtAltitude) {
        super(name, speed);
        this.flyAtAltitude = flyAtAltitude;
    }

    public double getFlyAtAltitude() {
        return flyAtAltitude;
    }

    public void setFlyAtAltitude(double flyAtAltitude) {
        this.flyAtAltitude = flyAtAltitude;
    }

    @Override
    public void print() {
        System.out.println("Имя " + getName()+" Скорость " + getSpeed()+ " Высота палета " + flyAtAltitude);
    }
}
