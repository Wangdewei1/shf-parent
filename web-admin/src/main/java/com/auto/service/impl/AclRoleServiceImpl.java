package com.auto.service.impl;

import com.auto.base.BaseMapper;
import com.auto.base.BaseServiceImpl;
import com.auto.entity.Role;
import com.auto.mapper.AclRoleMapper;
import com.auto.service.AclRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 用户管理 业务层
 */
@Service
public class AclRoleServiceImpl extends BaseServiceImpl<Role> implements AclRoleService {
    @Autowired
    private AclRoleMapper aclRoleMapper;

    @Override
    public BaseMapper<Role> getBaseMapper() {
        return aclRoleMapper;
    }
}
