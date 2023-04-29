package com.bird.App;

import com.bird.config.SpringConfig;
import com.bird.dao.BookDao;
import com.bird.dao.UserDao;
import com.bird.factory.UserDaoFactory;
import com.bird.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title:App
 * @Author GKY
 * @Date:2023/4/2717:57
 */
public class App {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
//        BookService bookService = (BookService) ctx.getBean("bookService");
//        bookService.save();
//        UserDaoFactory userDaoFactory = new UserDaoFactory();
//        UserDao userDao = userDaoFactory.getUserDao();
//        userDao.save();
//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserDao userDao = (UserDao) ctx.getBean("userDao");
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        userDao.save();
//        bookDao.save();

//        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext
//                ("applicationContext.xml");
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

    }
}
