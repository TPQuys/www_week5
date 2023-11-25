package vn.edu.iuh.fit.backEnds.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "job")
@NoArgsConstructor
public class Job implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "job_desc",length = 2000,nullable = false)
    private String desc;
    @Column(name = "job_name",nullable = false)
    private String name;
    @ManyToOne
    private Company company;

    @OneToMany(mappedBy = "job")
    private List<JobSkill> jobSkills;

    public Job(String desc, String name, Company company) {
        this.desc = desc;
        this.name = name;
        this.company = company;
    }

    public Job(String desc, String name, Company company, List<JobSkill> skills) {
        this.desc = desc;
        this.name = name;
        this.company = company;
        this.jobSkills = skills;
    }

}
