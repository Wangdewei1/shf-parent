package com.auto.service;

import com.auto.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 用户管理业务
 */
@ContextConfiguration(locations = "classpath:spring/spring-service.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AclRoleServiceTest {
    @Autowired
    AclRoleService aclRoleService;

    Logger logger = LoggerFactory.getLogger(AclRoleServiceTest.class);
    /**
     * 查询所用用户
     */
    @Test
    public void findAllRole() {
        List<Role> roleList = aclRoleService.findAllRole();
        logger.debug(roleList + "");
    }
}