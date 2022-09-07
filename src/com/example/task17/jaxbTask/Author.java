package com.example.task17.jaxbTask;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "author")
@XmlType(propOrder = {"lastName", "firstName", "nationality", "yearOfBirth", "yearOfDeath"})
public class Author {
    @XmlElement
    private String lastName;
    @XmlElement
    private String firstName;
    @XmlElement
    private String nationality;
    @XmlElement
    private int yearOfBirth;
    @XmlElement
    private int yearOfDeath;

    public Author(String lastName, String firstName, String nationality, int yearOfBirth, int yearOfDeath) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
        this.yearOfDeath = yearOfDeath;
    }

    public Author() {
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setYearOfDeath(int yearOfDeath) {
        this.yearOfDeath = yearOfDeath;
    }

    @Override
    public String toString() {
        return "Author{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", yearOfDeath=" + yearOfDeath +
                '}';
    }
}
