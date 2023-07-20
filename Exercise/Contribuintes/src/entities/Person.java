package entities;

import java.awt.geom.Arc2D;

public abstract class Person {
    private String name;
    private Double annualRevenue;

    public Person() {
    }

    public Person(String name, Double annualRevenue) {
        this.name = name;
        this.annualRevenue = annualRevenue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(Double annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public Double taxIncome(){
        return 0.0;

    }
}
