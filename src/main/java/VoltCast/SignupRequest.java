package VoltCast;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record SignupRequest(
        @NotBlank(message = "Name cannot be blank")
        String name,
        @Email(message = "Invalid email format")
        @NotBlank(message = "Email cannot be blank")
        String email,

        @NotBlank(message = "Invalid email format")
        @Size(min =12, max = 22, message = "Password must be between 12 and 22 characters")
        String password) {
}
