package com.kpi.is8106.model;

import static java.lang.Math.random;

public class DataSource {

    public static  Applicant[] generateEntities() {
        Applicant[] entities = new Applicant[10];
        for (int i=0; i < entities.length; i++) {
            entities[i]=getRandomApplicant();
        }
        return entities;
    }

    private static Applicant getRandomApplicant() {
        String[] surname = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Wilson", "Anderson", "Taylor"};
        String[] name = {"Emma", "Liam", "Olivia", "Noah", "Ava", "William", "Isabella", "James", "Sophia", "Oliver"};
        String[] patronymic = {"iveson", "nixon", "wilkins", "nelson", "williams", "emmerson", "hodson", "jetson", "andrews", "davidson"};
        String[] address = {"Laigh Mount", "Homestead Street", "Montpellior Road", "Academy Downs", "Station South",
                "Bristol Place", "Underwood Hill", "Linnets Park", "Oxford Bottom", "Pond Sidings"};

        return new Applicant ((int) (random()*100000),
                (surname[(int) (random()*10)]),
                (name[(int) (random()*10)]),
                (patronymic[(int) (random()*10)]),
                (address[(int) (random()*10)]),
                "+44 " + (int) (random() * 100) + " " + (int) (random() * 10000) + " " + (int) (random() * 10000),
                (int) (random()*100));

    }
}

