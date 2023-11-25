package vn.edu.iuh.fit.frontEnd.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.edu.iuh.fit.backEnds.models.Candidate;
import vn.edu.iuh.fit.backEnds.models.CandidateSkill;
import vn.edu.iuh.fit.backEnds.models.Skill;
import vn.edu.iuh.fit.frontEnd.models.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
@Controller
public class FindCandidate {
    @Autowired
    private JobSkillModel jobSkillModel;
    @Autowired
    private CandidateSkillModel candidateSkillModel;
    @Autowired
    private CandidateModel candidateModel;
    @Autowired
    private SkillModel skillModel;
    @GetMapping("/candidate_by_skill")
    public String findCandidate(Model model){
        List<Skill> skills = skillModel.findAll();
        model.addAttribute("skills", skills);
        return "candidate/find_candidate";
    }
    @GetMapping("/get_skill")
    public void doGet(HttpServletResponse response, @RequestParam(name = "name")String skillName , @RequestParam(name = "level") String skillLevel) throws IOException {
        response.sendRedirect( "fit_candidate?name="+skillName+"&level="+skillLevel);
    }
    @GetMapping("/fit_candidate")
    public String fitCandidates(Model model, @RequestParam(name = "name")String skillName , @RequestParam(name = "level") String skillLevel){
        List<CandidateSkill> candidateSkills = candidateSkillModel.getAll();
        List<Candidate> candidates = new ArrayList<Candidate>();
        for (CandidateSkill canSkill : candidateSkills){
            if ( canSkill.getSkill().getName().equals(skillName) && canSkill.getSkillLevel().toString().equals(skillLevel)){
                candidates.add(canSkill.getCandidate());
            }
        }
        model.addAttribute("candidates",candidates);
        return "candidate/candidates_by_skill";
    }
}
