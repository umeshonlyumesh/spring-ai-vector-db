package ai.spring.demo.ai.playground.services;

import ai.spring.demo.ai.playground.data.CompanyEnrollment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.model.ToolContext;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.NestedExceptionUtils;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CompanyEnrollmentTool {

    private final CompanyEnrollmentService companyEnrollmentService;

    @Autowired
    public CompanyEnrollmentTool(CompanyEnrollmentService companyEnrollmentService) {
        this.companyEnrollmentService = companyEnrollmentService;
    }


    @Tool(description = "Get company enrollment details")
    public CompanyEnrollment getCompanyEnrollmentDetail(Long companyId) {
        try {
            return companyEnrollmentService.getCompanyEnrollmentDetails(companyId);
        } catch (Exception e) {
            log.warn("Company enrollment details: {}", NestedExceptionUtils.getMostSpecificCause(e).getMessage());
            return new CompanyEnrollment(companyId, null, null, 0L, 0L, null );
        }
    }

    @Tool(description = "Add or create a New Company Enrollment")
    public void addCompany(String companyName, String clientId, Long accountNumber, Long routingNumber) {
        companyEnrollmentService.addNewCompany(companyName, clientId, accountNumber, routingNumber);
    };

    @Tool(description = "Chnage the status of the company")
    public void changeStatus(Long companyId) {
        companyEnrollmentService.changeCompanyStatus(companyId);
    }

}
