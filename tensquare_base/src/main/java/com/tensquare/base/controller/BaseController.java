package com.tensquare.base.controller;

import com.tensquare.base.enitiy.TCoursesEntity;
import com.tensquare.base.service.UserService;
import com.tensquare.common.code.ResultData;
import com.tensquare.common.code.StatusCode;
import com.tensquare.common.utils.IdUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther tangh
 * @date 2019/1/7 0007 16:17
 */
@RestController
@RequestMapping("/base")
public class BaseController {

    @Autowired
    private UserService userService;
    

    @GetMapping("/get")
    public ResultData get() {
        String snowFlakeId = IdUtils.getSnowFlakeId();
        return new ResultData(true, StatusCode.ERROR.getCode(), "1", snowFlakeId);
    }


    @GetMapping("/findAll")
    public ResultData findAll(String a,String b){
        List<TCoursesEntity> all = userService.findAll();
        return new ResultData(true, StatusCode.SUCCESS.getCode(), "cg", all);
    }
}
