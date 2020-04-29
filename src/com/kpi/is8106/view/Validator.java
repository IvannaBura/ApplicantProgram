package com.kpi.is8106.view;

public class Validator {
    static boolean validateMenuItem(String menuItem) {
        return menuItem.matches("[1-4]");
    }
    static boolean validatePresetMark(String presetMark) {
        return presetMark.matches("[0-9]|[1-9][0-9]|100");
    }
}
