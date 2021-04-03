package Task7;

public class Employee extends Person {

    private int salary;

    public Employee(String name, int age, MaleType maleType, int salary) {
        super(name, age, maleType);
        this.salary = salary;
    }

    public boolean isSameName(Employee employee) {

        if (this.equals(employee.getName())) {

            return true;
        }else {

            return false;
        }


    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}
