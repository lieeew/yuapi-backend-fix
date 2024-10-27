package com.yupi.project.provider;


import com.yupi.project.service.UserService;
import com.yupi.yuapicommon.entity.User;
import com.yupi.yuapicommon.service.InnerUserService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;

@DubboService
public class InnerUserServiceImpl implements InnerUserService {

    @Resource
    private UserService userService;

    @Override
    public User getUserById(Long userId) {
        return userService.getById(userId);
    }
}
