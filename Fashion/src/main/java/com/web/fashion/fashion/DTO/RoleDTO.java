package com.web.fashion.fashion.DTO;

import com.web.fashion.fashion.models.entities.User;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class RoleDTO {
    private int roleId;
    private String role;
    private String description;
    private List<User> users;
}
