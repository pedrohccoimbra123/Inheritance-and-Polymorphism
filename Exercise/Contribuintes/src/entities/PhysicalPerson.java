package entities;

public class PhysicalPerson extends Person{

    private Double healthCost;

    public PhysicalPerson() {
    }

    public PhysicalPerson(String name, Double annualRevenue, Double healthCost) {
        super(name, annualRevenue);
        this.healthCost = healthCost;
    }

    public Double getHealthCost() {
        return healthCost;
    }

    public void setHealthCost(Double healthCost) {
        this.healthCost = healthCost;
    }
    @Override
    public Double taxIncome(){
        if (getAnnualRevenue() > 0 && getAnnualRevenue() <= 20000){
            return (getAnnualRevenue() * 0.15 ) - (getHealthCost() * 0.5);
        }else {
            return (getAnnualRevenue() * 0.25) - (getHealthCost() * 0.5);
        }
    }
}
