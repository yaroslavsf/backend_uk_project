package ch.noseryoung.realestate.domain.users.dto;


import ch.noseryoung.realestate.core.validation.user.email.Email;
import ch.noseryoung.realestate.domain.role.Role;
import ch.noseryoung.realestate.domain.role.dto.RoleDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserDTO {
    private String name;
    private String surname;
    @Email
    private String email;
    @Getter
    @Setter
    @Schema(name = "UserDTO.WithUUID")
    public static class WithUUID extends UserDTO {
        protected UUID id;
    }
    @Getter
    @Setter
    @Schema(name = "UserDTO.Register")
    public static class Register extends UserDTO {
        private String password;
    }

    @Getter
    @Setter
    @Schema(name = "UserDTO.RetrieveLightlyDressed")
    public static class RetrieveLightlyDressed extends UserDTO {
        protected UUID id;
        protected RoleDTO role;
    }


}
