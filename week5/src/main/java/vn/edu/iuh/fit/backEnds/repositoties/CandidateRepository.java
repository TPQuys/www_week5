package vn.edu.iuh.fit.backEnds.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backEnds.models.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate,Long> {
}
