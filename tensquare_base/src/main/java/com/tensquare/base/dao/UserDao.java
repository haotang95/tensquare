package com.tensquare.base.dao;

import com.tensquare.base.enitiy.TCoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface UserDao extends JpaRepository<TCoursesEntity, String>, JpaSpecificationExecutor<TCoursesEntity> {

    @Query(value = "SELECT * FROM t_courses WHERE status = '1' ORDER BY create_time DESC", nativeQuery = true)
    List<TCoursesEntity> findAllCourse(Pageable pageable);
}
