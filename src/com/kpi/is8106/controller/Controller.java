package com.kpi.is8106.controller;

import com.kpi.is8106.model.Service;
import com.kpi.is8106.view.Output;

public class Controller {
    private Service service;
    private Output output;

    public Controller() {
        output = new Output();
        service = new Service();
    }

    public void run(){
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
                output.showApplicants(service.getPoorMarksApplicants());
                break;
            case 3:
                int presetMark = output.getPresetMark();
                output.showApplicants(service.getMarkAbovePresetApplicants(presetMark));
                break;
            case 4:
                System.exit(0);
        }

    }
}
