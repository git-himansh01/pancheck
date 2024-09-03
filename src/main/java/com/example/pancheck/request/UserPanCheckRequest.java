package com.example.pancheck.request;

import com.example.pancheck.entity.User;
import lombok.Data;

@Data
public class UserPanCheckRequest {

    private String firstName;
    private String lastName;
    private String pan;

//    public UserPanCheckRequest dtoMapper(User user){
//        UserPanCheckRequest dto = new UserPanCheckRequest();
//        dto.setFirstName(user.getFirstName());
//        dto.setLastName(user.getLastName());
//        dto.setPan(user.getPan());
//        return dto;
//    }
}

