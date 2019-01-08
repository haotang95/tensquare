package com.teasquare.base.controller;

import com.tensquare.common.code.ResultData;
import com.tensquare.common.code.StatusCode;
import com.tensquare.common.utils.IdUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther tangh
 * @date 2019/1/7 0007 16:17
 */
@RestController
@RequestMapping("/base")
public class BaseController {

    @GetMapping("/get")
    public ResultData get() {
        String snowFlakeId = IdUtils.getSnowFlakeId();
        return new ResultData(true, StatusCode.ERROR.getCode(), "1", snowFlakeId);
    }
}
