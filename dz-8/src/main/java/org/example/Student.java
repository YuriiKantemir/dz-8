package org.example;

public class Student {

    private Integer id;
    private String firstName;
    private String lastName;

    public Integer getId() {
        return this.id;
    }

    Student(Integer id, String firstName, String lastName){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
    }

}
