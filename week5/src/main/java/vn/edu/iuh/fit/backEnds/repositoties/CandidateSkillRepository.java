package vn.edu.iuh.fit.backEnds.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.backEnds.models.Candidate;
import vn.edu.iuh.fit.backEnds.models.CandidateSkill;

import java.util.List;

@Repository
public interface CandidateSkillRepository extends JpaRepository<CandidateSkill, Long> {
    public List<CandidateSkill> findByCandidate_Id(long id);
}
