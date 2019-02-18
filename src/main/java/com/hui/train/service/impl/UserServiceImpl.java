package com.hui.train.service.impl;

import com.hui.core.jpa.service.impl.BaseServiceImpl;
import com.hui.train.dao.UserDao;
import com.hui.train.entity.User;
import com.hui.train.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author : zhanghh
 * @businessDesc :
 * @project : hui-train
 * @date : 2019/2/18 15:34
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User, UserDao,Long> implements UserService {
}
