package com.yanke.modules.sys.service.impl;

import com.yanke.modules.sys.entity.User;
import com.yanke.modules.sys.dao.UserMapper;
import com.yanke.modules.sys.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Y神带你飞
 * @since 2018-07-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
