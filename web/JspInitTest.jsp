<html>

<%! 
	String initParamValue;

    public void jspInit()
    {
		ServletConfig config = getServletConfig();
		
		initParamValue = config.getInitParameter("initialName"); 
		getServletContext().setAttribute("initialName", "setting context attribute");
    }
%>

<body>

	<p>
		This value was set in the DD as a servlet init param <b style="color: red;"><%= initParamValue %></b>
	</p>
	
	<p>
		This value was set by overriding the init method: <b style="color: red;"><%= application.getAttribute("initialName") %></b>
	</p>

</body>

</html>