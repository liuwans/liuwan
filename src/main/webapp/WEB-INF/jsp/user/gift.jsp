<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>特产</title>
<link rel="stylesheet" href="css/bsl.css">
<link rel="stylesheet" href="css/head.css">
<link rel="stylesheet" href="css/reset.css">
</head>
<body>
	<div class="wrap">
		<div class="header">
			<div class="con">
				<!-- 头部内容 -->
				<div class="con1">
					<div class="search">
						<input type="text" name="" value=""><a href="https://www.baidu.com/"></a>
					</div>
					<div class="leftsearch">
							<div class="bag" >
							<img src="img/pageimg/gift_03.png" alt="">
							<a id="headcon1" href="javascript:;">行李箱</a>
						</div>
						<div class="zhuce" >
							<c:choose>
							   <c:when test="${empty uname }">
									<a id="headcon1" href="getLongin">注册</a>
							   </c:when>
							   <c:otherwise> 
							   		<a href="logoutGift" id="headcon1">注销</a>
							   </c:otherwise>
							</c:choose>
						</div>
						<div class="zhuce" >
							<c:choose>
							   <c:when test="${empty uname }">
							   		<a id="headcon1" href="getUser">登录</a>
							   </c:when>
							   <c:otherwise> 
							   		<a style="color: red;" href="#" id="headcon1">${uname }</a>
							   </c:otherwise>
							</c:choose>
						</div>
						<div class="tel">
							<img src="img/pageimg/phone_03.png" alt="">
							<a  href="javascript:;">400-800-8820</a>
						</div>
					</div>
					
				</div>
				<div class="con2">
					<a class="posimg" href="getIndex"><img src="img/pageimg/hose_03.png" alt=""></a>
					<a href="javascript:;">第一次</a>
					<a href="javascript:;">目的地</a>
					<a href="javascript:;">自订行程</a>
					<a href="javascript:;">游记</a>
					<a href="javascript:;">特产</a>
					<a href="javascript:;">优惠</a>
					<a href="javascript:;">环岛巴士</a>
				</div>
			</div>
		</div>
		<div class="pos"><a href="javascript:;">首页</a> &gt; 伴手礼</div>
		<div class="banner"></div>
		<div class="content">
			<!-- 主要内容 -->
			<h1>伴手礼</h1>
			<ul>
				<c:forEach items="${list }" var="l">
				<li>
					<img src="${l.giftpic[0].picpath }" alt="">
					<h3>${l.giftName }</h3>
					<div class="popup">
						<div>
							<span class="spanl"><a href="" class="a1"></a>${l.num }</span>
							<span class="spanr"><a href="" class="a2"></a>${l.tcomment }</span>
						</div>
						<h2>${l.giftName }</h2>
						<p>${l.giftDescribe }</p>
						<h4></h4>
					</div>
				</li>
				</c:forEach>
			</ul>
			<div class="page">
				<div><a href="getGifts?pageNum=1">首页</a></div>
				<div>
					<c:if test="${pageNum==1 }">
						上一页
					</c:if>
					<c:if test="${pageNum!=1 }">
						<a href="getGifts?pageNum=${pageNum-1 }">上一页</a>
					</c:if>
				</div>
				<div>
					<c:if test="${pageNum == pageMax }">
						下一页
					</c:if>
					<c:if test="${pageNum != pageMax }">
						<a href="getGifts?pageNum=${pageNum+1 }">下一页</a>
					</c:if>
				</div>
				<div><a href="getGifts?pageNum=${pageMax }">尾页</a></div>
			</div>
		</div>
		<div class="footer">
			<div class="con1">
				<ul>
					<li><a class="tit" href="javascript:;">关于遛弯</a></li>
					<li><a href="javascript:;">公司简介</a></li>
					<li><a href="javascript:;">联系我们</a></li>
					<li><a href="javascript:;">招聘英才</a></li>
					<li><a href="javascript:;">网站地图</a></li>
					
				</ul>
				<ul>
					<li><a class="tit" href="javascript:;">帮助中心</a></li>
					<li><a href="javascript:;">赴台手续</a></li>
					<li><a href="javascript:;">遛弯玩法</a></li>
					<li><a href="javascript:;">常见问题</a></li>
					
					
				</ul>
				<ul>
					<li><a class="tit" href="javascript:;">网站条款</a></li>
					<li><a href="javascript:;">服务条款</a></li>
					<li><a href="javascript:;">免责声明</a></li>
		
				</ul>
				<ul>
					<li><a class="tit" href="javascript:;">关注我们</a></li>
					<li class="share">
						<span class="weibo" ></span>
						<span class="weixin"></span>
					</li>
		
				</ul>
				<ul class="list5">
					<li class="phonenum" >400 820 8820</li>
					<li>周一至周日</a></li>
					<li>9:00~20:00</li>
					<li class="zixun"></li>
				</ul>
			</div>
			<div class="con2">Copyright © 2013-2014 www.6waner.cn All Right Reserved. 京ICP备11</div>
		</div>
	</div>
<script type="text/javascript">
var conh3s=document.getElementsByTagName('h3');
var popupx=document.getElementsByClassName('popup');
var conlis=document.getElementsByTagName('li');
/*********************定义显示弹窗函数***********************/
function popup(xpp){	
	popupx[xpp].style.display='block';
	conh3s[xpp].style.display='none';
}
/*****************************退出弹窗************************/
function quitpop(xpp){
	popupx[xpp].style.display='none';
	conh3s[xpp].style.display='block';
};

for (var i = 0; i < conlis.length; i++) {
	conlis[i].index=i;
	conlis[i].onmouseenter=function(){
		popup(this.index);
	};
	conlis[i].onmouseleave=function(){
		quitpop(this.index);
	}
}
</script>	
</body>
</html>