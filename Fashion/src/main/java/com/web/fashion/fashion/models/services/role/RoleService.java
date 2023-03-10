package com.web.fashion.fashion.models.services.role;

import com.web.fashion.fashion.DTO.RoleDTO;

import java.util.List;

public interface RoleService {
    void createRole(RoleDTO roleDTO);
    void deleteRole(int id);
    void updateRole(RoleDTO roleDTO, int id);
    RoleDTO getRoleById(int id);
    List<RoleDTO> getAllRole();
    RoleDTO getRoleByRole(String roleName);
}
