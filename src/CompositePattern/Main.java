package CompositePattern;

import CompositePattern.impl.Composite;
import CompositePattern.impl.Leaf;
import CompositePattern.interfaces.Component;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Component> menuList = createMenus();
        Component restaurant = new Composite("Welcome to GOVIL'S RESTAURANT", menuList);
        System.out.println(restaurant.operation());
    }

    private static List<Component> createMenus() {
        List<Component> menuList = new ArrayList<>();
        menuList.add(createBreakfastMenu());
        menuList.add(createLunchMenu());
        menuList.add(createDinnerMenu());
        return menuList;
    }

    private static Component createBreakfastMenu() {
        List<Component> breakfastMenuList = new ArrayList<>();
        breakfastMenuList.add(new Leaf("Scrambled Eggs"));
        breakfastMenuList.add(new Leaf("Bread and Toast"));
        return new Composite("BREAKFAST MENU", breakfastMenuList);
    }

    private static Component createLunchMenu() {
        List<Component> lunchMenuList = new ArrayList<>();
        lunchMenuList.add(new Leaf("Dal Makhani"));
        lunchMenuList.add(new Leaf("Rajma Masala"));
        lunchMenuList.add(createLunchSpecials());
        return new Composite("LUNCH MENU", lunchMenuList);
    }

    private static Component createLunchSpecials() {
        List<Component> lunchSpecialsList = new ArrayList<>();
        lunchSpecialsList.add(new Leaf("Butter Chicken"));
        lunchSpecialsList.add(new Leaf("Paneer Lababdar"));
        return new Composite("--- Lunch Specials ---", lunchSpecialsList);
    }

    private static Component createDinnerMenu() {
        List<Component> dinnerMenuList = new ArrayList<>();
        dinnerMenuList.add(new Leaf("Margherita Pizza"));
        dinnerMenuList.add(new Leaf("Bolognese Pasta"));
        dinnerMenuList.add(createDessertMenu());
        return new Composite("DINNER MENU", dinnerMenuList);
    }

    private static Component createDessertMenu() {
        List<Component> dessertMenuList = new ArrayList<>();
        dessertMenuList.add(new Leaf("Gulab Jamun"));
        dessertMenuList.add(new Leaf("Tiramisu"));
        return new Composite("--- Desserts ---", dessertMenuList);
    }
}
