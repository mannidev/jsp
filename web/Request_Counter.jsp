<%@ page import="com.jsp.model.*" %>

<html>
<body>
	<p>
		Number of requests:
		<% out.println(Counter.getCount()); %>
	</p>
		
	<p>
		Last request at: 
		<% out.println(Counter.getTime()); %>
	</p>
	 
</body>
</html>