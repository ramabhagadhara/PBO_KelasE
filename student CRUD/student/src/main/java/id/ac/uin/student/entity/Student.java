package id.ac.uin.student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.message.Message;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "First name is required")
    @Column(nullable = false,name = "firstName")
    private String firstName;

    @NotEmpty(message = "Last name is required")
    @Column(nullable = false,name = "lastName")
    private String lastName;

    @NotEmpty(message = "Email is required")
    @Column(nullable = false,name = "email",unique = true)
    private String email;

    @NotEmpty(message = " Phone Number is required")
    @Column(nullable = false,name = "phone",unique = true)
    private String phone;

}
