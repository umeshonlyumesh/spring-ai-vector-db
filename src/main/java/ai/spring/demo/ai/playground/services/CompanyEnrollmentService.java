package ai.spring.demo.ai.playground.services;


import ai.spring.demo.ai.playground.data.CompanyEnrollment;
import ai.spring.demo.ai.playground.data.CompanyEnrollmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CompanyEnrollmentService {
    private final CompanyEnrollmentRepository companyEnrollmentRepository ;

    public CompanyEnrollmentService(CompanyEnrollmentRepository companyEnrollmentRepository) {
        this.companyEnrollmentRepository = companyEnrollmentRepository;
    }

    public List<CompanyEnrollment> getAllCompanies() {
        return companyEnrollmentRepository.findAll();
    }

    public void addNewCompany(String companyName, String clientId, Long accountNumber, Long routingNumber) {
     CompanyEnrollment companyEnrollment = new CompanyEnrollment();
     companyEnrollment.setCompanyName(companyName);
     companyEnrollment.setClientId(clientId);
     companyEnrollment.setAccountNumber(accountNumber);
     companyEnrollment.setRoutingNumber(routingNumber);
     companyEnrollment.setStatus("Active");
     companyEnrollmentRepository.save(companyEnrollment);
    }

    public void changeCompanyStatus(Long companyId) {
        Optional<CompanyEnrollment> ceOption =  companyEnrollmentRepository.findById(companyId);
        if (ceOption.isPresent()) {
            CompanyEnrollment ce = ceOption.get();
            if(ce.getStatus().equalsIgnoreCase("Active")) {
                ce.setStatus("Inactive");
            }else {
                ce.setStatus("Active");
            }
            companyEnrollmentRepository.save(ce);
        }else{
            throw new RuntimeException("Company not found");
        }

    }

    public CompanyEnrollment getCompanyEnrollmentDetails(Long companyId) {
        Optional<CompanyEnrollment> ceOption =  companyEnrollmentRepository.findById(companyId);
        if (ceOption.isPresent()) {
            return ceOption.get();
        }
        throw new RuntimeException("Company not found");
    }
}
