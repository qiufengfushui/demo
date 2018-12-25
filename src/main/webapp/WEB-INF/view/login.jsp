<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/11/27
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="keys" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="${APP_Path}/statics/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${APP_Path}/statics/css/font-awesome.min.css">
    <link rel="stylesheet" href="${APP_Path}/statics/css/login.css">
    <style>

    </style>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <div><a class="navbar-brand" href="${APP_Path}/index" style="font-size:32px;">尚筹网-创意产品众筹平台</a></div>
        </div>
    </div>
</nav>

<div class="container">

    <form class="form-signin" role="form" id="from_Login" >
        <h2 class="form-signin-heading"><i class="glyphicon glyphicon-user"></i> 用户登录</h2>
        <div class="form-group has-success has-feedback">
            <input type="text" class="form-control" id="userCode" placeholder="请输入登录账号" autofocus>
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
        </div>
        <div class="form-group has-success has-feedback">
            <input type="text" class="form-control" id="userPassword" placeholder="请输入登录密码" style="margin-top:10px;">
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
        </div>
        <div class="form-group has-success has-feedback">
            <select class="form-control" id="tId">
                <option value="member">会员</option>
                <option value="manage">管理</option>
            </select>
        </div>
        <div class="checkbox">
            <label>
                <input type="checkbox" value="remember-me"> 记住我
            </label>
            <br>
            <label>
                忘记密码
            </label>
            <label style="float:right">
                <a href="${APP_Path}/reg">我要注册</a>
            </label>
        </div>
        <a class="btn btn-lg btn-success btn-block" onclick="dologin()"> 登录</a>
    </form>
</div>
<script src="${APP_Path}/statics/jquery/jquery-2.1.1.min.js"></script>
<script src="${APP_Path}/statics/bootstrap/js/bootstrap.min.js"></script>
<script src="${APP_Path}/statics/layer/layer.js"></script>
<script>
    function dologin() {
        //登录账户为空！
       var userCode =  $("#userCode").val();
       if(userCode == ""){
            layer.msg("用户登录账户不能为空，请输入！",{time:1500,icon:5,shift:6},function () {

            })
           return;
       }
       //登录密码为空！
        var userPassword =  $("#userPassword").val();
        if(userPassword == ""){
            layer.msg("用户登录密码不能为空，请输入！",{time:1500,icon:5,shift:6},function () {

            })
            return;
        }

        var type = $("#tId").val();

        if(type == "manage"){
            //管理员登录
            var data = {
                userCode : $("#userCode").val(),
                userPassword : $("#userPassword").val(),
                tId : 1
            }
            $.ajax({
                type:"post",
                url:"doAJAXLogin",
                data:data,
                dataType:"json",
                beforeSend:function () {
                    layerIndex = layer.msg('处理中',{icon:16});
                },success:function (result) {
                    layer.close(layerIndex);
                    if(result.success == true){
                        window.location.href = "${APP_Path}/main";
                    }else{
                        layer.msg("账号与密码不匹配，请重新输入",{time:1500,icon:5,shift:6},function () {

                        })
                    }
                },error : function () {
                    layer.msg("操作出现异常，请联系管理员！",{time:1500,icon:5,shift:6},function () {

                    })
                }
            })
        }else if(type == "member"){
            //会员登录
            var data = {
                userCode : $("#userCode").val(),
                userPassword : $("#userPassword").val(),
                tId : 2
            }
            //AJAX提交表单
            $.ajax({
                type:"post",
                url:"doAJAXLogin",
                data:data,
                dataType:"json",
                beforeSend:function () {
                    layerIndex = layer.msg('处理中',{icon:16});
                },success:function (result) {
                    layer.close(layerIndex);
                    if(result.success == true){
                        window.location.href = "${APP_Path}/member";
                    }else{
                        layer.msg("账号与密码不匹配，请重新输入",{time:1500,icon:5,shift:6},function () {

                        })
                    }
                },error : function () {
                    layer.msg("操作出现异常，请联系管理员！",{time:1500,icon:5,shift:6},function () {

                    })
                }
            })
        }



    }
</script>
</body>
</html>