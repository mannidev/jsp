<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
  box-sizing: border-box;
}

body div {
	width: 500px;
	margin: auto;
}

h1 {
	text-align: center;
}

ul {
  list-style-type: none;
  padding: 0;
  margin: 0;
}

ul li {
  border: 1px solid #ddd;
  margin-top: -1px; /* Prevent double borders */
  background-color: #f6f6f6;
  padding: 12px;
}
</style>
</head>
<body>

<div>

<h1>Hello <%= request.getParameter("name") %></h1>

<h2>Favorite Names Selected</h2> 


<ul>
  <%
  	String[] names = request.getParameterValues("names");
  	
  	for (int i = 0; i < names.length; i++) {
  	  out.print("<li>");
  	  out.print(names[i]);
  	  out.print("</li>");
  	}
  %>
</ul>

</div>

</body>
</html>
