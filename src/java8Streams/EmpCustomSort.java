package java8Streams;

import models.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpCustomSort {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "one", 20, "one"));
        employeeList.add(new Employee(2, "two", 40, "two"));
        employeeList.add(new Employee(3, "three", 46, "three"));
        employeeList.add(new Employee(4, "four", 10, "four"));


        //filter emp with age >10 and with asecnding name order
        //employeeList.sort((Employee e1,Employee e2)->e1.getAge()-e2.getAge());
        List<Employee> employeeFiltered = employeeList.stream().filter(emp -> emp.getAge() > 10)
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .collect(Collectors.toList());
        //System.out.println("FIltered emp are"+ employeeFiltered);
       // employeeFiltered.forEach((femp) -> System.out.println(femp));

        List<Employee> agefilter = employeeList.stream().filter(a -> a.getAge() >= 10 && a.getAge() <= 30).collect(Collectors.toList());

        agefilter.forEach((e-> System.out.println(e)));
    }
}
