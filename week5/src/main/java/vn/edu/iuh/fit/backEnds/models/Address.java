package vn.edu.iuh.fit.backEnds.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "address")
@Getter
@Setter
public class Address implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 150)
    private String street;
    @Column(length = 50)
    private String city;
    @Column(columnDefinition = "tinyint")
    private int country;
    @Column(length = 20)
    private String number;
    @Column(length = 7)
    private String zip;
    @OneToMany(mappedBy = "address")
    private List<Candidate> candidates;
    @OneToMany(mappedBy = "address")
    private List<Company> companies;
}
