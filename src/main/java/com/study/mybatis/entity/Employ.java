package com.study.mybatis.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author kaire
 */
@Data
@Table(name = "tbl_employ")
public class Employ implements Serializable {
    @Id
    private Integer id;
    /**
     * 姓氏
     */
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
