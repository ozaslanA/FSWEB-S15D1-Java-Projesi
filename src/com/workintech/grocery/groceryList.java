package com.workintech.grocery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class groceryList {

    private ArrayList<String> groceryList;
    private HashSet<String> addedItemsThisSession;
    private HashSet<String> removedItemsThisSession;

    public groceryList() {
        this.groceryList = new ArrayList<>();
        this.addedItemsThisSession = new HashSet<>();
        this.removedItemsThisSession = new HashSet<>();
    }
    public void addItems(String items) {
        String[] itemArray = items.split(",");
        for (String item : itemArray) {
            String trimmedItem = item.trim();
            if (!groceryList.contains(trimmedItem)) {
                groceryList.add(trimmedItem);
                addedItemsThisSession.add(trimmedItem);
            }
        }
        Collections.sort(groceryList);
    }
    public void removeItems(String items) {
        String[] itemArray = items.split(",");
        for (String item : itemArray) {
            String trimmedItem = item.trim();
            if (groceryList.contains(trimmedItem)) {
                groceryList.remove(trimmedItem);
                removedItemsThisSession.add(trimmedItem);
                addedItemsThisSession.remove(trimmedItem);
            } else {
                System.out.println("Item '" + trimmedItem + "' not found in the list.");
            }
        }
        Collections.sort(groceryList);
    }

    public boolean checkItemInList(String item) {
        return groceryList.contains(item);
    }

    public void printSorted() {
        Collections.sort(groceryList);
        for (String item : groceryList) {
            System.out.println(item);
        }
    }

    public HashSet<String> getAddedItemsThisSession() {
        return addedItemsThisSession;
    }

    public HashSet<String> getRemovedItemsThisSession() {
        return removedItemsThisSession;
    }
}
