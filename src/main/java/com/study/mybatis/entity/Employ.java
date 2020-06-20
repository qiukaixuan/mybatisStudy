package com.study.mybatis.entity;

import jdk.nashorn.internal.objects.annotations.Property;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @author kaire
 */
@Data
@EntityScan("tbl_employ")
public class Employ implements Serializable {
    @Id
    private Integer id;
    /**
     * 姓氏
     */
    @Property(name = "last_name")
    private String lastName;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 性别
     */
    private Integer gender;

}
