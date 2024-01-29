package java8Streams;

import models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_ageGreatreThans20 {
    public static void main(String[] args) {

        List<Employee>orgEmpList=new ArrayList<Employee>();
        orgEmpList.add(new Employee(1,"Robert",35,"Manager"));
        orgEmpList.add(new Employee(2,"Martin",35,"General Manager"));
        orgEmpList.add(new Employee(1,"Jack",25,"Manager"));
        orgEmpList.add(new Employee(3,"Akshay",20,"Developer"));
        orgEmpList.add(new Employee(1,"Arvind",40,"Manager"));
        orgEmpList.add(new Employee(1,"Dinesh",45,"Manager"));

       orgEmpList.forEach(ref-> System.out.println(ref));

       // usimg stream to filter emplsit having the age greater  than 20

        List<Employee>myList=orgEmpList.stream()
               // .sorted()
                .filter(f->f.getAge()>40)
                .collect(Collectors.toList());
        System.out.println("************************************************************");
        myList.forEach(r-> System.out.println("employee having age 40 = are"+r));


    }
}
