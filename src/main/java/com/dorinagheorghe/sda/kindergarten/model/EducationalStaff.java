package com.dorinagheorghe.sda.kindergarten.model;

import javax.persistence.*;

@Entity
@Table(name = "educationalStaff")
class EducationalStaff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "children_class_id")
    private ChildrenClass childrenClass;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ChildrenClass getChildrenClass() {
        return childrenClass;
    }

    public void setChildrenClass(ChildrenClass childrenClass) {
        this.childrenClass = childrenClass;
    }

    @Override
    public String toString() {
        return "EducationalStaff{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", childrenClass=" + childrenClass +
                '}';
    }
}
