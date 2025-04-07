package ai.spring.demo.ai.playground.client;

import ai.spring.demo.ai.playground.data.CompanyEnrollment;
import ai.spring.demo.ai.playground.services.CompanyEnrollmentService;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import com.vaadin.hilla.BrowserCallable;

import java.util.List;

@BrowserCallable
@AnonymousAllowed
public class CompanyEnrollmentController {

    private final CompanyEnrollmentService companyEnrollmentService;


    public CompanyEnrollmentController(CompanyEnrollmentService companyEnrollmentService) {
        this.companyEnrollmentService = companyEnrollmentService;
    }

    public List<CompanyEnrollment> getAllCompanies() {

        return companyEnrollmentService.getAllCompanies();
    }

}
