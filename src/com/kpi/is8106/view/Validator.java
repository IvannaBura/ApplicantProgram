package com.kpi.is8106.view;

import com.kpi.is8106.view.exceptions.WrongMenuItemException;
import com.kpi.is8106.view.exceptions.WrongPresetMarkException;

public class Validator {
    static void validateMenuItem(String menuItem) throws WrongMenuItemException {
        if (!menuItem.matches("[1-4]")){
            throw new WrongMenuItemException("Menu item '" + menuItem + "' is invalid, input another menu item.");
        }
    }
    static void validatePresetMark(String presetMark) throws WrongPresetMarkException {
        if (!presetMark.matches("[0-9]|[1-9][0-9]|100")){
            throw new WrongPresetMarkException("Preset mark '" + presetMark +"' is invalid, enter integer value between 0 and 100.");
        }
    }
}
