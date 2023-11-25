package vn.edu.iuh.fit.frontEnd.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backEnds.models.Skill;
import vn.edu.iuh.fit.backEnds.services.SkillService;

import java.util.List;

@Component
public class SkillModel {
    @Autowired
    private SkillService skillService;

    public List<Skill> findAll(){return skillService.findAll();}
}
