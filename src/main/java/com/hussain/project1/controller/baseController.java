package com.hussain.project1.controller;

import com.hussain.project1.model.BaseResponse;
import com.hussain.project1.model.UserDetailRequest;
import com.hussain.project1.model.UserDetailResponse;
import com.hussain.project1.service.UserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@Api(value="/home",description="Customer Profile",produces ="application/json")
public class baseController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/returnData", method=RequestMethod.GET)
    @ResponseBody
    public BaseResponse returnData(){
        BaseResponse baseResponse= new BaseResponse();
        baseResponse.setEmail("fromOtherService.gmail.com");
        baseResponse.setMessage("Successfully retrieved data from project1");
        return  baseResponse;
    }

    @RequestMapping(value="/getMyDetails", method = RequestMethod.POST)
    UserDetailResponse userDetails(@RequestBody UserDetailRequest request){
        userService.setUserDetailRequest(request);
        log.info("Received request: {}", request);
        UserDetailResponse userDetailResponse= userService.sucess();
        log.info("Response: {}",userDetailResponse);
        return userDetailResponse;
    }
}
