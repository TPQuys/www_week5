package vn.edu.iuh.fit.backEnds.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.backEnds.models.Company;
import vn.edu.iuh.fit.backEnds.repositoties.CompanyRepository;

import java.util.List;
@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    public List<Company> findAll(){return companyRepository.findAll();}
}
