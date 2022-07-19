package com.atique.springbootprojectioninjpa.dto;

import com.atique.springbootprojectioninjpa.enums.Department;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author atiQue
 * @since 19'Jul 2022 at 11:12 PM
 */


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentReport {

    private Department department;

    private Integer studentCount;
}
