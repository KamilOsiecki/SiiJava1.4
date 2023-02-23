package org.example;

public class Dimension {
    int high;
    int width;;
    int tankCapacity;

    public Dimension(int high, int width, int tankCapacity) {
        this.high = high;
        this.width = width;
        this.tankCapacity = tankCapacity;
    }

    @Override
    public String toString(){
        return "high: " + this.high + "cm width: " + this.width + "cm tank capacity: " + tankCapacity;
    }
}
