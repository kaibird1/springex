package com.bird.factory;

import com.bird.dao.UserDao;
import com.bird.dao.UserDaoInple;

/**
 * @title:UserDaoFactory
 * @Author GKY
 * @Date:2023/4/2818:34
 */
//创建工厂类，返回UserDao对象
public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoInple();
    }
}
