package com.vib;

import java.util.Objects;

public class Light {

    public String name = null;
    public String vendor = null;
    public String color = null;
    public double weight = 0.0;
    public boolean isOn = false;


    public Light(){
        System.out.println("Hello world from constructor");
        // constructor
        name = "";
        vendor = "";
        color = "";
        weight = 1.0;
        isOn = true;
    }

    public Light(String name, String vendor, String color, double weight, boolean isOn) {
        this.name = name;
        this.vendor = vendor;
        this.color = color;
        this.weight = weight;
        this.isOn = isOn;
    }

    public void switchOn(){
        this.isOn = true;
    }

    public void switchOff(){
        this.isOn = false;
    }

    public void setWeight( double weight) {
        if(weight < 0 ) {
            System.out.println("Error!");
            return;
        }
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Light{" +
                "name='" + name + '\'' +
                ", vendor='" + vendor + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", isOn=" + isOn +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Light light = (Light) o;
        return Double.compare(weight, light.weight) == 0 && isOn == light.isOn && Objects.equals(name, light.name) && Objects.equals(vendor, light.vendor) && Objects.equals(color, light.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, vendor, color, weight, isOn);
    }
}
