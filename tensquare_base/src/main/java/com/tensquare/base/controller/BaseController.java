package com.tensquare.base.controller;

import com.tensquare.base.enitiy.TCoursesEntity;
import com.tensquare.base.redis.RedisUtil;
import com.tensquare.base.service.UserService;
import com.tensquare.common.code.Constant;
import com.tensquare.common.code.ResultData;
import com.tensquare.common.code.StatusCode;
import com.tensquare.common.utils.IdUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @auther tangh
 * @date 2019/1/7 0007 16:17
 */
@CrossOrigin
@RestController
@RequestMapping("/base")
public class BaseController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public ResultData get() {
        int i = 1 / 0;
        String snowFlakeId = IdUtil.getSnowFlakeId();
        RedisUtil.set(Constant.REDIS_TEST_KEY, snowFlakeId);
        return new ResultData(true, StatusCode.SUCCESS.getCode(), "1", snowFlakeId);
    }


    @GetMapping("/findAll")
    public ResultData findAll(String a,String b){
        List<TCoursesEntity> all = userService.findAll();
        return new ResultData(true, StatusCode.SUCCESS.getCode(), "cg", all);
    }


    @GetMapping("/nativeSQL")
    public ResultData abc(){
        List<Map> objects = userService.nativeSQL();
        return new ResultData(true, StatusCode.SUCCESS.getCode(), "cg", objects);
    }
}
