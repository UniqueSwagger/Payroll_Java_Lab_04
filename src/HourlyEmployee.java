public class HourlyEmployee extends Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName,String lastName,String ssn){
        super(firstName, lastName, ssn);
        this.wage=wage;
        this.hours=hours;
    }

    @Override
    public double earnings(){
        if(hours<=40) return wage*hours;
        return 40*wage+(hours-40)*wage*1.5;
    }

    @Override
    public String toString(){
        return "Hourly Employee: " + super.toString()+", Wage: $" + wage + ", Hours: " + hours;
    }
}
