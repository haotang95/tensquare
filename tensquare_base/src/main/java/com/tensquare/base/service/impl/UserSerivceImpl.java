package com.tensquare.base.service.impl;

import com.tensquare.base.dao.UserDao;
import com.tensquare.base.enitiy.TCoursesEntity;
import com.tensquare.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName UserSerivceImpl
 * @auther tangh
 * @date 2019/1/8 0008 11:30
 */
@Service("UserService")
public class UserSerivceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<TCoursesEntity> findAll() {
        List<TCoursesEntity> all = userDao.findAll();
        return all;
    }
}
