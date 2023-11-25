package vn.edu.iuh.fit.backEnds.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "skill")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Skill implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "skill_description")
    private String desc;
    @Column(name = "skill_name")
    private String name;
    @Column(columnDefinition = "tinyint")
    private int type;

    @OneToMany(mappedBy = "skill")
    private List<CandidateSkill> candidateSkills;
    @OneToMany(mappedBy = "skill")
    private List<JobSkill> jobSkills;

    public Skill(String desc, String name, int type) {
        this.desc = desc;
        this.name = name;
        this.type = type;
    }

    public Skill(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
