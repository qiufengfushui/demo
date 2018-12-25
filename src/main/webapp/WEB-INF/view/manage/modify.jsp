<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/11/30
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/11/30
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="utf-8">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" href="${APP_Path}/statics/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${APP_Path}/statics/css/font-awesome.min.css">
    <link rel="stylesheet" href="${APP_Path}/statics/css/main.css">
    <link rel="stylesheet" href="${APP_Path}/statics/css/doc.min.css">
    <style>
        .tree li {
            list-style-type: none;
            cursor:pointer;
        }
    </style>
</head>

<body>
<%@include file="common/head.jsp"%>
<div class="container-fluid">
    <div class="row">
        <%@include file="common/left.jsp"%>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <ol class="breadcrumb">
                <li><a href="#">首页</a></li>
                <li><a href="#">数据列表</a></li>
                <li class="active">新增</li>
            </ol>
            <div class="panel panel-default">
                <div class="panel-heading">表单数据<div style="float:right;cursor:pointer;" data-toggle="modal" data-target="#myModal"><i class="glyphicon glyphicon-question-sign"></i></div></div>
                <div class="panel-body">
                    <form role="form">
                        <div class="form-group">
                            <label for="userCode">登陆账号</label>
                            <input type="text" class="form-control" id="userCode" placeholder="请输入登陆账号">
                        </div>
                        <div class="form-group">
                            <label for="userName">用户名称</label>
                            <input type="text" class="form-control" id="userName" placeholder="请输入用户名称">
                        </div>
                        <div class="form-group">
                            <label for="email">邮箱地址</label>
                            <input type="email" class="form-control" id="email" placeholder="请输入邮箱地址">
                            <p class="help-block label label-warning">请输入合法的邮箱地址, 格式为： xxxx@xxxx.com</p>
                        </div>
                        <button type="button" class="btn btn-success" onclick="addUser()"><i class="glyphicon glyphicon-plus"></i> 新增</button>
                        <button type="button" class="btn btn-danger" onclick="reset()"><i class="glyphicon glyphicon-refresh"></i> 重置</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title" id="myModalLabel">帮助</h4>
            </div>
            <div class="modal-body">
                <div class="bs-callout bs-callout-info">
                    <h4>测试标题1</h4>
                    <p>测试内容1，测试内容1，测试内容1，测试内容1，测试内容1，测试内容1</p>
                </div>
                <div class="bs-callout bs-callout-info">
                    <h4>测试标题2</h4>
                    <p>测试内容2，测试内容2，测试内容2，测试内容2，测试内容2，测试内容2</p>
                </div>
            </div>
            <!--
            <div class="modal-footer">
              <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
              <button type="button" class="btn btn-primary">Save changes</button>
            </div>
            -->
        </div>
    </div>
</div>
<script src="${APP_Path}/statics/jquery/jquery-2.1.1.min.js"></script>
<script src="${APP_Path}/statics/bootstrap/js/bootstrap.min.js"></script>
<script src="${APP_Path}/statics/script/docs.min.js"></script>
<script src="${APP_Path}/statics/layer/layer.js"></script>
<script>
    function reset() {
        $("#userCode").val("")
        $("#userName").val("")
        $("#email").val("")
    }

    function addUser(){
        var userCode = $("#userCode").val()
        var userName = $("#userName").val()
        var email = $("#email").val()
        var reg = new RegExp("^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$"); //邮箱格式
        if(userCode == ""){
            layer.msg("登录账户不能为空，请输入！",{time:1500,icon:5,shift:6},function () {

            })
            return;
        }

        if(userName == ""){
            layer.msg("用户名称不能为空，请输入！",{time:1500,icon:5,shift:6},function () {

            })
            return;
        }

        if(email == ""){
            layer.msg("邮箱不能为空，请输入！",{time:1500,icon:5,shift:6},function () {

            })
            return;
        }else if(!reg.test(email)){
            layer.msg("邮箱格式不正确，请重新输入！",{time:1500,icon:5,shift:6},function () {

            })
            return;
        }

        var data = {
            userCode:userCode,
            userName:userName,
            email:email
        }
        $.ajax({
            type :"post",
            url  : "${APP_Path}/addUser",
            data : data,
            dataType : "json",
            beforeSend:function () {
                layerIndex = layer.msg('处理中',{icon:16});
            },
            success:function (result) {
                layer.close(layerIndex)
                if(result.success == true){
                    window.location.href = "${APP_Path}/user";
                }else{
                    layer.msg("新增用户失败，请联系管理员！",{time:1500,icon:5,shift:6},function () {

                    })
                }
            }
        })
    }
</script>
</body>
</html>

