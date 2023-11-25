package vn.edu.iuh.fit.frontEnd.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backEnds.models.CandidateSkill;
import vn.edu.iuh.fit.backEnds.services.CandidateSkillService;

import java.util.List;

@Component
public class CandidateSkillModel {
    @Autowired
    private CandidateSkillService skillService;
    public List<CandidateSkill> getAll(){return skillService.getAll();}
    public List<CandidateSkill> findId(long id){return skillService.findId(id);}
}
