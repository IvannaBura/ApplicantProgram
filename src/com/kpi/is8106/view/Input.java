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
            output.showErrorMessage(e.getMessage());
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
            output.showErrorMessage(e.getMessage());
            return WRONG_ITEM;
        }
        return Integer.parseInt(presetMark);
    }

    public boolean askToSaveFile(Output output) {
        output.showMessage("Do you need to save the result into file? (y/n)");
        do {
            String key;
            key=scanner.nextLine();

            if (Validator.validateYesNoKey(key)) {
                return key.equals("Y") || key.equals("y");
            } else output.showMessage("Key '" + key+ "' is invalid, input another key! (y/n)");
        } while (true);
    }

    public String getFilePath(Output output){
        do {
            output.showMessage("Enter file path where you need to save this and file name.");
            String filePath = scanner.nextLine();
            if (Validator.validateFilePath(filePath)) return filePath;
            else output.showMessage("File path '" + filePath + "' is invalid, input another file path.\n");
        } while (true);
    }

}
