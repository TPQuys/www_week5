package vn.edu.iuh.fit.frontEnd.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backEnds.models.Candidate;
import vn.edu.iuh.fit.backEnds.services.CandidateService;

import java.util.List;
import java.util.Optional;

@Component
public class CandidateModel {
    @Autowired
    private CandidateService candidateService;
    public List<Candidate > getAll(){return candidateService.getAll();}
    public Optional<Candidate> findId(long id) {return candidateService.findById(id);}
}
