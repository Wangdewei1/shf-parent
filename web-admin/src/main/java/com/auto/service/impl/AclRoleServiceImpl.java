package com.auto.service.impl;

import com.auto.entity.Role;
import com.auto.mapper.AclRoleMapper;
import com.auto.service.AclRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户管理 业务层
 */
@Service
public class AclRoleServiceImpl implements AclRoleService {
    @Autowired
    private AclRoleMapper aclRoleMapper;
    /**
     * 查找所有用户
     * @return
     */
    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    @Override
    public List<Role> findAllRole() {
        return aclRoleMapper.findAllRole();
    }
}
