package com.atique.springbootprojectioninjpa.dao;


import com.atique.springbootprojectioninjpa.entity.DepartmentReportProjector;
import com.atique.springbootprojectioninjpa.entity.EnrollmentReportProjector;
import com.atique.springbootprojectioninjpa.entity.StudentEntity;
import com.atique.springbootprojectioninjpa.enums.Gender;

import java.util.List;
import java.util.Optional;

/**
 * @author atiQue
 * @since 09'Jul 2022 at 5:47 PM
 */

public interface StudentDao {

    /**
     * @param entity for the student
     * @return saved student entity
     */
    StudentEntity save(StudentEntity entity);

    /**
     * @param studentId of the entity
     * @return student entity
     */
    Optional<StudentEntity> getByStudentId(String studentId);

    /**
     * @return list of all student entities
     */
    List<StudentEntity> getList();

    /**
     * @param studentId of the entity to be deleted
     */
    void deleteByStudentId(String studentId);

    /**
     * @param gender of the students
     * @return studentCount/department by gender using projection in JpaRepository
     */
    List<DepartmentReportProjector> getDepartmentProjectors(Gender gender);


    /**
     * @param fromDate the report will be generated
     * @return studentCount/enroll date for every gender using projection in JpaRepository
     */
    List<EnrollmentReportProjector> getEnrollmentReportProjectors(String fromDate);
}