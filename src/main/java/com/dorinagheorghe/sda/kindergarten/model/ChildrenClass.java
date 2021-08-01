package com.dorinagheorghe.sda.kindergarten.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "children_class")
public class ChildrenClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "childrenClass")
    private List<Child> childList;

    @OneToMany(mappedBy = "childrenClass")
    private List<EducationalStaff> educationalStaffList;

    public ChildrenClass(Long id, String name, String description, List<Child> childList, List<EducationalStaff> educationalStaffList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.childList = childList;
        this.educationalStaffList = educationalStaffList;
    }

    public ChildrenClass() {

    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ChildrenClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
