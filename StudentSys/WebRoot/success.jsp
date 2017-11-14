<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fm"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'Success.jsp' starting page</title>
    <script type="text/javascript">
    	function showAddPage(){
    		window.location.href='showClasses';
    	}
    	function del(stuno){
    		if(confirm("确定要删除吗?")){
    			//alert(stuno);
    			window.location.href='deleteStudent?student.studentNo='+stuno;
    		}
    	}
    </script>
  </head>
  <body>
    	<h1>登录成功,欢迎你${loginUser.name}!</h1>
    	<a href="logOut">注销</a>
    	<a href="index.jsp">显示用户信息</a><br/>
    	<table border="1">
    		<tr bgcolor="yellow">
    			<td>学号</td>
    			<td>姓名</td>
    			<td>性别</td>
    			<td>年级</td>
    			<td>出生日期</td>
    			<td>操作</td>
    		</tr>
    		<c:forEach items="${studentList}" var="student" varStatus="statu">
	    		<tr <c:if test="${statu.index%2!=0}">bgcolor="yellow"</c:if>>
	    			<td>${student.studentNo}</td>
	    			<td>${student.studentName}</td>
	    			<td>${student.sex}</td>
	    			<td>${student.classes.cname}</td>
	    			<td>
						<fm:formatDate value="${student.bornDate}" pattern="yyyy-MM-dd"/>
	    			</td>
	    			<td>
	    				<a href="#">查看</a>
	    				<a href="showClass?student.studentNo=${student.studentNo}">修改</a>
	    				<a href="javascript:del(${student.studentNo})">删除</a>
	    			</td>
	    		</tr> 
    		</c:forEach> 
    			<tr>
	    			<td colspan="6" align="center">
	    				<input type="button" value="添加" onclick="showAddPage()"/>
	    			</td>
	    		</tr>
    	</table>
  </body>
</html>
