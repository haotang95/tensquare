package com.tensquare.user.feign;

import com.tensquare.common.code.ResultData;
import com.tensquare.common.code.StatusCode;
import org.springframework.stereotype.Component;

/**
 * @ClassName BaseClientImpl
 * @auther tangh
 * @date 2019/1/23 0023 21:47
 */
@Component
public class BaseClientImpl implements BaseClient {

    @Override
    public ResultData get() {
        return new ResultData(false, StatusCode.ERROR.getCode(), StatusCode.ERROR.getMsg(), "熔断器");
    }
}
