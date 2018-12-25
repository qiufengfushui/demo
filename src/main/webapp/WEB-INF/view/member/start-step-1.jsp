<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/12/4
  Time: 10:55
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
        #topcontrol {
            color: #fff;
            z-index: 99;
            width: 30px;
            height: 30px;
            font-size: 20px;
            background: #222;
            position: relative;
            right: 14px !important;
            bottom: 11px !important;
            border-radius: 3px !important;
        }

        #topcontrol:after {
            /*top: -2px;*/
            left: 8.5px;
            content: "\f106";
            position: absolute;
            text-align: center;
            font-family: FontAwesome;
        }

        #topcontrol:hover {
            color: #fff;
            background: #18ba9b;
            -webkit-transition: all 0.3s ease-in-out;
            -moz-transition: all 0.3s ease-in-out;
            -o-transition: all 0.3s ease-in-out;
            transition: all 0.3s ease-in-out;
        }

        .label-type, .label-status, .label-order {
            background-color: #fff;
            color: #f60;
            padding : 5px;
            border: 1px #f60 solid;
        }
        #typeList  :not(:first-child) {
            margin-top:20px;
        }
        .label-txt {
            margin:10px 10px;
            border:1px solid #ddd;
            padding : 4px;
            font-size:14px;
        }
        .panel {
            border-radius:0;
        }

        .progress-bar-default {
            background-color: #ddd;
        }
    </style>
</head>
<body>
<%@include file="common/head.jsp"%>

