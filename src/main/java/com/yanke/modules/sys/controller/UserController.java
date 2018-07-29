package com.yanke.modules.sys.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.common.utils.DateUtils;
import com.common.utils.SnowflakeIdWorker;
import com.yanke.modules.sys.entity.User;
import com.yanke.modules.sys.service.UserService;
import com.yanke.modules.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Y神带你飞
 * @since 2018-07-26
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin("*")
    @RequestMapping("/addUser")
    @ResponseBody
    public R addUser(String username) {
        SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker();

        User user = new User();
        user.setCreatDate(new Date());
        user.setUserName(username);
        user.setUserId(snowflakeIdWorker.nextId());

        boolean b = userService.insertAllColumn(user);
        return R.ok();
    }

    @RequestMapping("/findUserList")
    @ResponseBody
    public List<User> findUserList(HttpServletRequest request){
        List<User> users = userService.selectList(new EntityWrapper<User>());
        return users;
    }

    @RequestMapping("/admin")
    public String login(String username,String password){
            return "admin";
    }

    @RequestMapping("/loginUser")
    public String loginUser(String username,String password){
        if(username.equals("admin")&&password.equals("admin")){
            return "userManager";
        }else{
            return "redirect:/user/admin";
        }
    }

    @RequestMapping("/selectByDate")
    public String  findUserByDate(@RequestParam(value = "date",required = false,defaultValue = "2018-08-01") String date, Model model){
//        String addByDay = DateUtils.addByDay(date, 1);
        Date date1 = DateUtils.parseDate("2018-08-07");
        Date date2 = DateUtils.parseDate("2018-08-08");
        List<User> users = userService.selectList(new EntityWrapper<User>().between("creat_date",date1,date2));
        model.addAttribute("users",users);
        return "userManager";
    }
}

