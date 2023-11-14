package edu.neu.mgen;

public class ChapEight {

    public static void main(String[] args) {

        String[] array1 = {"Anne", "John", "Alex", "Jessica"};
        System.out.println("Original array:\n");
        printArray(array1);
        System.out.println("\nResultant array:\n");
        printArray(transformArray(array1));


        String[] array2 = {"Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter"};
        System.out.println("\n\nOriginal array:\n");
        printArray(array2);
        System.out.println("\nResultant array:\n");
        printArray(transformArray(array2));
    }

    private static String[] transformArray(String[] inputArray) {
        String[] resultArray = new String[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            resultArray[i] = reverseAndFormat(inputArray[inputArray.length - i - 1]);
        }

        return resultArray;
    }

    private static String reverseAndFormat(String input) {
        StringBuilder reversed = new StringBuilder();
        reversed.append(Character.toUpperCase(input.charAt(input.length() - 1)));

        for (int i = input.length() - 2; i >= 0; i--) {
            reversed.append(Character.toLowerCase(input.charAt(i)));
        }

        return reversed.toString();
    }

    private static void printArray(String[] arr) {

        for (String element : arr) {
            System.out.println("\"" + element + "\",");
        }
        System.out.println("End of the array");
    }
}

