package com.hussain.project1.service;

import com.hussain.project1.model.UserDetailRequest;
import com.hussain.project1.model.UserDetailResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    UserDetailRequest request;

    public void setUserDetailRequest(UserDetailRequest userDetailRequest) {
        this.request = userDetailRequest;
    }

    public UserDetailResponse sucess() {
        UserDetailResponse userDetailResponse = new UserDetailResponse(request.getName());
        //userDetailResponse.setUserDetails(dao.getDetails(request.getName());
        return userDetailResponse;
    }
}
