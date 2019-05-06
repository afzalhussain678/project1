package com.hussain.project1.model;

import lombok.Data;

@Data
public class UserDetailResponse {
    String name;

    public UserDetailResponse(String name) {
        this.name = name;
    }
}
