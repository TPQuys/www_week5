package vn.edu.iuh.fit.backEnds.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backEnds.models.Skill;

public interface SkillRepository extends JpaRepository<Skill,Long> {
}
