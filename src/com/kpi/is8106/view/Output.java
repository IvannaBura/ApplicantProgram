package com.kpi.is8106.view;

import com.kpi.is8106.model.Applicant;


public class Output {
    private Input input;

    public Output() {
        input = new Input();
    }
    public void showMenu() {
        System.out.println("MENU");
        System.out.println("1. Show list of all applicants");
        System.out.println("2. Show list of students that has poor marks");
        System.out.println("3. Show list of students that has marks above preset");
        System.out.println("4. Exit");
    }

    public int getMenuItem() {
        int menuItem;
        while (true) {
            menuItem = input.getChooseMenuItem(this);
            if (menuItem != -1)
                return menuItem;
        }
    }

    public int getPresetMark() {
        int presetMark;
        while (true) {
            presetMark = input.inputPresetMark(this);
            if (presetMark != -1)
                return presetMark;
        }
    }

    public void showApplicants(Applicant[] applicants) {

        if (applicants.length == 0 ){
            System.out.println("Applicants not found.\n");
            return;
        }
        System.out.println("ID\t\tApplicant\t\tAddress\t\t"+
                "Phone number\tMark\n");
        for (Applicant applicant :
                applicants) {
            System.out.print(applicant.toString());
        }
        System.out.print("\n");
    }

    public void showMessage(String string){
        System.out.println(string);
    }

    public void showErrorMessage(String string){
        System.err.println(string);
    }
}