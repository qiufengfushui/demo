package cn.zxt.crowdfunding.service;

import cn.zxt.crowdfunding.pojo.User;

import java.util.List;

public interface UserService {
    User querySingleUser(User user);

    User querySingleUser(Integer id);

    Integer queryUserCount(String queryCondition);

    List<User> queryUser(String queryCondition,int startIndex, Integer pageSize);

    int addUser(User user);

    int delUser(Integer id);

    int updUser(User user);

    int delBatchUser(Integer[] ids);
}
