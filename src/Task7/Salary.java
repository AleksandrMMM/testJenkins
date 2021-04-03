package Task7;

public class Salary {

    public int getSum(Employee[] employees) {

        int sum = 0;

        for (int i = 0; i < employees.length; i++) {

           sum = sum + employees[i].getSalary();

        }

        return sum;
    }
}
