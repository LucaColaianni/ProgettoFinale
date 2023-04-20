package it.aulab.learningplatform2.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    // @AttributeOverrides({
    //     @AttributeOverride(
    //         name = "firstname", 
    //         column = @Column(
    //             name = "firstname", 
    //             nullable = false
    //         )),
    //     @AttributeOverride(
    //         name = "lastname", 
    //         column = @Column(
    //             name = "lastname", 
    //             nullable = false
    //         )),
    // })
    private Person data;

    @Column(length = 100, nullable = false, unique = true)
    private String email;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;



}
