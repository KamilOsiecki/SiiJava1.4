package org.example;

import java.util.ArrayList;
import java.util.List;

public class Market {
    String name;
    List<Country> countries = new ArrayList<>();

    public Market(String name) {
        this.name = name;
    }

    public Market(){

    }

    public void addCountryToMarket(Country country) {
        this.countries.add(country);
    }

    @Override
    public String toString(){
        return this.name;
    }
}
