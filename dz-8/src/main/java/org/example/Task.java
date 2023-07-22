package org.example;

public class Task {
    private Integer id;
    private String description;
    Task(Integer id, String description) {
        this.id=id;
        this.description=description;
    }

    public Integer getId() {
        return this.id;
    }
}
