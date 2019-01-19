package com.tensquare.base.service;

import com.tensquare.base.enitiy.TCoursesEntity;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserService
 * @auther tangh
 * @date 2019/1/8 0008 11:28
 */
public interface UserService {

    List<TCoursesEntity> findAll();

    List<Map> nativeSQL();

}
