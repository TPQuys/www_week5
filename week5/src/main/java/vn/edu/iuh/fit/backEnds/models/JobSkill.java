package vn.edu.iuh.fit.backEnds.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vn.edu.iuh.fit.backEnds.enumModel.EnumSkill;

import java.io.Serializable;

@Entity
@Table(name = "job_skill")
@IdClass(JobSkill.class)
@Setter
@Getter
@ToString
public class JobSkill implements Serializable {
    @Column(name = "more_infos",length = 1000)
    private String infos;
    @Column(name = "skill_level",nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private EnumSkill level;
    @Id
    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job job;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill skill;


    public JobSkill() {

    }
}
