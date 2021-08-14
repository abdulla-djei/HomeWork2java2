package com.company;

public class Jet extends Airplane implements Printable{
    private double interiorDiameter;

    public Jet(String name, double speed, double interiorDiameter) {
        super(name, speed);
        this.interiorDiameter = interiorDiameter;
    }

    public double getInteriorDiameter() {
        return interiorDiameter;
    }

    public void setInteriorDiameter(double interiorDiameter) {
        this.interiorDiameter = interiorDiameter;
    }

    @Override
    public void print() {
        System.out.println("Имя " + getName()+" Скорость " + getSpeed()+ " Диаметр салона " + interiorDiameter);
    }
}
