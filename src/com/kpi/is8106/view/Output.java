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
        System.out.println("3. Show list of students that has marks above 85");
        System.out.println("4. Exit");
    }

    public int getMenuItem() {
        int menuItem;
        while (true) {
            menuItem = input.getChooseMenuItem();
            if (menuItem != -1)
                return menuItem;
        }
    }

    public void showApplicants(Applicant[] applicants) {
        int noOneApplicant = 0;
        if (noOneApplicant == applicants.length){
            System.out.println("Applicants not found");
        } else {
            for (int i = 0; i < applicants.length; i++) {
                if(applicants[i]==null){
                    noOneApplicant++;
                } else {
                    int n = i + 1;
                    System.out.println("----- Applicant " + n + " -----");
                    System.out.println(applicants[i].toString() + "\n");
                }
            }
        }
    }

}
