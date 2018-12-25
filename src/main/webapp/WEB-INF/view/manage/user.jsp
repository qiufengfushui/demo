<%--
  Created by IntelliJ IDEA.
  User: Mr.Tong
  Date: 2018/11/29
  Time: 10:40
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
    <style>
        .tree li {
            list-style-type: none;
            cursor:pointer;
        }
        table tbody tr:nth-child(odd){background:#F4F4F4;}
        table tbody td:nth-child(even){color:#C00;}
    </style>
</head>

<body>

<%@include file="common/head.jsp"%>

<div class="container-fluid">
    <div class="row">
        <%@include file="common/left.jsp"%>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title"><i class="glyphicon glyphicon-th"></i> 数据列表</h3>
                </div>
                <div class="panel-body">
                    <form class="form-inline" role="form" style="float:left;">
                        <div class="form-group has-feedback">
                            <div class="input-group">
                                <div class="input-group-addon">查询条件</div>
                                <input class="form-control has-success" type="text" id="queryCondition" name="queryCondition" placeholder="请输入查询条件">
                            </div>
                        </div>
                        <button type="button" class="btn btn-warning" id="query"><i class="glyphicon glyphicon-search"></i> 查询</button>
                    </form>
                    <button type="button" class="btn btn-danger" onclick="batchDelUser()" style="float:right;margin-left:10px;"><i class=" glyphicon glyphicon-remove"></i> 删除</button>
                    <button type="button" class="btn btn-primary" style="float:right;" onclick="window.location.href='${APP_Path}/add'"><i class="glyphicon glyphicon-plus"></i> 新增</button>
                    <br>
                    <hr style="clear:both;">
                    <div class="table-responsive">
                        <table class="table  table-bordered" id="userList">
                            <thead>
                            <tr>
                                <th width="30">#</th>
                                <th width="30"><input type="checkbox" onclick="selector(this)" ></th>
                                <th>账号</th>
                                <th>名称</th>
                                <th>邮箱地址</th>
                                <th width="100">操作</th>
                            </tr>
                            </thead>
                            <tbody id="userInfo">
                                <%--用户信息--%>
                            </tbody>
                            <tfoot id="paging">
                                <%--分页信息--%>
                            </tfoot>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="${APP_Path}/statics/jquery/jquery-2.1.1.min.js"></script>
<script src="${APP_Path}/statics/bootstrap/js/bootstrap.min.js"></script>
<script src="${APP_Path}/statics/script/docs.min.js"></script>
<script src="${APP_Path}/statics/layer/layer.js"></script>
<script type="text/javascript">
        //bug：第二次点的时候无响应
    function selector(element){
        if(element.checked){
            //全选
            /*$("#userInfo :checkbox").attr("checked","checked");*/
            $("#userInfo :checkbox").prop("checked", true);
        }else {
            //全不选
            /*$("#userInfo :checkbox").removeAttr("checked");*/
            $("#userInfo :checkbox").prop("checked", false);
        }
    }
    $(function () {
        $("#query").click(function () {
            var queryCondition = $("#queryCondition").val()
            queryUser(1,queryCondition)
        })
    })
    function queryUser(pageNum,queryCondition){
        var data = {
            pageNum:pageNum,
            queryCondition:queryCondition
        }
        $.ajax({
            type : "post",
            url  : "${APP_Path}/doAJAXList",
            data : data,
            dataType : "json",
            beforeSend:function () {
                layerIndex = layer.msg('加载中',{icon:16});
            },
            success:function (result) {
                layer.close(layerIndex)
                var userInfo = $("#userInfo");      //用户信息
                var list = result.list
                var userContext = "";
                $(list).each(function (index,element) {
                    userContext += '<tr>'
                    userContext += '    <td>'+(index + 1)+'</td>'
                    userContext += '    <td><input type="checkbox" value="'+element.id+'"></td>'
                    userContext += '        <td>'+element.userCode+'</td>'
                    userContext += '        <td>'+element.userCode+'</td>'
                    userContext += '        <td>'+element.email+'</td>'
                    userContext += '        <td>'
                    userContext += '    <button type="button" class="btn btn-success btn-xs" onclick="look(this)"    uid='+element.id+'> <i class=" glyphicon glyphicon-check"></i></button>'
                    userContext += '    <button type="button" class="btn btn-primary btn-xs" onclick="edit(this)"  uid='+element.id+'><i class=" glyphicon glyphicon-pencil"></i></button>'
                    userContext += '    <button type="button" class="btn btn-danger btn-xs"  onclick="del(this)"     uid='+element.id+'><i class=" glyphicon glyphicon-remove"></i></button>'
                    userContext += '    </td>'
                    userContext += '    </tr>'
                })
                userInfo.html(userContext)
                //分页内容
                var pageBean = result.pageBean
                var pageNum = pageBean.pageNum   //当前页码
                var totalPage = pageBean.totalPage   //当前页码
                var start = pageBean.start   //开始索引
                var end = pageBean.end   //结束索引
                var pag = "";
                pag += '<tr>'
                pag += '<td colspan="6" align="center">'
                pag += '    <ul class="pagination">'
                if(pageNum == 1){
                    pag += '    <li class="disabled"><a href="#">上一页</a></li>'
                }else{
                    pag += '    <li><a href="javascript:;" onclick="queryUser('+(pageNum-1)+')">上一页</a></li>'
                }
                for (; start <= end; start++) {
                    if(pageNum == start ){
                        pag += '<li class="active"><a href="#">'+start+' <span class="sr-only">(current)</span></a></li>'
                    }else{
                        pag += '<li><a href="javascript:;" onclick="queryUser('+start+')">'+start+'</a></li>'
                    }
                }
                if(totalPage > pageNum){
                    pag += '<li><a href="javascript:;" onclick="queryUser('+(pageNum+1)+')">下一页</a></li>'
                }else{
                    pag += '<li class="disabled"><a href="#">下一页</a></li>'
                }
                pag += '</ul>'
                pag += '</td>'
                pag += '</tr>'
                $("#paging").html(pag)
            },error : function () {
                layer.msg("操作出现异常，请联系管理员！",{time:1500,icon:5,shift:6},function () {

                })
            }
        })
    }
    $(function () {
        queryUser(1)
    })


    $("tbody .btn-success").click(function(){

    });
    $("tbody .btn-primary").click(function(){
        window.location.href = "edit.html";
    });

    function look(element) {
        //查看
        window.location.href = "${APP_Path}/assignRole";
    }

    function edit(element) {
        //修改
        var obj = $(element);
        window.location.href = "${APP_Path}/edit?id="+obj.attr("uId")+"";

    }
    function del(element) {
        //单个删除
        var obj = $(element);
        $.ajax({
            type : "post",
            url  : "${APP_Path}/delUser",
            data : {
                id : obj.attr("uId")
            },
            dataType : "json",
            beforeSend:function () {
                layerIndex = layer.msg('处理中',{icon:16});
            },
            success : function (result) {
                layer.close(layerIndex)
                if (result.success) {
                    layer.msg("删除成功！",{time:1000,icon:6,shift:5},function () {
                        $(element).parents("tr").remove()
                    })
                }else{
                    layer.msg("删除失败，请联系管理员！",{time:1500,icon:5,shift:6},function () {

                    })
                }
            },error : function () {
                layer.msg("操作出现异常，请联系管理员！",{time:1500,icon:5,shift:6},function () {
                })
            }
        })
    }
    function batchDelUser(){
        //批量删除
        var array = []
        var allCheckBoxes = $("#userInfo :checkbox")
        $(allCheckBoxes).each(function (index,element) {
            if(element.checked){
                array.push(element.value)
            }
        })
        if(array.length == 0){
            //一个也没选
            layer.msg("请至少选中一个要删除的对象",{time:1500,icon:5,shift:6},function () {

            })
        }else{
            //至少选中一个
            var data = {
                    ids : array
                }
            $.ajax({
                type : "post",
                url  : "${APP_Path}/batchDelUser",
                data : data,
                traditional: true,
                dataType : "json",
                beforeSend : function () {
                    layerIndex = layer.msg('处理中',{icon:16});
                },
                success : function (result) {
                    layer.close(layerIndex)
                    if (result.success) {
                        layer.msg("删除成功！",{time:1000,icon:6,shift:5},function () {
                            $(allCheckBoxes).each(function (index,element) {
                                if(element.checked){
                                    $(element).parents("tr").remove()
                                }
                            })
                        })
                    }else{
                        layer.msg("删除失败，请联系管理员！",{time:1500,icon:5,shift:6},function () {

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

