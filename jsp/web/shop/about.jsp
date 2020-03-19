<%--
  Created by IntelliJ IDEA.
  User: windows
  Date: 2020/1/20
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>关于我们</title>
    <!-- 1 引入bootstrap中的css样式 -->
    <link rel="stylesheet" href="bootstrap-3.3.7/css/bootstrap.min.css">
    <!-- 2引入bootstrap核心jQuery文件 -->
    <script type="text/javascript" src="bootstrap-3.3.7/js/jquery-1.11.1.min.js"></script>
    <!-- 3引入bootstrap核心JavaScript文件 -->
    <script type="text/javascript" src="bootstrap-3.3.7/js/bootstrap.js"></script>

    <style>
        .jumbotron {
            background: url(img/headline.jpg) center;
            height: 300px;
        }

        footer {
            background-color: #eee;
            padding-top: 25px;
            color: white;
        }
        .form1{
            margin-right: 150px;
        }
    </style>
</head>
<body>
<!-- 导航开始 -->
<nav class="navbar navbar-default">
    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">
                <strong>多多旅行社</strong>
            </a>
            <form class="navbar-form navbar-left form1" role="search">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="请输入你想要去的地方">
                </div>
                <button type="submit" class="btn btn-default">搜索</button>
            </form>
            <!-- 模态框主页面 -->
            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog"
                 aria-labelledby="exampleModalLabel">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                                    aria-hidden="true">&times;</span></button>
                            <h4 class="modal-title" id="exampleModalLabel"></h4>
                        </div>
                        <div class="modal-body">
                            <form>
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">姓名:</label>
                                    <input type="text" class="form-control" id="recipient-name"
                                           placeholder="请输入用户名">
                                </div>
                                <div class="form-group">
                                    <label for="recipient-name" class="control-label">密码:</label>
                                    <input type="password" class="form-control" id="recipient-name"
                                           placeholder="请输入密码">
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                            <button type="button" class="btn btn-primary">保存</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <ul class="nav navbar-nav">
            <li><a href="index.jsp"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>首页</a></li>
            <li><a href=""><span class="glyphicon glyphicon-signal" aria-hidden="true"></span>排行</a></li>
            <li><a href=""><span class="glyphicon glyphicon-book" aria-hidden="true"></span>攻略</a></li>
            <li><a href="about.jsp"><span class="glyphicon glyphicon-menu-hamburger"
                                           aria-hidden="true"></span>关于</a></li>
        </ul>
        <form class="navbar-form navbar-right">
            <!-- 模态框按钮 -->
            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#exampleModal"
                    data-whatever="">登录</button>
            <button type="button" class="btn btn-default" data-toggle="modal" data-target="#exampleModal"
                    data-whatever="">注册</button>
            <button type="button" class="btn btn-default" onclick="location.href='list.jsp'">后台管理</button>
        </form>
    </div>
</nav>
<!-- 导航结束 -->
<!-- 巨幕开始 -->
<div class="jumbotron">
    <div class="container">
    </div>
