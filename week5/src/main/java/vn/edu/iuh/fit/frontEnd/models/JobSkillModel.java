package vn.edu.iuh.fit.frontEnd.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backEnds.models.JobSkill;
import vn.edu.iuh.fit.backEnds.services.JobService;
import vn.edu.iuh.fit.backEnds.services.JobSkillService;

import java.util.List;
@Component
public class JobSkillModel {
    @Autowired
    private JobSkillService jobSkillService;
    public List<JobSkill> getAll(){
        return jobSkillService.findAll();
    }
}
