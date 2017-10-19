package com.company;

public class Skill {
    String field;
    String rating;

    public Skill(String field, String rating) {
        this.field = field;
        this.rating = rating;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "field='" + field + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }

    public String write(){
        return field + ", " + rating + "\n";

    }
}
