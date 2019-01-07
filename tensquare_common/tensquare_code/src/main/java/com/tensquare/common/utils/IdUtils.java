package com.tensquare.common.utils;

import com.tensquare.common.code.IdWorker;
import org.springframework.context.annotation.Bean;

/**
 * @auther tangh
 * @date 2019/1/7 0007 15:35
 */
public class IdUtils {

    @Bean
    public static String getSnowFlakeId(){
        return String.valueOf(IdWorker.getInstance().nextId());
    }
}
