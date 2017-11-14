<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'addStudent.jsp' starting page</title>
    
   <script type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
  </head>
  
  <body>
 	 <form action="addStudent.action" method="post">
 	 	<table border="1" align="center" width="500">
  			<tr>
  				<td>姓名:</td>
  				<td>
  					<input type="text" name="student.studentName"/>
  				</td>
  			</tr>
  			<tr>
  				<td>性别:</td>
  				<td>
  					<input type="radio" name="student.sex" value="男" checked="checked"/>男
  					<input type="radio" name="student.sex" value="女"/>女
  				</td>
  			</tr>
  			<tr>
  				<td>班级:</td>
  				<td>
  					<select name="cid">
  						<c:forEach items="${classesList}" var="classes">
  							<option value="${classes.cid}">${classes.cname}</option>
  						</c:forEach>
  					</select>
  				</td>
  			</tr>
  			<tr>
  				<td>出生日期:</td>
  				<td>
  					<input type="text" name="student.bornDate" class="Wdate" onclick="WdatePicker();"/>
  				</td>
  			</tr>
  			<tr>
  				<td colspan="2" align="center">
  					<input type="submit" value="添加"/>
  					<input type="button" value="返回"/>
  				</td>
  			</tr>
  		</table>
 	 </form>
  </body>
</html>
