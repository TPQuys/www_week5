package vn.edu.iuh.fit.backEnds.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vn.edu.iuh.fit.backEnds.enumModel.EnumSkill;

import java.io.Serializable;

@Entity
@Table(name = "candidate_skill")
@IdClass(CandidateSkill.class)
@Getter
@Setter
@ToString
public class CandidateSkill implements Serializable {
    @Column(name = "more_infos",length = 1000)
    private String infos;
    @Column(name = "skill_level",columnDefinition = "tinyint",nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private EnumSkill skillLevel;
    @Id
    @ManyToOne
    @JoinColumn(name = "can_id",nullable = false)
    private Candidate candidate;
    @Id
    @ManyToOne
    @JoinColumn(name = "skill_id",nullable = false)
    private Skill skill;
}
