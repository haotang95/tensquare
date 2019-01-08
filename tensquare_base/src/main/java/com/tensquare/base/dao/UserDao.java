package com.tensquare.base.dao;

import com.tensquare.base.enitiy.TCoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<TCoursesEntity, String>, JpaSpecificationExecutor<TCoursesEntity> {

    @Query(value = "SELECT * FROM t_courses WHERE status = \"1\" ORDER BY create_time DESC", nativeQuery = true)
    public List<TCoursesEntity> findAllCourse();
}
