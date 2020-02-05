<html>

<body>
	Hello <%= request.getAttribute("username") %>
	
	<jsp:useBean id="person" class="com.jsp.model.Person" scope="request"></jsp:useBean>
	
	<br>
	
	Person created by servlet: <jsp:getProperty property="username" name="person"/>
</body>

</html>