package com.kpi.is8106.model;

public class Service {
    private Applicant[] applicants;

    public Applicant[] getApplicants() {
        return applicants;
    }

    public Service() {
        applicants = DataSource.generateEntities();
    }

    public Applicant[] getPoorMarksApplicants() {
        Applicant[] result= new Applicant[10];

        int p = 0;
        for( int i = 0; i < applicants.length; i++) {
            if (applicants[i].getMark() <= 60) {
                result[p] = applicants[i];
                p++;
            }
        }

        return result;
    }

    public Applicant[] getMarkAbovePresetApplicants(int presetMark) {
        Applicant[] result= new Applicant[10];

        int p = 0;

        for( int i = 0; i < applicants.length; i++) {
            if(applicants[i].getMark() >= presetMark ) {
                result[p] = applicants[i];
                p++;
            }
        }

        return result;

    }

}
