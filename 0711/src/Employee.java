public class Employee {
    String sabun;
    double salary;
    public Employee(){
        this("임시사번",10_000_000);
    }
    public Employee(String sabun){
        this(sabun,10_000_000);
    }
    public Employee(double salary){
        this("임시사번",salary);
    }
    public Employee(String sabun, double salary){
        this.sabun = sabun;
        this.salary =salary;
    }
}