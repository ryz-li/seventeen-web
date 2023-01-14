package com.seventeen.web.comm.models;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

/*
  @description 基本实体类
  @author ryz
  @date  2023/1/1417:23
*/

@Data
public class BaseBean {
    @TableField(fill = FieldFill.INSERT, value = "cjyh")
    private String cjyh;
    @TableField(fill = FieldFill.INSERT, value = "cjsj")
    private Long cjsj;
    @TableField(fill = FieldFill.INSERT_UPDATE, value = "gxyh")
    private String gxyh;
    @TableField(fill = FieldFill.INSERT_UPDATE, value = "gxsj")
    private Long gxsj;
    @TableLogic(value = "1", delval = "0")
    private Integer yxbz;
    /**
     * 乐观锁注解
     */
    @Version
    private Integer version;
}
