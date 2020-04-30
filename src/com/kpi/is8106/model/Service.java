package com.kpi.is8106.model;
import java.util.Arrays;

public class Service {
    private Applicant[] applicants;

    public Applicant[] getApplicants() {
        return applicants;
    }

    public Service() {
        applicants = DataSource.generateEntities();
    }

    public Applicant[] getPoorMarksApplicants() {
        Applicant[] result = new Applicant[applicants.length];

        int counter = 0;
        for( int i = 0; i < applicants.length; i++) {
            if (applicants[i].getMark() <= 60) {
                result[counter] = applicants[i];
                counter++;
            }
        }

        return Arrays.copyOf(result, counter);
    }

    public Applicant[] getMarkAbovePresetApplicants(int presetMark) {
        Applicant[] result= new Applicant[applicants.length];

        int counter = 0;

        for( int i = 0; i < applicants.length; i++) {
            if(applicants[i].getMark() >= presetMark ) {
                result[counter] = applicants[i];
                counter++;
            }
        }

        return Arrays.copyOf(result, counter);

    }

}
