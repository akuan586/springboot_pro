package com.example.sprintboot.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("table")
public class NocvData {
//    private Integer id;
    private String name;
    private Integer value;
}
