package com.workintech.grocery;

import java.util.HashSet;
import java.util.Scanner;

public class groceryListMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        groceryList groceryList = new groceryList();

        int choice;
        do {
            System.out.println("Enter your choice: 0 to stop, 1 to add items, 2 to remove items");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter the elements you want to be added:");
                        String addItems = scanner.nextLine();
                        groceryList.addItems(addItems);
                        HashSet<String> addedItems = groceryList.getAddedItemsThisSession();
                        System.out.println("Added items: " + String.join(", ", addedItems));
                        break;
                    case 2:
                        System.out.println("Enter the elements you want to be removed:");
                        String removeItems = scanner.nextLine();
                        groceryList.removeItems(removeItems);
                        HashSet<String> removedItems = groceryList.getRemovedItemsThisSession();
                        System.out.println("Removed items: " + String.join(", ", removedItems));
                        break;
                    case 0:
                        System.out.println("Exiting the application.");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
                System.out.println("Updated Grocery List:");
                groceryList.printSorted();
            } else {
                String invalidInput = scanner.nextLine();
                System.out.println("Invalid input: " + invalidInput);
                choice = -1;
            }
        } while (choice != 0);
    }
}