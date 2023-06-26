package com.auto.mapper;

import com.auto.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


/**
 * 测试 后台角色管理
 */
@ContextConfiguration(locations = "classpath:spring/spring-persist.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AclRoleMapperTest {

    @Autowired
    AclRoleMapper aclRoleMapper;

    //日志
    Logger logger = LoggerFactory.getLogger(AclRoleMapperTest.class);
    /**
     * 查询所有 role
     */
    @Test
    public void findAllRole() {
        List<Role> roleList = aclRoleMapper.findAllRole();
        logger.debug(roleList + "");
    }
}