package java8Streams;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpWithNameandageAbove {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "one", 20, "one"));
        employeeList.add(new Employee(2, "two", 40, "two"));
        employeeList.add(new Employee(3, "three", 46, "three"));
        employeeList.add(new Employee(4, "four", 10, "four"));

        List<Employee> filtered = employeeList.stream().filter(e -> !e.getName().isEmpty() && e.getAge() > 40).collect(Collectors.toList());
        System.out.println("filtered emp list is"+filtered);
    }
}
