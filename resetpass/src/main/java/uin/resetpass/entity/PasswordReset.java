package uin.resetpass.entity;

import lombok.Data;
import uin.resetpass.validator.PasswordConfirmation;

import javax.validation.constraints.NotEmpty;

@Data
@PasswordConfirmation(
        password = "password",
        confirmPassword = "confirmPassword",
        message = "PASSWORDS_NOT_EQUAL"
)
public class PasswordReset {
    @NotEmpty
    private String password;
    @NotEmpty
    private String confirmPassword;
    @NotEmpty
    private String token;
}
