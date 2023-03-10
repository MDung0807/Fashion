package com.web.fashion.fashion.DTO;

import com.web.fashion.fashion.models.entities.User;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDTO {

    private User user;
    private String username;
    private String password;


}
