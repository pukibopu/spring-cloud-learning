package com.test.service.client;

import com.test.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserFailedCallBackClient implements UserClient{
    @Override
    public User findUserById(int uid) {
        return new User().setName("替代方案");
    }
}
