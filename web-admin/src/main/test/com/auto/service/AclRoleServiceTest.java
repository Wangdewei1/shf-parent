package com.auto.service;

import com.auto.entity.Role;
import com.auto.mapper.AclRoleMapper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * 用户管理业务
 */
@ContextConfiguration(locations = "classpath:spring/spring-service.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class AclRoleServiceTest {
    @Autowired
    AclRoleService aclRoleService;

    @Autowired
    AclRoleMapper aclRoleMapper;
    Logger logger = LoggerFactory.getLogger(AclRoleServiceTest.class);
    /**
     * 查询所用用户
     */
    @Test
    public void findAllRole() {
        List<Role> roleList = aclRoleService.findAll();
        logger.debug(roleList + "");
    }

    @Test
    public void insert(){
        Role role = new Role();
        role.setRoleName("王梓伟");
        role.setRoleCode("wang");
        role.setDescription("房管");
        aclRoleService.insert(role);
    }

    @Test
    public void update(){
        Role role = aclRoleService.getById(1l);
        logger.debug(role + "");
    }

    @Test
    public void findPage(){

        Map<String,String> map = new HashMap<>();
        map.put("pageNum", "1");
        map.put("pageSize", "10");
        map.put("roleName", "王");
        List<Role> list = aclRoleMapper.findPage(map);
        System.out.println("list = " + list);
        PageInfo<Role> page = aclRoleService.findPage(map);
//        logger.debug(page + "");
        System.out.println("page = " + page);
    }
}