package vn.edu.iuh.fit.backEnds.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backEnds.models.Job;
import vn.edu.iuh.fit.backEnds.models.JobSkill;
import vn.edu.iuh.fit.backEnds.models.Skill;

import javax.swing.*;
import java.util.List;

public interface JobSkillRepository extends JpaRepository<JobSkill, Long> {
    public List<JobSkill> findJobSkillByJob_Id(long id);
}
