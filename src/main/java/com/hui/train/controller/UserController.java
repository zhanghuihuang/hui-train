package com.hui.train.controller;

import com.hui.train.entity.User;
import com.hui.train.service.UserService;
import com.hui.web.CurdBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : zhanghh
 * @businessDesc :
 * @project : hui-train
 * @date : 2019/2/18 15:35
 */
@RestController
@RequestMapping("/user")
public class UserController extends CurdBaseController<User, UserService,Long> {
}
