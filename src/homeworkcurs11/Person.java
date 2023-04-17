package homeworkcurs11;

import homeworkcurs8.second.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Employee extends Person {
    private String company;
    private int salary;

    public Employee(String name, String company, int salary) {
        super(name);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public int getSalary() {
        return salary;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "Acme Inc.", 50000));
        employees.add(new Employee("Bob", "Acme Inc.", 60000));
        employees.add(new Employee("Charlie", "Beta Corp.", 70000));
        employees.add(new Employee("David", "Beta Corp.", 80000));
        employees.add(new Employee("Eve", "Gamma LLC", 90000));

        // Extract persons that have salaries more than a specified amount
        List<Person> highEarners = new ArrayList<>();
        int minSalary = 70000;
        for (Employee employee : employees) {
            if (employee.getSalary() >= minSalary) {
                highEarners.add(employee);
            }
        }
        System.out.println("High earners:");
        for (Person person : highEarners) {
            System.out.println(person.getName());
        }

        // Extract a map that gathers all the persons for a company
        Map<String, List<Person>> companyMap = new HashMap<>();
        for (Employee employee : employees) {
            String company = employee.getCompany();
            List<Person> persons = companyMap.getOrDefault(company, new ArrayList<>());
            persons.add(employee);
            companyMap.put(company, persons);
        }
        System.out.println("Company map:");
        for (Map.Entry<String, List<Person>> entry : companyMap.entrySet()) {
            String company = entry.getKey();
            List<Person> persons = entry.getValue();
            System.out.println(company + ":");
            for (Person person : persons) {
                System.out.println("  " + person.getName());
            }
        }

        // Calculate the sum of all salaries for all employees
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        System.out.println("Total salary: " + totalSalary);

        // Calculate which company gives the biggest salary
        Map<String, Integer> companySalaryMap = new HashMap<>();
        for (Employee employee : employees) {
            String company = employee.getCompany();
            int salary = employee.getSalary();
            int currentMaxSalary = companySalaryMap.getOrDefault(company, 0);
            if (salary > currentMaxSalary) {
                companySalaryMap.put(company, salary);
            }
        }
        String biggestPayingCompany = "";
        int biggestSalary = 0;
        for (Map.Entry<String, Integer> entry : companySalaryMap.entrySet()) {
            String company = entry.getKey();
            int salary = entry.getValue();
            if (salary > biggestSalary) {
                biggestSalary = salary;
                biggestPayingCompany = company;
            }
        }
        System.out.println("Biggest paying company: " + biggestPayingCompany + " (" + biggestSalary + ")");
    }
}
