package com.company;

import java.util.ArrayList;

public class Resume {
    private String Name;
    private String email;
    private ArrayList<EducationalExperience> educationalExperiences;
    private ArrayList<JobExperience> jobExperiences;
    private ArrayList<Skill> skills;

    public Resume(String name, String email, ArrayList<EducationalExperience> educationalExperiences,
                  ArrayList<JobExperience> jobExperiences, ArrayList<Skill> skills) {
        Name = name;
        this.email = email;
        this.educationalExperiences = educationalExperiences;
        this.jobExperiences = jobExperiences;
        this.skills = skills;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<EducationalExperience> getEducationalExperiences() {
        return educationalExperiences;
    }

    public void setEducationalExperiences(ArrayList<EducationalExperience> educationalExperiences) {
        this.educationalExperiences = educationalExperiences;
    }

    public ArrayList<JobExperience> getJobExperiences() {
        return jobExperiences;
    }

    public void setJobExperiences(ArrayList<JobExperience> jobExperiences) {
        this.jobExperiences = jobExperiences;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", educationalExperiences=" + educationalExperiences +
                ", jobExperiences=" + jobExperiences +
                ", skills=" + skills +
                '}';
    }

    public String write(){

        String edExpString = "";

        for (EducationalExperience educationalExperience:educationalExperiences)
        {
            edExpString = edExpString+ educationalExperience.toString();
        }

        String jobExpString = "";

        for (JobExperience jobExperience:jobExperiences)
        {
            jobExpString = jobExpString+ jobExperience.toString();
        }

        String skillsString = "";

        for(Skill skill:skills)
        {
            skillsString = skillsString + skill.toString();
        }
        return "Resume\n" +
                Name + "\n"+
                email + "\n" +
                edExpString +
                jobExpString +
                skillsString;
    }
}
