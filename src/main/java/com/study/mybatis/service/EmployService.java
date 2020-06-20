package com.study.mybatis.service;

import com.study.mybatis.entity.Employ;
import org.springframework.stereotype.Service;

/**
 * @author kaire
 */
public interface EmployService {
    /**
     * 通过id获取用户信息
     *
     * @param i id
     * @return Employ 用户信息
     */
   public Employ getEmployById(int i);
}
