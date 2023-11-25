package vn.edu.iuh.fit.backEnds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backEnds.models.Job;
import vn.edu.iuh.fit.backEnds.repositoties.JobRepository;

import java.util.List;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;
    public List<Job> getAllJobb(){return jobRepository.findAll();}

    public void addJob(Job job){jobRepository.save(job);}
}
