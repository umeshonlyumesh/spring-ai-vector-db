package ai.spring.demo.ai.playground.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "company_enrollment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyEnrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String clientId;
    private Long accountNumber;
    private Long routingNumber;
    private String status;
}
