package edu.neu.mgen;
import java.util.ArrayList;

public class Lab1 {
    
    public static void main(String[] args) {

        // Part 1 - Integer Arrays
        int[] x = {8, 2, 11, 6, 4};
        int[] y = {10, 3, 7, 5, 1};
        int[] z = new int[5];

        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        System.out.print("Array x = {");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i < x.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Array y = {");
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]);
            if (i < y.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Array z = x + y = {");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]);
            if (i < z.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        // Part 2 - ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahsan");
        names.add("Zafar");
        names.add("Syed");
        names.add("Kriti");
        names.add("Sonal");

        ArrayList<String> switchedNames = new ArrayList<>();

        for (String name : names) {
            String switchedName = Character.toUpperCase(name.charAt(name.length() - 1)) + name.substring(1, name.length() - 1) + Character.toLowerCase(name.charAt(0));
            switchedNames.add(switchedName);
        }

        System.out.print("Names = {");
        for (String name : names) {
            System.out.print(name);
            if (names.indexOf(name) < names.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.print("Names (switched) = {");
        for (String switchedName : switchedNames) {
            System.out.print(switchedName);
            if (switchedNames.indexOf(switchedName) < switchedNames.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
