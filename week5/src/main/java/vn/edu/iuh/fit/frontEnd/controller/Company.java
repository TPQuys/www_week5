package vn.edu.iuh.fit.frontEnd.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import vn.edu.iuh.fit.backEnds.models.Job;
import vn.edu.iuh.fit.backEnds.models.JobSkill;
import vn.edu.iuh.fit.backEnds.models.Skill;
import vn.edu.iuh.fit.frontEnd.models.CompanyModel;
import vn.edu.iuh.fit.frontEnd.models.JobModel;
import vn.edu.iuh.fit.frontEnd.models.JobSkillModel;
import vn.edu.iuh.fit.frontEnd.models.SkillModel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Company {
    @Autowired
    private JobModel jobModel;
    @Autowired
    private CompanyModel companyModel;
    @Autowired
    private SkillModel skillModel;

    @GetMapping("/job")
    public String jobs(Model model){
        List<Job> jobs = jobModel.findAll();
        model.addAttribute("jobs",jobs);
        return "jobs/DangTuyen";
    }
    @GetMapping("/add_job")
    public String addJob(Model model){
        List<Skill> skills = skillModel.findAll();
        List<vn.edu.iuh.fit.backEnds.models.Company> companies = companyModel.findAll();
        model.addAttribute("companies",companies);
        return "jobs/createJob";
    }
    @PostMapping ("job/add")
    public String addJob(HttpServletRequest request, Model model) throws IOException {
        String name = request.getParameter("job_name");
        int com = Integer.parseInt(request.getParameter("company"));
        String desc = request.getParameter("desc");
        Job job = new Job(desc,name,new vn.edu.iuh.fit.backEnds.models.Company(com));
        jobModel.addJob(job);
        List<Job> jobs = jobModel.findAll();
        model.addAttribute("jobs",jobs);
        return "jobs/DangTuyen";
    }

}
