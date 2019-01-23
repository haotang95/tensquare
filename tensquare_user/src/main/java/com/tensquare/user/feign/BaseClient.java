package com.tensquare.user.feign;

import com.tensquare.common.code.ResultData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName BaseClient
 * @auther tangh
 * @date 2019/1/23 0023 13:37
 */
@FeignClient(value = "tensquare-base", fallback = BaseClientImpl.class)
public interface BaseClient {

    @RequestMapping(value = "/base/get", method = RequestMethod.GET)
    ResultData get();
}
