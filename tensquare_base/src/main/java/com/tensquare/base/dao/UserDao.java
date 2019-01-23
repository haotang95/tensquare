package com.tensquare.base.dao;

import com.tensquare.base.enitiy.TCoursesEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserDao extends JpaRepository<TCoursesEntity, String>, JpaSpecificationExecutor<TCoursesEntity> {

    @Query(value = "SELECT * FROM t_courses WHERE status = '1' ORDER BY create_time DESC", nativeQuery = true)
    List<TCoursesEntity> findAllCourse(Pageable pageable);

    @Query(value = "SELECT a.title AS courseTitle,a.is_delete AS isDelete,a.state AS state,b.title AS cpTitle,b.introduce AS cpIntroduce " +
            "FROM t_courses a LEFT JOIN t_courses_part b ON a.id = b.courses_id WHERE a.id = :id ORDER BY ?#{#pageable}", nativeQuery = true)
    List<Map> getCourse(@Param("id") String id);
}
