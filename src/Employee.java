public abstract class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    public Employee(String firstName,String lastName,String ssn){
        this.firstName=firstName;
        this.lastName=lastName;
        this.ssn=ssn;
    }
    public abstract double earnings();
    @Override
    public String toString(){
        return firstName+ " " +lastName + " "+ "(SSN: " + ssn + ")";
    }
}
