package com.web.fashion.fashion.models.services.user;

import com.web.fashion.fashion.DTO.UserDTO;
import com.web.fashion.fashion.models.entities.User;
import com.web.fashion.fashion.models.repositories.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

public class UserServiceImp implements UserService{

    @Autowired
    private UserDAO userDAO;

    private User user;

    @Override
    @Transactional
    public void createUser(UserDTO userDTO) {
        user = new User();
        user.setAvatar(userDTO.getAvatar());
        user.setAddress(userDTO.getAddress());
        user.setEmail(userDTO.getEmail());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setDateRegister(LocalDateTime.now());
        user.setLastLogin(LocalDateTime.now());
        user.setStatus(1);
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setDateOfBirth(userDTO.getDateOfBirth());
        user.setGender(user.getGender());
        user.setGender(userDTO.getGender());

//        DTOAndEntity.set(user, userDTO);
        userDAO.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteById(id);
    }

    @Override
    public void updateUser(UserDTO userDTO, int id) {

    }

    @Override
    public List<UserDTO> getAllUser() {
        return null;
    }

    @Override
    public UserDTO getUserById(int id) {
        return null;
    }
}
