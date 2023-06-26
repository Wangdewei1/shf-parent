package com.auto.service;

import com.auto.entity.Role;

import java.util.List;

/**
 * 后台用户管理 业务
 */
public interface AclRoleService {
    List<Role> findAllRole();
}
