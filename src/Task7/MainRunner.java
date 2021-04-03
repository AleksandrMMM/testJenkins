package Task7;

public class MainRunner {

    public static void main(String[] args) {

        Employee employee = new Employee("Ivan", 23, MaleType.MALE, 1200);
        Employee employee2 = new Employee("Ivan2", 232, MaleType.MALE, 1500);
        Employee employee3 = new Employee("Ivan3", 234, MaleType.MALE, 1800);

        Employee[] employees = new Employee[]{employee, employee2, employee3};

        TaskB taskB = new TaskB();

        System.out.println(taskB.searchEmployee(employees,employee));

        System.out.println();

        System.out.println(employee.isSameName(employee2));

    }

}
