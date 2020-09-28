package com.example.kuccps.MODEL_OBJECT;

public class CourseFieldModel {
    String title;
    String university;
    String description;
    int capacity;

    public CourseFieldModel(String title, String university, String description, int capacity) {
        this.title = title;
        this.university = university;
        this.description = description;
        this.capacity = capacity;
    }

    public String getTitle() {
        return title;
    }

    public String getUniversity() {
        return university;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }
}
