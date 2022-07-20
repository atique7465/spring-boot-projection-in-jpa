package com.atique.springbootprojectioninjpa.repository;

import com.atique.springbootprojectioninjpa.entity.EnrollmentReportProjector;
import com.atique.springbootprojectioninjpa.entity.StudentEntity;
import com.atique.springbootprojectioninjpa.entity.DepartmentReportProjector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * @author atiQue
 * @since 09'Jul 2022 at 5:45 PM
 */

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    //Derived Query Methods, ref: https://www.baeldung.com/spring-data-derived-queries

    Optional<StudentEntity> findByStudentId(String StudentEntity);

    void deleteByStudentId(String StudentEntity);



    //Projection
    //ref1: https://www.baeldung.com/jpa-queries-custom-result-with-aggregation-functions
    //ref2: https://www.youtube.com/watch?v=2SV7QODVHAE&ab_channel=ThorbenJanssen

    //Interface Base Projection with native query
    @Query(value = "select department as departmentName, count(*) as studentCount FROM student_v2 where gender = :gender group by department", nativeQuery = true)
    List<DepartmentReportProjector> findDepartmentReportProjectors(@Param("gender") String gender);

    //Interface Base Projection with native query and aggregate functions
    @Query(value = "select DATE_FORMAT(created, '%Y-%m-%d') as enrollDate, gender as studentGender, count(*) as studentCount " +
            "FROM student_v2 where DATE_FORMAT(created, '%Y-%m-%d') >= :fromDate group by DATE_FORMAT(created, '%Y-%m-%d'), gender ", nativeQuery = true)
    List<EnrollmentReportProjector> findEnrollmentReportProjectors(@Param("fromDate") String fromDate); // '2022-07-18'
}
