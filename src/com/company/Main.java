package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner fileScan;
        ArrayList<EducationalExperience> educationalExperiences = new ArrayList<EducationalExperience>();
        ArrayList<JobExperience> jobExperiences = new ArrayList<JobExperience>();
        ArrayList<Skill> skills = new ArrayList<Skill>();

        File file = new File("resume.txt");
        Scanner keyboard = new Scanner(System.in);

        String name = fileScan.nextLine();
        String email = fileScan.nextLine();
        do {
            String degree = fileScan.nextLine();
            String completationYear;
        }while (education not finished);

        do {
            String degree = fileScan.nextLine();
            String completationYear;
        }while (experience not finished);

        do {
        }
        }while (skills not finished);

    Resume resume = new Resume(name, email, educationalExperiences, jobExperiences,skills );
    resume.write();

    }
}
