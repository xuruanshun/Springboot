package com.dayee.service;

import com.dayee.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xuruanshun on 2019/9/5.
 */
@Service
public class UserService {

   /* @Autowired
    private UserMapper userMapper;*/

    public User getUserByName(String userName){
//        return userMapper.findByName(userName);
        return null;
    }
}
