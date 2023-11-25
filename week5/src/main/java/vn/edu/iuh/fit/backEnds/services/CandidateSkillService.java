package vn.edu.iuh.fit.backEnds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backEnds.models.CandidateSkill;
import vn.edu.iuh.fit.backEnds.repositoties.CandidateSkillRepository;

import java.util.List;
@Service
public class CandidateSkillService {
    @Autowired
    private CandidateSkillRepository skillRepository;
    public List<CandidateSkill> getAll(){return skillRepository.findAll();}
    public List<CandidateSkill> findId(long id){return skillRepository.findByCandidate_Id(id);}
}
