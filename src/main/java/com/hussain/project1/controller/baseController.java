package com.hussain.project1.controller;

import com.hussain.project1.model.BaseResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class baseController {

    @RequestMapping("/returnData")
    public BaseResponse returnData(){
        BaseResponse baseResponse= new BaseResponse();
        baseResponse.setEmail("fromOtherService.gmail.com");
        baseResponse.setMessage("Successfully retrieved data from project1");
        return  baseResponse;
    }
}
