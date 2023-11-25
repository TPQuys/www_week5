package vn.edu.iuh.fit.backEnds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backEnds.models.Candidate;
import vn.edu.iuh.fit.backEnds.repositoties.CandidateRepository;

import java.util.List;
import java.util.Optional;
@Service
public class CandidateService {
    @Autowired
    private CandidateRepository candidateRepository;
    public Optional<Candidate> findById(long id){
        return candidateRepository.findById(id);
    }

    public List<Candidate> getAll() {
        return candidateRepository.findAll();
    }
}
