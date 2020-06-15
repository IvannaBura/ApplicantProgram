package com.kpi.is8106.controller;

import com.kpi.is8106.model.Applicant;
import com.kpi.is8106.model.Service;
import com.kpi.is8106.view.Output;


public class Controller {
    private final Service service;
    private final Output output;

    public Controller() {
        service = new Service();
        output = new Output();
    }

    public void run() {
        service.setApplicants();
        int instruction;

        while (true) {
            output.showMenu();
            instruction = output.getMenuItem();
            executeInstruction(instruction);
        }
    }

    public void executeInstruction(int instruction){
        switch (instruction){
            case 1:
                output.showApplicants(service.getApplicants());
                break;
            case 2:
                Applicant[] applicants2 = service.getPoorMarksApplicants();
                output.showApplicants(service.getPoorMarksApplicants());
                service.saveResultToFile(applicants2);

                break;
            case 3:
                int presetMark = output.getPresetMark();
                Applicant[] applicants3 = service.getMarkAbovePresetApplicants(presetMark);
                output.showApplicants(service.getMarkAbovePresetApplicants(presetMark));
                service.saveResultToFile(applicants3);
                break;
            case 4:
                System.exit(0);
        }
    }


}