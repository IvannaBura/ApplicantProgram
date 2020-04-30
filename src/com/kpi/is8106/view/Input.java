package com.kpi.is8106.view;

import java.util.Scanner;

public class Input {

    private Validator validator;
    private Scanner scanner;
    private static final int WRONG_ITEM = -1;

    public Input() {
        validator = new Validator();
        scanner = new Scanner(System.in);
    }

    public int getChooseMenuItem(Output output) {
        String menuItem;
        menuItem = scanner.nextLine();
        if (Validator.validateMenuItem(menuItem)) {
            return Integer.parseInt(menuItem);
        } else {
            output.showMessage("Menu item is invalid, input another menu item");
            return WRONG_ITEM;
        }
    }

    public int inputPresetMark(Output output) {
        String presetMark;
        output.showMessage("Enter mark to find applicants have mark above this one:");
        presetMark = scanner.nextLine();
        if (Validator.validatePresetMark(presetMark)) {
            return Integer.parseInt(presetMark);
        } else {
            output.showMessage("Enter integer value between 0 and 100");
            return WRONG_ITEM;
        }
    }

}
