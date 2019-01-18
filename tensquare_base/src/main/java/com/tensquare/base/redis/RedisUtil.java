package com.tensquare.base.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @ClassName RedisUtil
 * @auther tangh
 * @date 2019/1/18 0018 11:06
 */
@Component
public class RedisUtil {

    @Autowired
    private RedisCache redisCache;

    private static RedisUtil redisUtil;

    @PostConstruct
    private void init() {
        redisUtil = this;
        redisUtil.redisCache = this.redisCache;
    }

    public static RedisCache getRedisCache(){
        return redisUtil.redisCache;
    }

    public static void set(String key, String value){
        getRedisCache().set(key, value);
    }

    public static String get(String key){
        return getRedisCache().get(key);
    }

}
