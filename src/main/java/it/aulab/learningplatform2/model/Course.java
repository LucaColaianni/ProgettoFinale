package it.aulab.learningplatform2.model;

import java.time.LocalDate;

import java.util.List;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 1000)
    private String description;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(
            name = "firstname",
            column = @Column(
                name = "teacher_firstname",
                length = 100,
                nullable = false
        )),
        @AttributeOverride(
            name = "lastname",
            column = @Column(
                name = "teacher_lastname",
                length = 100,
                nullable = false
        )),
    })
    private Person teacher;

    // @Column(columnDefinition = "DATE")
    private LocalDate date;

    @OneToMany(mappedBy = "course")
    private List<Lesson> lessons;

    @ManyToMany
    @JoinTable(
        name = "courses_students", 
        joinColumns = @JoinColumn(name = "course_id", nullable = false),
        inverseJoinColumns = @JoinColumn(name = "student_id", nullable = false)
    )
    private List<Student> students;




}
