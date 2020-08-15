package com.miracle.springbootvue.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.miracle.springbootvue.common.Result;
import com.miracle.springbootvue.entity.User;
import com.miracle.springbootvue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author miracle
 * @since 2020-08-15
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Object queryUser(@PathVariable("id") int id) {
        return userService.getById(id);
    }

    @GetMapping("/list")
    public Result users(Integer currentPage) {
        if(currentPage == null || currentPage < 1) {
            currentPage = 1;
        }
        Page page = new Page(currentPage, 5);
        IPage pageData = userService.page(page, new QueryWrapper<User>().orderByDesc("update_time"));
        return Result.success(pageData);
    }
}
