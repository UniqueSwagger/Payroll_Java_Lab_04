public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;
    public CommissionEmployee(String firstName,String lastName,String ssn,double grossSales,double commissionRate){
        super(firstName, lastName, ssn);
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;
    }
    @Override
    public double earnings(){
        return grossSales*commissionRate;
    }

    @Override
    public String toString(){
        return "Commission Employee: " + super.toString()+ ", Gross Sales: $" + grossSales + ", Commission Rate: " + commissionRate;
    }
}
