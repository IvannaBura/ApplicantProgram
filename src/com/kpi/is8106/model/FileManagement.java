package com.kpi.is8106.model;

import java.io.*;

public class FileManagement {
    void writeDataToFile(Applicant[] applicants, String filePath) {
        if (applicants.length == 0) {
            return;
        }
        try (FileWriter fileWriter = new FileWriter(filePath, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            for (Applicant applicant :
                    applicants) {
                bufferedWriter.write(applicant.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Applicant[] readDataFromFile(String filePath, int numberOfApplicants) {
        Applicant[] applicants = new Applicant[numberOfApplicants];

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            for (int i = 0; bufferedReader.read() != -1; i++) {
                String data = bufferedReader.readLine();
                String[] applicantData = data.split(", ");
                applicants[i] = new Applicant();
                applicants[i].setId(Integer.parseInt(applicantData[0]));
                applicants[i].setSurname(applicantData[1]);
                applicants[i].setName(applicantData[2]);
                applicants[i].setPatronymic(applicantData[3]);
                applicants[i].setAddress(applicantData[4]);
                applicants[i].setPhoneNumber(applicantData[5]);
                applicants[i].setMark(Byte.parseByte(applicantData[6]));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return applicants;
    }
}
