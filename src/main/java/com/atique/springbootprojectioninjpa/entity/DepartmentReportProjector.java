package com.atique.springbootprojectioninjpa.entity;

import com.atique.springbootprojectioninjpa.enums.Department;

/**
 * @author atiQue
 * @since 19'Jul 2022 at 11:02 PM
 */

public interface DepartmentReportProjector {

    Department getDepartmentName();

    Integer getStudentCount();
}
