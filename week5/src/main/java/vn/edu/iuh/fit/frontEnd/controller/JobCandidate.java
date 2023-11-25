package vn.edu.iuh.fit.frontEnd.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vn.edu.iuh.fit.backEnds.models.*;
import vn.edu.iuh.fit.frontEnd.models.*;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class JobCandidate {
    @Autowired
    private JobModel jobModel;
    @Autowired
    private JobSkillModel jobSkillModel;
    @Autowired
    private SkillModel skillModel;
    @Autowired
    private CandidateModel candidateModel;
    @GetMapping("/login")
    public String log(){
        return "candidate/candidate_login";
    }
    @RequestMapping(value = "/controller",method = RequestMethod.POST)
    public void doPost( HttpServletResponse response, @RequestParam("can_id")String id) throws IOException {
        response.sendRedirect("/jobs_candidate?id="+id);
    }
    @GetMapping("/jobs_candidate")
    public String findCandidate(Model model, HttpServletRequest request, @RequestParam("id")String id){
        Candidate candidate = candidateModel.findId(Long.parseLong(id)).get();
        List<Job> jobs = jobModel.findAll();
        List<JobSkill> jobSkills = jobSkillModel.getAll();
        List<Skill> skills = skillModel.findAll();
        List<String> jobNames = new ArrayList<String>();
        List<Skill> missSkill = new ArrayList<>();
        missSkill.addAll(skills);
        for (JobSkill jobSkill: jobSkills){
            for(CandidateSkill candidateSkill : candidate.getCandidateSkills()){
                if (candidateSkill.getSkill()==jobSkill.getSkill() && candidateSkill.getSkillLevel()==jobSkill.getLevel()){
                    if(!jobNames.contains(jobSkill.getJob().getName()))
                    jobNames.add(jobSkill.getJob().getName());
                }
            }
        }
        for (Skill skill : skills){
            for (CandidateSkill candidateSkill : candidate.getCandidateSkills() ){
               if (candidateSkill.getSkill().getName().equals(skill.getName())){
                   missSkill.remove(skill);
               }
           }
       }
        model.addAttribute("skills",missSkill);
        model.addAttribute("candidate",candidate);
        model.addAttribute("jobNames",jobNames);
        model.addAttribute("jobs",jobs);
        return "candidate/jobs_candidate";
    }
}
