package com.dorinagheorghe.sda.kindergarten.model;

import javax.persistence.*;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "price")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Positive
    @Column(name = "price")
    private Double price;

    @Column(name = "currency")
    private String currency;

    @OneToOne
    @JoinColumn(name = "program_id")
    private Program program;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", price=" + price +
                ", program=" + program +
                '}';
    }
}