<div class="container theme-showcase" role="main">

    <%@include file="common/start-left.jsp"%>


    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="panel panel-default" >
                    <div class="panel-heading" style="text-align:center;">
                        <div class="container-fluid">
                            <div class="row clearfix">
                                <div class="col-md-3 column">
                                    <div class="progress" style="height:50px;border-radius:0;    position: absolute;width: 75%;right:49px;">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 100%;height:50px;">
                                            <div style="font-size:16px;margin-top:15px;">1. 项目及发起人信息</div>
                                        </div>
                                    </div>
                                    <div style="right: 0;border:10px solid #ddd;border-left-color: #88b7d5;border-width: 25px;position: absolute;
                                             border-left-color: rgba(92, 184, 92, 1);
                                             border-top-color: rgba(92, 184, 92, 0);
                                             border-bottom-color: rgba(92, 184, 92, 0);
                                             border-right-color: rgba(92, 184, 92, 0);
                                        ">
                                    </div>
                                </div>
                                <div class="col-md-3 column">
                                    <div class="progress" style="height:50px;border-radius:0;position: absolute;width: 75%;right:49px;">
                                        <div class="progress-bar progress-bar-default" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 100%;height:50px;">
                                            <div style="font-size:16px;margin-top:15px;">2. 回报设置</div>
                                        </div>
                                    </div>
                                    <div style="right: 0;border:10px solid #ddd;border-left-color: #88b7d5;border-width: 25px;position: absolute;
                                             border-left-color: rgba(221, 221, 221, 1);
                                             border-top-color: rgba(221, 221, 221, 0);
                                             border-bottom-color: rgba(221, 221, 221, 0);
                                             border-right-color: rgba(221, 221, 221, 0);
                                        ">
                                    </div>
                                </div>
                                <div class="col-md-3 column">
                                    <div class="progress" style="height:50px;border-radius:0;position: absolute;width: 75%;right:49px;">
                                        <div class="progress-bar progress-bar-default" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 100%;height:50px;">
                                            <div style="font-size:16px;margin-top:15px;">3. 确认信息</div>
                                        </div>
                                    </div>
                                    <div style="right: 0;border:10px solid #ddd;border-left-color: #88b7d5;border-width: 25px;position: absolute;
                                             border-left-color: rgba(221, 221, 221, 1);
                                             border-top-color: rgba(221, 221, 221, 0);
                                             border-bottom-color: rgba(221, 221, 221, 0);
                                             border-right-color: rgba(221, 221, 221, 0);
                                        ">
                                    </div>
                                </div>
                                <div class="col-md-3 column">
                                    <div class="progress" style="height:50px;border-radius:0;">
                                        <div class="progress-bar progress-bar-default" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 100%;height:50px;">
                                            <div style="font-size:16px;margin-top:15px;">4. 完成</div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="panel-body">
                        <div class="container-fluid">
                            <div class="row clearfix">
                                <div class="col-md-12 column">
                                    <blockquote style="border-left: 5px solid #f60;color:#f60;padding: 0 0 0 20px;">
                                        <b>
                                            项目及发起人信息
                                        </b>
                                    </blockquote>
                                </div>
                                <div class="col-md-12 column">
                                    <div class="page-header" style="    border-bottom-style: dashed;">
                                        <h3>
                                            项目信息
                                        </h3>
                                    </div>
                                    <form class="form-horizontal">
                                        <div class="form-group">
                                            <label for="inputEmail3" class="col-sm-2 control-label">分类信息</label>
                                            <div class="col-sm-10">
                                                <label class="radio-inline">
                                                    <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1"> 科技
                                                </label>
                                                <label class="radio-inline">
                                                    <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 设计
                                                </label>
                                                <label class="radio-inline">
                                                    <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 公益
                                                </label>
                                                <label class="radio-inline">
                                                    <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 农业
                                                </label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label for="inputEmail3" class="col-sm-2 control-label">标签</label>
                                            <div class="col-sm-10">
                                                <ul style="list-style:none;padding-left:0;">
                                                    <li style="margin:10px 0">[手机]
                                                        <span class="label-txt">手机</span> <span class="label-txt">快充</span> <span class="label-txt">文字标签</span> <span class="label-txt">文字标签</span> <span class="label-txt">文字标签</span> <span class="label-txt">文字标签</span>
                                                    </li>
                                                    <li style="margin:10px 0">[数码]
                                                        <span class="label-txt">文字标签</span> <span class="label-txt">文字标签</span> <span class="label-txt">文字标签</span> <span class="label-txt">文字标签</span> <span class="label-txt">文字标签</span> <span class="label-txt">文字标签</span>
                                                    </li>
                                                    <li style="margin:10px 0">[电脑]
                                                        <span class="label-txt">文字标签</span> <span class="label-txt">文字标签</span> <span class="label-txt">文字标签</span> <span class="label-txt">文字标签</span> <span class="label-txt">文字标签</span> <span class="label-txt">文字标签</span>
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">项目名称</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" >
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">一句话简介</label>
                                            <div class="col-sm-10">
                                                <textarea class="form-control" rows="5"></textarea>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">筹资金额（元）</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" style="width:100px;" >
                                                <label class="control-label">筹资金额不能低于100元,不能高于1000000000元</label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">筹资天数（天）</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" style="width:100px;" >
                                                <label class="control-label">一般10-90天，建议30天</label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">项目头图</label>
                                            <div class="col-sm-10">
                                                <button type="button" class="btn btn-primary btn-lg active">上传图片</button>
                                                <label class="control-label">图片上无文字,支持jpg、jpeg、png、gif格式，大小不超过2M，建议尺寸：740*457px</label>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">项目详情</label>
                                            <div class="col-sm-10">
                                                <button type="button" class="btn btn-primary btn-lg active">上传图片</button>
                                                <label class="control-label">支持jpg、jpeg、png、gif格式，大小不超过2M，建议尺寸：宽740px</label>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                                <div class="col-md-12 column">
                                    <div class="page-header" style="    border-bottom-style: dashed;">
                                        <h3>
                                            发起人信息
                                        </h3>
                                    </div>
                                    <form class="form-horizontal">
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">自我介绍</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" placeholder="一句话自我介绍，不超过40字">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">详细自我介绍</label>
                                            <div class="col-sm-10">
                                                <textarea class="form-control" rows="5" placeholder="向支持者详细介绍你自己或你的团队及项目背景，让支持者在最短时间内了解你，不超过160字"></textarea>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">联系电话</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" placeholder="此信息不会显示在项目页面">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label">客服电话</label>
                                            <div class="col-sm-10">
                                                <input type="text" class="form-control" placeholder="此信息显示在项目页面">
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="panel-footer" style="text-align:center;">
                        <button type="button" class="btn  btn-warning btn-lg" onclick="window.location.href='start-step-2.html'">下一步</button>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <%@include file="common/bottom.jsp"%>

</div> <!-- /container -->
<script src="${APP_Path}/statics/jquery/jquery-2.1.1.min.js"></script>
<script src="${APP_Path}/statics/bootstrap/js/bootstrap.min.js"></script>
<script src="${APP_Path}/statics/script/docs.min.js"></script>
<script src="${APP_Path}/statics/script/back-to-top.js"></script>
<script>
    $('#myTab a').click(function (e) {
        e.preventDefault()
        $(this).tab('show')
    })
</script>
</body>
</html>