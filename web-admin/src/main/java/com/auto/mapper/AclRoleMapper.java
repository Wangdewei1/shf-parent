package com.auto.mapper;

import com.auto.entity.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository //欺骗idea不报错
public interface AclRoleMapper {
    List<Role> findAllRole();
}
