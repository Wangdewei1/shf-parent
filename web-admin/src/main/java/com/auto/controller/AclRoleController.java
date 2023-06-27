package com.auto.controller;

import com.auto.entity.Role;
import com.auto.service.AclRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/role")
public class AclRoleController {
    @Autowired
    private AclRoleService aclRoleService;

    public static final String INDEX_VIEW = "role/index";

    public static final String INDEX_PAGE = "index";

    @RequestMapping
    public String findAllRole(Model model){
        List<Role> allRole = aclRoleService.findAllRole();
        model.addAttribute("roleList", allRole);
        return INDEX_VIEW;
    }

    @GetMapping
    public String toIndexPage(){
        return INDEX_PAGE;
    }
}
