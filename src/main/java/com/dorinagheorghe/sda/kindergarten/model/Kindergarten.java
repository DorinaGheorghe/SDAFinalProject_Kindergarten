package com.dorinagheorghe.sda.kindergarten.model;

import javax.persistence.*;

@Entity
@Table(name = "kindergarten")
public class Kindergarten {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "about_us")
    private String aboutUs;

    @Column(name = "educational_method")
    private String educationalMethod;

    @Column(name = "curriculum")
    private String curriculum;

    @Column(name = "team")
    private String team;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs;
    }

    public String getEducationalMethod() {
        return educationalMethod;
    }

    public void setEducationalMethod(String educationalMethod) {
        this.educationalMethod = educationalMethod;
    }

    public String getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(String curriculum) {
        this.curriculum = curriculum;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Kindergarten{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", aboutUs='" + aboutUs + '\'' +
                ", educationalMethod='" + educationalMethod + '\'' +
                ", curriculum='" + curriculum + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
