package Task7;

public class TaskB {



    public boolean searchEmployee(Employee[] employees, String name ) {

        for (int i = 0; i < employees.length; i++) {

            if ( employees[i] != null && employees[i].getName().equals(name)) {

                System.out.println(employees[i]);
            }



        }


        return false;
    }

    public void searchToString(Employee[] employees, String a) {

        for (int i = 0; i < employees.length; i++) {

            if (employees[i].getName().indexOf(a) != -1) {

                System.out.println(employees[i]);
            }

        }
    }

    public boolean searchEmployee(Employee[] employees, Employee employee) {

        boolean tr = true;

        for (int i = 0; i < employees.length; i++) {

            if (employees[i].equals(employee)) {

                return tr = true;
            }else {

                return tr = false;
            }



        }

        return tr;
    }

    public int minSalary(Employee[] employees) {

        int minSalary = 0;

        for (int i = 0; i < employees.length; i++) {

           if (minSalary < employees[i].getSalary()) {

               minSalary = employees[i].getSalary();
           }

        }

        return minSalary;
    }
}
