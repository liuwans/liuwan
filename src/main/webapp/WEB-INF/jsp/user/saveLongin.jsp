<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
<link rel="stylesheet" href="css/login.css">
</head>
<body>
	<div>
		<div id="top"></div>
		<div id="content">
			<div class="con_top">
				<span class="con_left"></span>
				<p class="con_people">用户信息</p>
			</div>
			<form id="con_menu" action="saveLongin" method="post">
				<p class="menu_p">用&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;户&nbsp;&nbsp;&nbsp;&nbsp;
					<input placeholder="请输入用户名" type="text" class="menu_content dd" name="uname" value="${user.uname }">
					<font color="red">${mapError.unameError }</font>
				</p>
				<p class="menu_p">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码&nbsp;&nbsp;&nbsp;&nbsp;
					<input placeholder="请输入密码" type="password" class="menu_content" name="password" value="">
					<font color="red">${mapError.passwordError }</font>
				</p>
				<p class="menu_p">确认密码&nbsp;&nbsp;&nbsp;&nbsp;
					<input placeholder="请确认密码" type="password" class="menu_content" name="Twopassword" value="">
					<font color="red">${mapError.TwopasswordError }</font>
				</p>
				<p class="menu_p">联系方式&nbsp;&nbsp;&nbsp;&nbsp;
					<input placeholder="请输入手机号" pattern="^1[3|4|5|7|8][0-9]{9}$" type="text" class="menu_content" name="mphone" value="${user.mphone }">
					<font color="red">${mapError.mphoneError }</font>
				</p>
				<c:set value="86,852,853,886" var="countrycodes"/>
				<p class="menu_p">选择地区&nbsp;&nbsp;&nbsp;&nbsp;
					<select class="menu_content ss" name="countrycode">
						<option value="0">请选择地区</option>
						<c:forEach items="${countrycodes }" var="country">
							<option value="${country }" 
								<c:if test="${param.countrycode eq country }">
									selected
								</c:if>
							><c:if test="${country == 86 }">
								中国大陆
							</c:if>
							<c:if test="${country == 852 }">
								中国香港
							</c:if>
							<c:if test="${country == 853 }">
								中国澳门
							</c:if>
							<c:if test="${country == 886 }">
								中国台湾
							</c:if>
							</option>
						</c:forEach>
					</select>
					<font color="red">${mapError.countrycodeError }</font>
				</p>
				<p class="menu_p">出生日期&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="date" class="menu_content" name="birthdays" value="${birthdays }">
					<font color="red">${mapError.birthdayError }</font>
				</p>
				<p class="menu_p">真实姓名&nbsp;&nbsp;&nbsp;&nbsp;
					<input placeholder="请输入真实姓名" type="text" class="menu_content" name="realname" value="${user.realname }">
					<font color="red">${mapError.realnameError }</font>
				</p>
				<c:set value="1,2" var="tids"/>
				<p class="menu_p">用户类型&nbsp;&nbsp;&nbsp;&nbsp;
					<select class="menu_content ss" name="tid">
						<option value="0">请选择用户类型</option>
						<c:forEach items="${tids }" var="t">
							<option value="${t }"
								<c:if test="${param.tid eq t }">
									selected
								</c:if>
							>
								<c:if test="${t == 1 }">
									成人
								</c:if>
								<c:if test="${t == 2 }">
									儿童
								</c:if>
							</option>
						</c:forEach>
					</select>
					<font color="red">${mapError.tidError }</font>
				</p>
				<p class="menu_p">证件类型&nbsp;&nbsp;&nbsp;&nbsp;
					<select class="menu_content ss" name="papersid">
						<option value="0">请选择证件类型</option>
						<c:forEach items="${tids }" var="p">
							<option value="${p }"
								<c:if test="${param.papersid eq p }">
									selected
								</c:if>
							>
								<c:if test="${p == 1 }">
									身份证
								</c:if>
								<c:if test="${p == 2 }">
									军官证
								</c:if>
							</option>
						</c:forEach>
					</select>
					<font color="red">${mapError.papersidError }</font>
				</p>
				<p class="menu_p">证&nbsp;&nbsp;件&nbsp;号&nbsp;&nbsp;&nbsp;&nbsp;
					<input placeholder="请输入证件号" type="text" class="menu_content" name="paperscode" value="${user.paperscode }">
					<font color="red">${mapError.paperscodeError }</font>
				</p>
				<c:set value="1,2,3" var="sexs"/>
				<p class="menu_sex">性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别&nbsp;&nbsp;&nbsp;&nbsp;
					<c:forEach items="${sexs }" var="s">
						<input class="sex_to" type="radio" name="sex" value="${s }"
							<c:if test="${param.sex eq s }">
								checked="checked"
							</c:if>
						>
						<c:if test="${s == 1 }">
							男
						</c:if>
						<c:if test="${s == 2 }">
							女
						</c:if>
						<c:if test="${s == 3 }">
							保密
						</c:if>
					</c:forEach>
					<font style="margin-left: 196px;" color="red">${mapError.sexError }</font>
				</p>
				<input class="menu_sub" type="submit" value="提交申请">
			</form>
		</div>
		<div id="footer">
			<p class="p1">提交相关信息后，请等待遛弯网审核，审核通过后您可使用注册时填写的手机号登录</p>
			<p class="p2">Copyright © 2014-2017 www.6waner.cn All Right Reserved. 京ICP备12049417号-5</p>
		</div>
	</div>
</body>
</html>