public class Main {
    public static void main(String[] args){
        Employee[] employees = new Employee[4];

        employees[0] = new SalariedEmployee("Alice", "Smith", "111-11-1111", 800.00);
        employees[1] = new HourlyEmployee("Bob", "Brown", "222-22-2222", 16.75, 42);
        employees[2] = new CommissionEmployee("Carol", "Jones", "333-33-3333", 10000, 0.06);
        employees[3] = new BasePlusCommissionEmployee("Dave", "Wilson", "444-44-4444", 5000, 0.04, 300);
    }
}
