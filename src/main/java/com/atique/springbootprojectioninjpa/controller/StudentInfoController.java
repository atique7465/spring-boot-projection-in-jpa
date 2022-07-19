package com.atique.springbootprojectioninjpa.controller;


import com.atique.springbootprojectioninjpa.dto.DepartmentReport;
import com.atique.springbootprojectioninjpa.dto.EnrollmentReport;
import com.atique.springbootprojectioninjpa.dto.Student;
import com.atique.springbootprojectioninjpa.enums.Gender;
import com.atique.springbootprojectioninjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author atiQue
 * @since 09'Jul 2022 at 2:25 PM
 */

@RestController
@RequestMapping(value = "/api/v1/student")
public class StudentInfoController {

    @Autowired
    private StudentService studentService;


    @PostMapping
    public Student saveStudent(@RequestBody @Validated Student request) {
        return studentService.save(request);
    }

    @GetMapping(value = "/department-report/{gender}")
    public List<DepartmentReport> getDepartmentReport(@PathVariable Gender gender) {
        return studentService.getDepartmentReportByGender(gender);
    }

    @GetMapping(value = "/enrollment-report/{fromDate}")
    public List<EnrollmentReport> getEnrollmentReport(@PathVariable String fromDate) {
        return studentService.getEnrollmentReport(fromDate);
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getList();
    }

    @GetMapping(value = "/{studentId}")
    public Student getStudent(@PathVariable String studentId) {
        return studentService.get(studentId);
    }

    @PutMapping(value = "/{studentId}")
    public Student updateStudent(@PathVariable String studentId, @RequestBody @Validated Student request) {
        return studentService.update(studentId, request);
    }

    @DeleteMapping(value = "/{studentId}")
    public void deleteStudent(@PathVariable String studentId) {
        studentService.delete(studentId);
    }
}
