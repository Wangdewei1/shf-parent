package com.auto.controller;

import com.auto.entity.Role;
import com.auto.service.AclRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/role")
public class AclRoleController {
    @Autowired
    private AclRoleService aclRoleService;
    //视图前缀
    public static final String PREFIX = "/WEB-INF/templates/";
    //试图后缀
    public static final String SUFFIX = ".html";

    @RequestMapping
    public ModelAndView findAllRole(ModelAndView modelAndView , HttpServletRequest request){
        List<Role> roleList = aclRoleService.findAllRole();
        request.setAttribute("roleList",roleList);
        modelAndView.setViewName("role/index");
        return  modelAndView;
    }


    @RequestMapping("/getRole")
    public String getRole(Model model){
        List<Role> allRole = aclRoleService.findAllRole();
        model.addAttribute("roleList", allRole);
        return "role/index";
    }
}
