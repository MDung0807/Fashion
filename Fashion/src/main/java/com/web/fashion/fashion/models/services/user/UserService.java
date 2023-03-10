package com.web.fashion.fashion.models.services.user;

import com.web.fashion.fashion.DTO.UserDTO;
import com.web.fashion.fashion.models.entities.User;

import java.util.List;

public interface UserService {
    void createUser(UserDTO userDTO);

    void deleteUser(int id);

    void updateUser(UserDTO userDTO, int id);

    List<UserDTO> getAllUser();

    UserDTO getUserById(int id);
}
