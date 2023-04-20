package it.aulab.learningplatform2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Embeddable
public class Person {

        @Column(length = 100, nullable = false)
        private String firstname;
    
        @Column(length = 100, nullable = false)
        private String lastname;
    
    
    
}
