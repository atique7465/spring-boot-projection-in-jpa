package com.atique.springbootprojectioninjpa.dto;

import com.atique.springbootprojectioninjpa.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author atiQue
 * @since 19'Jul 2022 at 11:35 PM
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentReport {

    private String enrollDate;

    private Gender gender;

    private Integer count;
}
