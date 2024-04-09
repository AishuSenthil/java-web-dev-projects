package org.launchcode;

public class Menu {
    private String Appetizer;
    private String MainCourse;
    private String Dessert;

    public Menu(String appetizer, String mainCourse, String dessert) {
        Appetizer = appetizer;
        MainCourse = mainCourse;
        Dessert = dessert;
    }

    public String getAppetizer() {
        return Appetizer;
    }

    public void setAppetizer(String appetizer) {
        Appetizer = appetizer;
    }

    public String getMainCourse() {
        return MainCourse;
    }

    public void setMainCourse(String mainCourse) {
        MainCourse = mainCourse;
    }

    public String getDessert() {
        return Dessert;
    }

    public void setDessert(String dessert) {
        Dessert = dessert;
    }


}
