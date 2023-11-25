package vn.edu.iuh.fit.frontEnd.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backEnds.models.Job;
import vn.edu.iuh.fit.backEnds.services.JobService;

import java.util.List;
@Component
public class JobModel {
    @Autowired
    private JobService jobService;
    public List<Job> findAll() {return jobService.getAllJobb();}

    public void addJob(Job job) {jobService.addJob(job);}
}