</div>
<!-- 巨幕结束 -->
<!-- 内容开始 -->
<div class="main">
    <div class="container">
        <div class="row">
            <div class="col-md-3 col-xs-6">
                <div class="list-group">
                    <a href="#" class="list-group-item active">
                        目录
                    </a>
                    <a href="#1" class="list-group-item">公司简介</a>
                    <a href="#2" class="list-group-item">公司历程</a>
                    <a href="#3" class="list-group-item">虚席以待</a>
                    <a href="#4" class="list-group-item">联系我们</a>
                </div>
            </div>
            <div class="col-md-9 col-xs-6">
                <a name="1"></a>
                <h3 class="well"><span class="label label-primary">公司简介</span></h3>
                <p>
                    XXX有限公司是行业领先的全球化软件与信息技术服务企业之一，成立于2000年，为香港主板上市公司（股票代码354），在中国北京、西安、南京、深圳、上海、香港等28个城市及美国、日本、印度、马来西亚、新加坡等国的18个城市拥有分支机构，全球员工超过6万人。

                    中软国际应用开发与管理专业沉淀深厚，企业数字化转型的最佳实践和专家人才充沛。公司与华为等战略伙伴一起，构建互联网信息技术服务平台，领先技术变革，提升产业效率，致力于使能软件企业引领发展，服务制造企业转型升级，为政企客户提供“多快好省”的信息技术服务。公司倡导“率真存厚、立志有恒；奋斗为本、成就客户；创造分享、共同成长”的经营理念，是您值得信赖的专家伙伴。

                    中软国际在服务财富500强企业及大中型客户的近二十年里，在电信、政府、制造、金融、公共服务、能源等行业均取得了不斐的成绩。2017年，公司市值产值双双突破百亿，已是国内最大的软件与信息技术服务企业之一。
                </p>
                <a name="2"></a>
                <h3 class="well"><span class="label label-primary">公司历程</span></h3>
                <ul class="list-unstyled">
                    <li>首批国家创新型企业</li>
                    <li>首批国家技术创新示范企业</li>
                    <li>科技部国际科技合作基地</li>
                    <li>国家级企业技术中心</li>
                    <li>全国自主创新型企业优秀奖</li>
                    <li>博士后科研工作站</li>
                    <li>国家高科技产业化示范工程</li>
                    <li>首批国家创新型企业</li>
                    <li>首批国家技术创新示范企业</li>
                    <li>科技部国际科技合作基地</li>
                    <li>国家级企业技术中心</li>
                    <li>全国自主创新型企业优秀奖</li>
                    <li>博士后科研工作站</li>
                    <li>国家高科技产业化示范工程</li>
                </ul>
                <a name="3"></a>
                <h3 class="well"><span class="label label-primary">虚席以待</span></h3>
                <ul class="list-unstyled">
                    <li>java工程师</li>
                    <li>javaWeb工程师</li>
                    <li>C++工程师</li>
                    <li>运维工程师</li>
                    <li>前端工程师</li>
                    <li>售前工程师</li>
                    <li>售后工程师</li>
                    <li>项目经理</li>
                </ul>
                <a name="4"></a>
                <h3 class="well"><span class="label label-primary">联系我们</span></h3>
                <ul class="list-unstyled">
                    <li>杭州网络技术有限公司</li>
                    <li>电　话：0571-87210028　0571-87211100</li>
                    <li>传　真：0571-87211100　0571-87081680</li>
                    <li>地　址：杭州市解放路26号金衙庄大厦11楼D-F座</li>
                    <li>邮　箱：Eileen@hzkc.cn</li>
                </ul>
            </div>
        </div>
    </div>
</div>
<!-- 内容结束 -->
<!-- 底部开始 -->
<footer>
    <div class="container">
        <div class="row">
            <div class="col-md-4 col-sm-4 col-xs-12">
                <!-- <div class="thumbnail"> -->
                <dl>
                    <dt><a href="">合作伙伴</a></dt>
                    <dd><a href="">途牛旅游网</a></dd>
                    <dd><a href="">驴妈妈旅游网</a></dd>
                    <dd><a href="">携程旅游</a></dd>
                </dl>
                <!-- </div> -->
            </div>
            <div class="col-md-4 col-sm-4 col-xs-12">
                <!-- <div class="thumbnail"> -->
                <dl>
                    <dt><a href="">旅游FAQ</a></dt>
                    <dd><a href="">旅游合同签订方式？</a></dd>
                    <dd><a href="">儿童价是基于什么制定的？</a></dd>
                    <dd><a href="">旅游的线路品质怎么界定的？</a></dd>
                    <dd><a href="">单房差是什么？</a></dd>
                    <dd><a href="">旅游保险有哪些种类？</a></dd>
                </dl>
                <!-- </div> -->
            </div>
            <div class="col-md-4 col-sm-4 col-xs-12">
                <!-- <div class="thumbnail"> -->
                <dl>
                    <dt><a href="">联系方式</a></dt>
                    <dd><a href="">微博：yoghurtduoduo.com/</a></dd>
                    <dd><a href="">邮件：lunbo@hzn.com</a></dd>
                    <dd><a href="">地址：江苏南京鼓楼金山大厦B座6A层</a></dd>
                </dl>
                <!-- </div> -->
            </div>
        </div>
    </div>
</footer>
<!-- 底部结束 -->

</body>

</html>