<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/12/4
  Time: 9:55
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
    <link rel="stylesheet" href="${APP_Path}/statics/css/theme.css">
    <style>
        #footer {
            padding: 15px 0;
            background: #fff;
            border-top: 1px solid #ddd;
            text-align: center;
        }
    </style>
</head>
<body>
<div class="navbar-wrapper">
    <div class="container">
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <a class="navbar-brand" href="${APP_Path}/index" style="font-size:32px;">尚筹网-创意产品众筹平台</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse" style="float:right;">
                    <ul class="nav navbar-nav">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="glyphicon glyphicon-user"></i> 张三<span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="${APP_Path}/member"><i class="glyphicon glyphicon-scale"></i> 会员中心</a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-comment"></i> 消息</a></li>
                                <li class="divider"></li>
                                <li><a href="${APP_Path}/index"><i class="glyphicon glyphicon-off"></i> 退出系统</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

    </div>
</div>

<div class="container theme-showcase" role="main">
    <div class="page-header">
        <h1>实名认证 - 申请</h1>
    </div>

    <ul class="nav nav-tabs" role="tablist">
        <li role="presentation" class="active"><a href="#"><span class="badge">1</span> 基本信息</a></li>
        <li role="presentation"><a href="#"><span class="badge">2</span> 资质文件上传</a></li>
        <li role="presentation"><a href="#"><span class="badge">3</span> 邮箱确认</a></li>
        <li role="presentation"><a href="#"><span class="badge">4</span> 申请确认</a></li>
    </ul>

    <form role="form" style="margin-top:20px;">
        <div class="form-group">
            <label for="realname">真实名称</label>
            <input type="text" class="form-control" id="realname" placeholder="请输入真实名称">
        </div>
        <div class="form-group">
            <label for="cardnum">身份证号码</label>
            <input type="text" class="form-control" id="cardnum" placeholder="请输入身份证号码">
        </div>
        <div class="form-group">
            <label for="tel">电话号码</label>
            <input type="text" class="form-control" id="tel" placeholder="请输入电话号码">
        </div>
        <button type="button" onclick="window.location.href='${APP_Path}/accttype'" class="btn btn-default">上一步</button>
        <button type="button" onclick="window.location.href='${APP_Path}/apply-1'"  class="btn btn-success">下一步</button>
    </form>
    <hr>
</div>

<!-- /container -->
<%@include file="common/bottom.jsp"%>
<script src="${APP_Path}/statics/jquery/jquery-2.1.1.min.js"></script>
<script src="${APP_Path}/statics/bootstrap/js/bootstrap.min.js"></script>
<script src="${APP_Path}/statics/script/docs.min.js"></script>
<script>
    $('#myTab a').click(function (e) {
        e.preventDefault()
        $(this).tab('show')
    });
</script>
</body>
</html>