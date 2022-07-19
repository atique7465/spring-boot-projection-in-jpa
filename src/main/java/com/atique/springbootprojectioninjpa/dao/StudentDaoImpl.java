package com.atique.springbootprojectioninjpa.dao;


import com.atique.springbootprojectioninjpa.entity.DepartmentReportProjector;
import com.atique.springbootprojectioninjpa.entity.EnrollmentReportProjector;
import com.atique.springbootprojectioninjpa.entity.StudentEntity;
import com.atique.springbootprojectioninjpa.enums.Gender;
import com.atique.springbootprojectioninjpa.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author atiQue
 * @since 09'Jul 2022 at 5:48 PM
 */

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentEntity save(StudentEntity entity) {
        return studentRepository.save(entity);
    }

    @Override
    public Optional<StudentEntity> getByStudentId(String studentId) {
        return studentRepository.findByStudentId(studentId);
    }

    @Override
    public List<StudentEntity> getList() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteByStudentId(String studentId) {
        studentRepository.deleteByStudentId(studentId);
    }

    @Override
    public List<DepartmentReportProjector> getDepartmentProjectors(Gender gender) {
        return studentRepository.findDepartmentReportProjectors(gender.name());
    }

    @Override
    public List<EnrollmentReportProjector> getEnrollmentReportProjectors(String fromDate) {
        return studentRepository.findEnrollmentReportProjectors(fromDate);
    }
}
