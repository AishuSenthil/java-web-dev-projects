package org.launchcode;
import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    // Allow for default constructor
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    // Define custom toString()
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizers")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder mainCourse = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("main course")) {
                mainCourse.append("\n").append(item.toString()).append("\n");
            }
        }
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("desserts")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nGOOD EATS MENU\n" +
                "APPETIZERS" + appetizers.toString() + "\n" +
                "MAIN COURSES" + mainCourse.toString() + "\n" +
                "DESSERTS" + desserts.toString() + "\n";
    }

    // TODO DEFINE addItem()
    void addItem(MenuItem newItem) {
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    // TODO Remove Item
    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }

}