package com.dorinagheorghe.sda.kindergarten.model;

import javax.persistence.*;

@Entity
@Table(name = "child")
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "age")
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "children_class_id")
    private ChildrenClass childrenClass;

    @OneToOne
    @JoinColumn(name = "contract_id")
    private Contract contract;

    public Child(Long id, String firstname, String lastname, Integer age, ChildrenClass childrenClass, Contract contract) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.childrenClass = childrenClass;
        this.contract = contract;
    }

    public Child(){

    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ChildrenClass getChildrenClass() {
        return childrenClass;
    }

    public void setChildrenClass(ChildrenClass childrenClass) {
        this.childrenClass = childrenClass;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    @Override
    public String toString() {
        return "Child{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", childrenClass=" + childrenClass +
                ", contract=" + contract +
                '}';
    }
}
