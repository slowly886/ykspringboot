package com.yanke.modules.sys.controller;


import com.yanke.modules.sys.entity.User;
import com.yanke.modules.sys.service.UserService;
import com.yanke.modules.utils.R;
import common.utils.SnowflakeIdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Y神带你飞
 * @since 2018-07-26
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public R addUser() {
        SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();

        User user = new User();
        user.setCreatDate(new Date());
        user.setUserName("yanke");
        user.setUserId(snowflakeIdWorker.nextId());

        boolean b = userService.insertAllColumn(user);
        return R.ok();
    }
}

