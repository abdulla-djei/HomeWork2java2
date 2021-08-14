package com.company;

public class Fighter extends Airplane implements Printable{
    private int passengerCapacity;

    public Fighter(String name, double speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void print() {
        System.out.println("Имя " + getName()+" Скорость " + getSpeed()+ " Вместиость пассажиров " + passengerCapacity);
    }
}
