package com.atique.springbootprojectioninjpa.entity;

import com.atique.springbootprojectioninjpa.enums.Gender;

/**
 * @author atiQue
 * @since 19'Jul 2022 at 11:02 PM
 */

public interface EnrollmentReportProjector {

    String getEnrollDate();

    Gender getStudentGender();

    Integer getStudentCount();
}
