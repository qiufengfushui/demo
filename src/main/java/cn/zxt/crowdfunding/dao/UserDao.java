package cn.zxt.crowdfunding.dao;

import cn.zxt.crowdfunding.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserDao {

    @Select("select * from t_user where userCode = #{userCode} and userPassword = #{userPassword} and type = #{type.id}")
    User querySingleUser(User user);

    @Select("select * from t_user where id = #{id}")
    User querySingle4User(Integer id);

    Integer queryUserCount(@Param("queryCondition") String queryCondition);

    List<User> queryUser(@Param("queryCondition") String queryCondition,@Param("startIndex") int startIndex,@Param("pageSize") Integer pageSize);

    int addUser(User user);

    @Delete("delete from t_user where id = #{id}")
    int delUser(Integer id);

    @Update("update t_user set userName = #{userName},email = #{email} where id = #{id} and userCode = #{userCode}")
    int updUser(User user);

    int delBatchUser(@Param("ids") Integer[] ids);
}
