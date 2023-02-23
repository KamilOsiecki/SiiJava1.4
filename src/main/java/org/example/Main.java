package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Market market = new Market();
        Properties data =FileHandler.loadFile("data.properties");
        int tankCapacityRange = Integer.parseInt(data.getProperty("dimension_tankCapacityRange"));

        Country country1 = new Country(data.getProperty("country_name1"), data.getProperty("country_code1").charAt(0));
        Country country2 = new Country(data.getProperty("country_name2"), data.getProperty("country_code2").charAt(0));
        Country country3 = new Country(data.getProperty("country_name3"), data.getProperty("country_code3").charAt(0));
        Country country4 = new Country(data.getProperty("country_name4"), data.getProperty("country_code4").charAt(0));
        Country country5 = new Country(data.getProperty("country_name5"), data.getProperty("country_code5").charAt(0));

        for (Country country : Arrays.asList(country1, country2, country3, country4, country5)) {
            market.addCountryToMarket(country);
        }

        Market market1 = new Market(data.getProperty("market_name1"));
        Market market2 = new Market(data.getProperty("market_name2"));
        Market market3 = new Market(data.getProperty("market_name3"));

        Dimension dimension1 = new Dimension(Integer.parseInt(data.getProperty("dimension_high1")), Integer.parseInt(data.getProperty("dimension_width1")), Integer.parseInt(data.getProperty("dimension_tankCapacity1")));
        Dimension dimension2 = new Dimension(Integer.parseInt(data.getProperty("dimension_high2")), Integer.parseInt(data.getProperty("dimension_width2")), Integer.parseInt(data.getProperty("dimension_tankCapacity2")));
        Dimension dimension3 = new Dimension(Integer.parseInt(data.getProperty("dimension_high3")), Integer.parseInt(data.getProperty("dimension_width3")), Integer.parseInt(data.getProperty("dimension_tankCapacity3")));
        Dimension dimension4 = new Dimension(Integer.parseInt(data.getProperty("dimension_high4")), Integer.parseInt(data.getProperty("dimension_width4")), Integer.parseInt(data.getProperty("dimension_tankCapacity4")));
        Dimension dimension5 = new Dimension(Integer.parseInt(data.getProperty("dimension_high5")), Integer.parseInt(data.getProperty("dimension_width5")), Integer.parseInt(data.getProperty("dimension_tankCapacity5")));
        Dimension dimension6 = new Dimension(Integer.parseInt(data.getProperty("dimension_high6")), Integer.parseInt(data.getProperty("dimension_width6")), Integer.parseInt(data.getProperty("dimension_tankCapacity1")));
        Dimension dimension7 = new Dimension(Integer.parseInt(data.getProperty("dimension_high7")), Integer.parseInt(data.getProperty("dimension_width7")), Integer.parseInt(data.getProperty("dimension_tankCapacity2")));
        Dimension dimension8 = new Dimension(Integer.parseInt(data.getProperty("dimension_high8")), Integer.parseInt(data.getProperty("dimension_width8")), Integer.parseInt(data.getProperty("dimension_tankCapacity3")));
        Dimension dimension9 = new Dimension(Integer.parseInt(data.getProperty("dimension_high9")), Integer.parseInt(data.getProperty("dimension_width9")), Integer.parseInt(data.getProperty("dimension_tankCapacity4")));
        Dimension dimension10 = new Dimension(Integer.parseInt(data.getProperty("dimension_high10")), Integer.parseInt(data.getProperty("dimension_width10")), Integer.parseInt(data.getProperty("dimension_tankCapacity5")));

        Producer producer1 = new Producer(data.getProperty("producer_model1"), data.getProperty("producer_type1"));
        Producer producer2 = new Producer(data.getProperty("producer_model1"), data.getProperty("producer_type2"));
        Producer producer3 = new Producer(data.getProperty("producer_model1"), data.getProperty("producer_type3"));
        Producer producer4 = new Producer(data.getProperty("producer_model2"), data.getProperty("producer_type4"));
        Producer producer5 = new Producer(data.getProperty("producer_model2"), data.getProperty("producer_type5"));
        Producer producer6 = new Producer(data.getProperty("producer_model2"), data.getProperty("producer_type6"));
        Producer producer7 = new Producer(data.getProperty("producer_model2"), data.getProperty("producer_type7"));
        Producer producer8 = new Producer(data.getProperty("producer_model3"), data.getProperty("producer_type8"));
        Producer producer9 = new Producer(data.getProperty("producer_model3"), data.getProperty("producer_type9"));
        Producer producer10 = new Producer(data.getProperty("producer_model3"), data.getProperty("producer_type10"));

        Car car1 = new Car(producer1.model, producer1.type, true, market1, List.of(country1, country2, country3), "standard", dimension3);
        Car car2 = new Car(producer2.model, producer2.type, true, market2, List.of(country4,country5,country1), "medium", dimension4);
        Car car3 = new Car(producer3.model, producer3.type, true, market3, List.of(country2,country3,country4), "premium", dimension5);
        Car car4 = new Car(producer4.model, producer4.type, true, market1, List.of(country5,country1,country2), "standard", dimension4);
        Car car5 = new Car(producer5.model, producer5.type, true, market2, List.of(country3,country4,country5), "medium", dimension2);
        Car car6 = new Car(producer6.model, producer6.type, true, market3, List.of(country1,country3,country5), "premium", dimension6);
        Car car7 = new Car(producer7.model, producer7.type, true, market1, List.of(country2,country4,country1), "standard", dimension7);
        Car car8 = new Car(producer8.model, producer8.type, true, market2, List.of(country1,country4,country5), "medium", dimension8);
        Car car9 = new Car(producer9.model, producer9.type, true, market3, List.of(country2,country3,country5), "premium", dimension9);
        Car car10 = new Car(producer10.model, producer10.type, false, market1, List.of(country3,country4,country5), "standard", dimension1);
        Car car11 = new Car(producer1.model, producer1.type, false, market3, List.of(country1, country2, country4), "standard", dimension10);
        Car car12 = new Car(producer2.model, producer2.type, false, market3, List.of(country1,country4,country3), "medium", dimension9);
        Car car13 = new Car(producer3.model, producer3.type, false, market2, List.of(country3,country4,country5), "premium", dimension8);
        Car car14 = new Car(producer4.model, producer4.type, false, market2, List.of(country2,country3,country4), "standard", dimension7);
        Car car15 = new Car(producer5.model, producer5.type, false, market1, List.of(country1,country3,country5), "medium", dimension6);

        List<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11, car12, car13, car14, car15));

        for (Car car : cars) {
            if (car.model.equals(data.getProperty("producer_model1")) && car.isAutomaticGear && car.dimension.tankCapacity > tankCapacityRange){
                System.out.println(car + "\n");
            }
        }

        cars.stream()
                .filter(car -> car.model.equals(data.getProperty("producer_model1")))
                .filter(car -> car.isAutomaticGear)
                .filter(car -> car.dimension.tankCapacity > tankCapacityRange)
                .forEach(car -> System.out.println("Car model: " + car.model + "\nType: " + car.type + "\nAutomatic gear: " +
                        car.isAutomaticGear + "\nMarket: " + car.market + "\nCountries: " + car.countries +
                        "\nSegment: " + car.segment + "\nDimension: " + car.dimension));
    }
}