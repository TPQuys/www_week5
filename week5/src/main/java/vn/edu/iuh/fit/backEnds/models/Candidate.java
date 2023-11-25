package vn.edu.iuh.fit.backEnds.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "candidate")
public class Candidate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private LocalDate dob;
    @Column(nullable = false)
    private String email;
    @Column(name = "full_name",nullable = false)
    private String fullName;
    @Column(length = 15,nullable = false)
    private String phone;
    @ManyToOne
    private Address address;
    @OneToMany(mappedBy = "candidate")
    private List<CandidateSkill> candidateSkills;


}
