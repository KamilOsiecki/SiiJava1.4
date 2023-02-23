package org.example;

public class Country {
    String countryName;
    char countrySign;

    Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    @Override
    public String toString() {
        return this.countryName + " - " + this.countrySign;
    }
}
