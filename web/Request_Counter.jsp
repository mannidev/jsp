<%@ page import="com.jsp.model.*" %>

<html>
<body>
	<p>
		Number of requests:
		<%= Counter.getCount() %>
	</p>
		
	<p>
		Last request at: 
		<%= Counter.getTime() %>
	</p>
	 
</body>
</html>