package com.yanke.modules.sys.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.yanke.modules.sys.entity.User;
import com.yanke.modules.sys.service.UserService;
import com.yanke.modules.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Y神带你飞
 * @since 2018-07-25
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

        @RequestMapping("/test")
        public R loginUser(){
            User user = new User();
            user.setUserId(1);
            return R.ok();
        }
}

