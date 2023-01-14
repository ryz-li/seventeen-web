package com.seventeen.web.handlers;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @description myBatis-plus 配置类
 * @author ryz
 * @date 2023/1/1417:31
 */
@Slf4j
@Component
public class AutoUpdateHandler implements MetaObjectHandler {

    /**
     * 插入时启动  第三个参数 LocalDateTime 一定要和 createTime成员变量的值的类型一致，不然是null 如果是date就都设置date
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("start insert fill ....");
        this.strictInsertFill(metaObject, "createTime", Long.class, LocalDateTime.now());
        this.strictUpdateFill(metaObject, "updateTime", Long.class, LocalDateTime.now());
    }

    /**
     * 更新时候启动
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("start update fill ....");
        this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now());
    }
}