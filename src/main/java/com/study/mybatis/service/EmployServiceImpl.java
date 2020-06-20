package com.study.mybatis.service;

import com.study.mybatis.dao.EmployDao;
import com.study.mybatis.entity.Employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kaire
 */
@Service
public class EmployServiceImpl implements EmployService {
    @Autowired
    private EmployDao employDao;

    /**
     * 通过id获取用户信息
     *
     * @param i id
     * @return Employ 用户信息
     */
    @Override
    public Employ getEmployById(int i) {
        return employDao.getEmployById(i);
    }
}
