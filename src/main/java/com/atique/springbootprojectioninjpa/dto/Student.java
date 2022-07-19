package com.atique.springbootprojectioninjpa.dto;



import com.atique.springbootprojectioninjpa.enums.Department;
import com.atique.springbootprojectioninjpa.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


/**
 * @author atiQue
 * @since 09'Jul 2022 at 2:25 PM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Student {

    @NotNull(message = "StudentID can't ne null.")
    @NotEmpty(message = "StudentID can't be empty.")
    private String studentId;

    @NotNull(message = "Student name can't be null.")
    @NotEmpty(message = "Student name can't be empty.")
    private String name;

    @NotNull
    private Gender gender;

    @NotNull
    private Department department;
}
