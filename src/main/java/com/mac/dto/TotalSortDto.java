package com.mac.dto;

import lombok.Data;

/**
 * @Author: sqs
 * @Date: 2019/12/21 20:49
 * @Description:
 * @Version: 1.0
 */
@Data
public class TotalSortDto {
    private Integer id;

    private String sortName;

    private Integer upLevel;

    private Integer grade;

    private String upLevelName;
}
