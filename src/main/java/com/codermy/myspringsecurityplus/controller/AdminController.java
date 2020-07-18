package com.codermy.myspringsecurityplus.controller;

import com.codermy.myspringsecurityplus.dto.MenuIndexDto;
import com.codermy.myspringsecurityplus.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author codermy
 * @createTime 2020/7/16
 */
@Controller
@RequestMapping("/api")
@Api(tags = "系统：菜单管理")
public class AdminController {
    @Autowired
    private MenuService menuService;

    @GetMapping(value = "/index")
    @ResponseBody
    @ApiOperation(value = "通过用户id获取菜单")
    public List<MenuIndexDto> getMenu(Integer userId) {
        return menuService.getMenu(userId);
    }

    @GetMapping("/druid")
    public String druid(){
        return "druid/login";
    }
    @GetMapping("/swagger")
    public String swagger(){
        return "swagger-ui";
    }

    @GetMapping("/console")
    public String console(){
        return "console/console1";
    }

    @GetMapping("/403")
    public String error403(){
        return "error/403";
    }

    @GetMapping("/404")
    public String error404(){
        return "error/404";
    }

    @GetMapping("/500")
    public String error500(){
        return "error/500";
    }
}