package com.tensquare.base.service.impl;

import com.tensquare.base.dao.UserDao;
import com.tensquare.base.enitiy.TCoursesEntity;
import com.tensquare.base.enitiy.dto.CourseDTO;
import com.tensquare.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @ClassName UserSerivceImpl
 * @auther tangh
 * @date 2019/1/8 0008 11:30
 */
@Service("userService")
@Transactional
public class UserSerivceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<TCoursesEntity> findAll() {
        List<TCoursesEntity> all = userDao.findAll();
        return all;
    }

    @Override
    public List<Map> nativeSQL() {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setId("481528434787483648");
        List<Map> courseA = userDao.getCourse(courseDTO.getId());
        return courseA;
    }

}
