package com.codeclan.example.WhiskyDistillery.models;


import javax.persistence.*;

@Entity
@Table(name="whiskys")
public class Whisky {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="name")
    private String name;
    @ManyToOne
    @JoinColumn(name="distillery_id", nullable = false)
    private Distillery distillery;
    @Column(name="year")
    private int year;
    @Column(name="age")
    private int age;

    public Whisky(String name, Distillery distillery, int year, int age){
        this.name = name;
        this.distillery = distillery;
        this.year = year;
        this.age = age;
    }

    public Whisky(){

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

    public Distillery getDistillery() {
        return distillery;
    }

    public void setDistillery(Distillery distillery) {
        this.distillery = distillery;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
