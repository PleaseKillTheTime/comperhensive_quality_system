package com.as.service;

import com.as.dao.ManagerMapper;
import com.as.dataobject.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements  ManagerService {
    @Autowired
    ManagerMapper managerMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return managerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Manager record) {
        return managerMapper.insert(record);
    }

    @Override
    public int insertSelective(Manager record) {
        return managerMapper.insert(record);
    }

    @Override
    public Manager selectByPrimaryKey(Integer id) {
        return managerMapper.selectByPrimaryKey(id);
    }

    @Override
    public Manager selectByMid(String Mid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Manager record) {
        return managerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Manager record) {
        return managerMapper.updateByPrimaryKey(record);
    }
}
