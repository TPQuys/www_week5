package vn.edu.iuh.fit.backEnds.repositoties;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.backEnds.models.Job;

public interface JobRepository extends JpaRepository<Job,Long> {
}
