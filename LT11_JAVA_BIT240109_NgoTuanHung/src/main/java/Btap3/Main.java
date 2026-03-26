/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btap3;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @author Hungg
 */
public class Main {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Huy", 800),
            new Employee(2, "An", 1500),
            new Employee(3, "Binh", 1200),
            new Employee(4, "Cuong", 900)
        );

        List<String> result = employees.stream()
                .filter(e -> e.getSalary() > 1000)  
                .map(Employee::getName)              
                .sorted()                           
                .collect(Collectors.toList());  

        System.out.println(result);
    }
}
