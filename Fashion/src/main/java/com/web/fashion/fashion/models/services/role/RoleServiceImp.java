package com.web.fashion.fashion.models.services.role;

import com.web.fashion.fashion.DTO.RoleDTO;
import com.web.fashion.fashion.models.entities.Role;
import com.web.fashion.fashion.models.repositories.RoleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImp implements RoleService{
    @Autowired
    private RoleDAO roleDAO;

    @Override
    @Transactional
    public void createRole(RoleDTO roleDTO) {
        Role role = Role.builder()
                .role(roleDTO.getRole())
                .description(roleDTO.getDescription()).build();
        roleDAO.save(role);
    }

    @Override
    @Transactional
    public void deleteRole(int id) {
        roleDAO.deleteById(id);
    }

    @Override
    @Transactional
    public void updateRole(RoleDTO roleDTO, int id) {
        Role role = Role.builder()
                .roleId(roleDTO.getRoleId())
                .role(roleDTO.getRole())
                .description(roleDTO.getDescription()).build();

        roleDAO.save(role);
    }

    @Override
    @Transactional
    public RoleDTO getRoleById(int id) {
        Optional<Role> role = roleDAO.findById(id);
        if (role.isPresent()){
            RoleDTO roleDTO = RoleDTO.builder()
                    .role(role.get().getRole())
                    .roleId(role.get().getRoleId())
                    .description(role.get().getDescription()).build();
            return roleDTO;
        }
        return null;
    }

    @Override
    @Transactional
    public List<RoleDTO> getAllRole() {
        Pageable pageable = Pageable.ofSize(10);
        var sort = new Sort(Sort.Direction.ASC, "role");
        pageable = Pageable
        roleDAO.find;
        return null;
    }

    @Override
    @Transactional
    public RoleDTO getRoleByRole(String roleName) {
        return null;
    }
}
