package vn.edu.iuh.fit.backEnds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backEnds.models.Skill;
import vn.edu.iuh.fit.backEnds.repositoties.SkillRepository;

import java.util.List;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;
    public List<Skill> findAll(){return skillRepository.findAll();}
    public void insert(Skill s){skillRepository.save(s);}
}
