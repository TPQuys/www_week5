package vn.edu.iuh.fit.frontEnd.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.backEnds.models.Company;
import vn.edu.iuh.fit.backEnds.services.CompanyService;

import java.util.List;

@Component
public class CompanyModel {
    @Autowired
    private CompanyService companyService;

    public List<Company> findAll() {
        return companyService.findAll();
    }
}
