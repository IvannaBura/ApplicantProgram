package com.kpi.is8106.model;
import java.util.Arrays;
import com.kpi.is8106.view.Input;
import com.kpi.is8106.view.Output;

public class Service {
    private Applicant[] applicants;
    private final FileManagement fileManagement;
    private Output output;
    private Input input;

    public Applicant[] getApplicants() {
        return applicants;
    }

    public Service() {
        fileManagement  = new FileManagement();
        output = new Output();
        input = new Input();
    }

    public void setApplicants(){
        int numberOfApplicants = 10;
        applicants = fileManagement.readDataFromFile("D:\\Ivanka\\Educations\\2course\\4\\" +
                "JavaTrack\\DataSource.txt", numberOfApplicants);
    }

    public Applicant[] getPoorMarksApplicants() {
        Applicant[] result = new Applicant[applicants.length];

        int counter = 0;
        for(Applicant applicant :
                applicants)  {
            if (applicant.getMark() <= 60) {
                result[counter] = applicant;
                counter++;
            }
        }

        return Arrays.copyOf(result, counter);
    }

    public Applicant[] getMarkAbovePresetApplicants(int presetMark) {
        Applicant[] result= new Applicant[applicants.length];

        int counter = 0;

        for(Applicant applicant :
                applicants)  {
            if(applicant.getMark() >= presetMark ) {
                result[counter] = applicant;
                counter++;
            }
        }

        return Arrays.copyOf(result, counter);

    }

    public void writeApplicantsToFile(Applicant[] applicants, String filePath) {
        fileManagement.writeDataToFile(applicants, filePath);
    }
    public void saveResultToFile(Applicant[] applicants) {
        if (input.askToSaveFile(output)) {
            writeApplicantsToFile(applicants, input.getFilePath(output));
        }
    }

}
