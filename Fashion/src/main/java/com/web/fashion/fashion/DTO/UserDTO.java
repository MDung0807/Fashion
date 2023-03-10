package com.web.fashion.fashion.DTO;

import com.web.fashion.fashion.Utils.Utils;
import com.web.fashion.fashion.models.entities.Account;
import jakarta.persistence.Column;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class UserDTO {

    private static UserDTO instance;

    private int userId;

    
    private String firstName;

    
    private String lastName;


    private String email;

    private String phoneNumber;

    private String gender;

    private String address;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    private String avatar;

    private LocalDateTime dateRegister;

    private LocalDateTime lastLogin;

    private int status;

    private Account account;

    public static UserDTO getInstance(){
        if (instance == null)
            return new UserDTO();
        return instance;
    }

    public void setAvatar(MultipartFile avatar){
        this.avatar = Utils.toString(avatar);
    }

}
