package com.bird.factory;

import com.bird.dao.UserDao;
import com.bird.dao.UserDaoInple;
import org.springframework.beans.factory.FactoryBean;

/**
 * @title:UserDaoFactoryBean
 * @Author GKY
 * @Date:2023/4/2818:54
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoInple();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
