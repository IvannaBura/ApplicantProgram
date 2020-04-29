package com.kpi.is8106.view;

import java.util.Scanner;

public class Input {

    private Validator validator;
    private Scanner scanner;
    private static final int WRONG_MENU_ITEM = -1;

    public Input() {
        validator = new Validator();
        scanner = new Scanner(System.in);
    }

    public int getChooseMenuItem() {
        String menuItem;
        menuItem = scanner.nextLine();
        if (Validator.validateMenuItem(menuItem)) {
            return Integer.parseInt(menuItem);
        } else {
            System.out.println("Menu item is invalid, input another menu item");
            return WRONG_MENU_ITEM;
        }

    }
}
