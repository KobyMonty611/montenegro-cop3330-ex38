package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;
import java.util.ArrayList;

class App {

    public static Integer[] filterEvenNumbers(ArrayList<Integer> list) {

        ArrayList<Integer> functionList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            //checks for even
            if (list.get(i) % 2 == 0) {
                functionList.add(list.get(i));
            }
        }

        Integer[] evens = new Integer[functionList.size()];
        evens = functionList.toArray(evens);

        return evens;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbers = scan.nextLine();

        ArrayList<Integer> numberList = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length(); i++) {
            try {
                numberList.add(Integer.parseInt(String.valueOf(numbers.charAt(i))));
            }
            catch (NumberFormatException e) {
                continue;
            }
        }

        // Test to see if array is stored correctly
        // System.out.print(numberList);

        Integer evenList[] = filterEvenNumbers(numberList);

        System.out.print("The even numbers are ");
        for (int i = 0; i < evenList.length; i++)
        {
            if (i < evenList.length - 1)
            {
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }

        }
        scan.close();
    }
}