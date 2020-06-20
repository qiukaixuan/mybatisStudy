package com.study.mybatis.dao;

import com.study.mybatis.entity.Employ;
import org.springframework.stereotype.Repository;

/**
 * @author kaire
 */
@Repository
public interface EmployDao {
    /**
     * 通过id获取用户信息
     *
     * @param id id
     * @return Employ 用户信息
     */
    Employ getEmployById(int id);
}
