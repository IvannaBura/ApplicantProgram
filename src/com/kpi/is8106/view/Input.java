package com.kpi.is8106.view;

import com.kpi.is8106.view.exceptions.WrongMenuItemException;
import com.kpi.is8106.view.exceptions.WrongPresetMarkException;

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
        try {
            Validator.validateMenuItem(menuItem);
        }
        catch (WrongMenuItemException e){
            System.err.println(e.getMessage());
            return WRONG_ITEM;
        }
        return Integer.parseInt(menuItem);
    }

    public int inputPresetMark(Output output) {
        String presetMark;
        output.showMessage("Enter mark to find applicants have mark above this one:");
        presetMark = scanner.nextLine();
        try {
            Validator.validatePresetMark(presetMark);
        }
        catch (WrongPresetMarkException e){
            System.err.println(e.getMessage());
            return WRONG_ITEM;
        }
        return Integer.parseInt(presetMark);
    }

}
