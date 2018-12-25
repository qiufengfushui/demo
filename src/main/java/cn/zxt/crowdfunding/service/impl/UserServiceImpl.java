package cn.zxt.crowdfunding.service.impl;

import cn.zxt.crowdfunding.dao.UserDao;
import cn.zxt.crowdfunding.pojo.User;
import cn.zxt.crowdfunding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User querySingleUser(User user) {
        return userDao.querySingleUser(user);
    }

    @Override
    public User querySingleUser(Integer id) {
        return userDao.querySingle4User(id);
    }

    @Override
    public Integer queryUserCount(String queryCondition) {
        return userDao.queryUserCount(queryCondition);
    }

    @Override
    public List<User> queryUser(String queryCondition,int startIndex, Integer pageSize) {
        return userDao.queryUser(queryCondition,startIndex,pageSize);
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public int delUser(Integer id) {
        return userDao.delUser(id);
    }

    @Override
    public int updUser(User user) {
        return userDao.updUser(user);
    }

    @Override
    public int delBatchUser(Integer[] ids) {
        return userDao.delBatchUser(ids);
    }
}
