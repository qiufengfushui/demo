package cn.zxt.crowdfunding.controller;

import cn.zxt.crowdfunding.pojo.AJAXResult;
import cn.zxt.crowdfunding.pojo.Type;
import cn.zxt.crowdfunding.pojo.User;
import cn.zxt.crowdfunding.service.UserService;
import cn.zxt.crowdfunding.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/doLogin")
    public String doLogin(){
        return "";
    }

    @ResponseBody
    @RequestMapping("/doAJAXLogin")
    public Object loginManage(User user,Integer tId, HttpSession session){
        Type type = new Type();
        type.setId(tId);
        user.setType(type);
        AJAXResult result = new AJAXResult();
        User dbUser = userService.querySingleUser(user);
        if (dbUser == null){
            result.setSuccess(false);
        }else{
            result.setSuccess(true);
            session.setAttribute("userSession",dbUser);
        }
        return result;
    }

    @ResponseBody
    @RequestMapping("/doAJAXList")
    public Object doAJAXList(@RequestParam(defaultValue = "1",required = false)Integer pageNum,
                             @RequestParam(defaultValue = "8",required = false)Integer pageSize,
                             @RequestParam(defaultValue = "",required = false)String queryCondition
    ){
        AJAXResult<User> result = new AJAXResult<>();
        Integer totalRecord  = userService.queryUserCount(queryCondition);

        PageBean pageBean = new PageBean(pageNum,pageSize,totalRecord);

        List<User> list = userService.queryUser(queryCondition,pageBean.getStartIndex(),pageSize);
        result.setList(list);
        result.setPageBean(pageBean);
        return result;
    }

    @ResponseBody
    @RequestMapping("/addUser")
    public Object addUser(User user){
        AJAXResult result = new AJAXResult();
        int dbResult = userService.addUser(user);
        if (dbResult == 1){
            result.setSuccess(true);
        }else {
            result.setSuccess(false);
        }
        return  result;
    }
    @ResponseBody
    @RequestMapping("/delUser")
    public Object delUser(Integer id){
        AJAXResult result = new AJAXResult();
        int dbResult = userService.delUser(id);
        if (dbResult == 1){
            result.setSuccess(true);
        }else {
            result.setSuccess(false);
        }
        return  result;
    }

    @ResponseBody
    @RequestMapping("/userInfo")
    public Object userInfo(Integer id){
        AJAXResult<User> result = new AJAXResult<>();
        User user = userService.querySingleUser(id);
        result.setObject(user);
        return result;
    }

    @ResponseBody
    @RequestMapping("/modifyUser")
    public Object modifyUser(User user){
        AJAXResult result = new AJAXResult();
        System.out.println(user.getUserName());
        int dbResult = userService.updUser(user);
        if (dbResult == 1){
            result.setSuccess(true);
        }else {
            result.setSuccess(false);
        }
        return result;
    }

    @ResponseBody
    @RequestMapping("/batchDelUser")
    public Object batchDelUser(Integer[] ids){
        AJAXResult result = new AJAXResult();
        System.out.println(ids);
        if (ids == null){
            result.setSuccess(false);
        }
        int dbResult = userService.delBatchUser(ids);
        if (dbResult == 0){
            result.setSuccess(false);
        }else{
            result.setSuccess(true);
        }
        return result;
    }
}
