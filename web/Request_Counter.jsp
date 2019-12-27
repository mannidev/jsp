<%@ page import="java.text.DateFormat, java.text.SimpleDateFormat, java.util.Date" %>
<html>
<body>
	
	<%!
		private int count; 
	%>
	 
	<p>
		Number of requests:
		<%= getCount() %>
	</p>
		
	<p>
		Last request at: 
		<%= getTime() %>
	</p>
	
	<%!
		int getCount() {
	        count++;
	        return count;
	    }
	
		 String getTime() {
	        Date date =  new Date();
	        DateFormat format = new SimpleDateFormat("dd-mm-yyyy hh:mm:s");
	        return format.format(date);
	    }
	%>
</body>
</html>