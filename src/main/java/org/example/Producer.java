package org.example;

public class Producer {
    String model;
    String type;

    public Producer(String model, String type) {
        this.model = model;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Model: " + this.model + " type: " + this.type;
    }
}
