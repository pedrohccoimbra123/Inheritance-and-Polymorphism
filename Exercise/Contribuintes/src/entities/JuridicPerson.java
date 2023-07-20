package entities;

public class JuridicPerson extends Person {

    private Integer numberOfEmployees;

    public JuridicPerson() {
    }

    public JuridicPerson(String name, Double annualRevenue, Integer numberOfEmployees) {
        super(name, annualRevenue);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double taxIncome(){
        if (numberOfEmployees > 0 && numberOfEmployees <=10){
            return (getAnnualRevenue() * 0.16);
        } else {
            return (getAnnualRevenue()*0.14);
        }
    }
}
