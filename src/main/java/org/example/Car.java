package org.example;

import java.util.ArrayList;
import java.util.List;

public class Car {
    Producer producer;
    String model;
    String type;
    Boolean isAutomaticGear;
    Market market;
    String name;
    List<Country> countries;
    String segment;
    ArrayList<Dimension> dimensions = new ArrayList<>();
    Dimension dimension;

    public Car(String model, String type, Boolean isAutomaticGear, Market market, List<Country> countries, String segment, Dimension dimension) {

        this.model = model;
        this.type = type;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.countries = countries;
        this.segment = segment;
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Car model: " + this.model + "\nType: " + this.type + "\nAutomatic gear: " +
                this.isAutomaticGear + "\nMarket: " + this.market + "\nCountries: " + this.countries +
                "\nSegment: " + this.segment + "\nDimension: " + this.dimension;
    }
}
