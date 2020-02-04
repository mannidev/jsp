<html>


<body>

	<% 
		pageContext.setAttribute("pageAttribute", "setting page attribute using page context object");
		session.setAttribute("sessionAttribute", "setting session attribute using session object");
		request.setAttribute("requestAttribute", "setting request attribute using request object");
		application.setAttribute("ApplicationAttribute", "setting application attribute using application object");
	%>
	
	<table>
		<tr>
			<td>Page Attribute Value:</td>
			<td><%= pageContext.getAttribute("pageAttribute") %></td>
		</tr>
		
		<tr>
			<td>Request Attribute Value:</td>
			<td><%= request.getAttribute("requestAttribute") %></td>
		</tr>
		
		<tr>
			<td>Session Attribute Value:</td>
			<td><%= session.getAttribute("sessionAttribute") %></td>
		</tr>
		
		<tr>
			<td>Application Attribute Value:</td>
			<td><%= application.getAttribute("ApplicationAttribute") %></td>
		</tr>
	</table>
	
	<h6>Set attributes using page context</h6>
	
	<% 
		pageContext.setAttribute("pageAttribute", "setting page attribute using page context object");
		pageContext.setAttribute("sessionAttribute", "setting session attribute using session object", pageContext.SESSION_SCOPE);
		pageContext.setAttribute("requestAttribute", "setting request attribute using request object");
		pageContext.setAttribute("ApplicationAttribute", "setting application attribute using application object");
	%>
	
	<table>
		<tr>
			<td>Page Attribute Value:</td>
			<td><%= pageContext.getAttribute("pageAttribute") %></td>
		</tr>
		
		<tr>
			<td>Request Attribute Value:</td>
			<td><%= request.getAttribute("requestAttribute") %></td>
		</tr>
		
		<tr>
			<td>Session Attribute Value:</td>
			<td><%= session.getAttribute("sessionAttribute") %></td>
		</tr>
		
		<tr>
			<td>Application Attribute Value:</td>
			<td><%= application.getAttribute("ApplicationAttribute") %></td>
		</tr>
	</table>

</body>

</html>