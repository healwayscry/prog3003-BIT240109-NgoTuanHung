/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Btap1;

/**
 *
 * @author Hungg
 */
public class Main {

    // Generic Method
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Test với Integer
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        printArray(intArray);

        // Test với String
        String[] strArray = {"Hello", "Java", "24IT2"};
        System.out.println("String Array:");
        printArray(strArray);
    }
}
