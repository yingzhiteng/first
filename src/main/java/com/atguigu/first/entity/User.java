package com.atguigu.first.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
    @TableId(type= IdType.ID_WORKER)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private String ceshi;
}
