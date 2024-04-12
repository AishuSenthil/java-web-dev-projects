package org.launchcode;

public class Main {

    public static void main(String[] args) {

        MenuItem item1 = new MenuItem ("Brown Sugar Crusted Salmon", "Who doesn't like a little sugar on their salmon?", 34.99, "main course" );
        MenuItem item2 = new MenuItem ("Cajun Mac n' Cheese", "We don't do REGULAR Mac n' Cheese.", 22.99, "appetizers" );
        MenuItem item3 = new MenuItem ("Triple Threat", "6 Mozzarella Sticks, 6 Bacon Potato Skins, 6 Mini Burgers.", 34.99, "appetizers" );
        MenuItem item4 = new MenuItem ("12oz Sirloin", "For the men.. or women.", 34.99, "main course" );
        MenuItem item5 = new MenuItem ("Unlimited Ice Cream", "Choose 1 or choose all your favorite flavors.", 19.99, "desserts" );

        System.out.println(item1.isNew());

        // TODO Print first line
        System.out.println(item1);

        // TODO Create menu
        Menu menu = new Menu();

        // TODO Add items ot menu and print it
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        System.out.println(menu);

        // TODO Remove an item and print menu
        menu.removeItem(item4);
        System.out.println(menu);

        // TODO Test equals method
        System.out.println(item1.equals(item2));

    }

}