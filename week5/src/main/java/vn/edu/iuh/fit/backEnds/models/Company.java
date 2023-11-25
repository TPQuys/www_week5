package vn.edu.iuh.fit.backEnds.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "company")
@Getter
@NoArgsConstructor
public class Company implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 2000)
    private String about;
    @Column(nullable = false)
    private String email;
    @Column(name = "company",nullable = false)
    private String compName;
    @Column(nullable = false)
    private String phone;
    @Column(name = "web_url")
    private String web;
    @ManyToOne
    private Address address;
    @OneToMany(mappedBy = "company")
    private Set<Job> jobs;

    public Company(int id) {
        this.id = id;
    }

}
