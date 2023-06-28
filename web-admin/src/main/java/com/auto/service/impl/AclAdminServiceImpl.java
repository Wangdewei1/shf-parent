package com.auto.service.impl;

import com.auto.base.BaseMapper;
import com.auto.base.BaseServiceImpl;
import com.auto.entity.Admin;
import com.auto.mapper.AclAdminMapper;
import com.auto.service.AclAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AclAdminServiceImpl extends BaseServiceImpl<Admin> implements AclAdminService {
    @Autowired
    private AclAdminMapper aclAdminMapper;
    @Override
    public BaseMapper<Admin> getBaseMapper() {
        return aclAdminMapper;
    }
}
