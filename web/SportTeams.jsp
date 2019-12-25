<%@ page import="java.util.*"%>
<%@ page import="com.jsp.model.Team"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>

<script src="https://kit.fontawesome.com/d2591e384b.js"
	crossorigin="anonymous">
	
</script>

<style>
.header {
	border-bottom: 1px solid rgba(220, 225, 230, 0.651);
	color: rgba(109, 138, 190, 0.726);
	position: relative;
	height: 50px;
}

.back-link {
	display: inline-block;
	width: 50px;
	position: absolute;
	top: 50%;
	transform: translate(0, -50%);
	font-size: 20px;
}

.back-link a {
	color: rgba(109, 138, 190, 0.726);
	text-decoration: none;
}

.back-link a:hover {
	color: rgba(109, 137, 190, 0.849);
	font-size: 30px;
	font-weight: bolder;
	text-decoration: none;
}

h1 {
	padding-bottom: 5px;
	text-transform: capitalize;
	display: inline-block;
	width: 50%;
	margin: auto;
	position: absolute;
	left: 50%;
	top: 50%;
	transform: translate(-50%, -50%);
	text-align: center;
}

ul {
	display: flex;
	flex-flow: row;
	flex-wrap: wrap;
	height: 80vh;
	justify-content: center;
	align-items: center;
	list-style: none;
}

li {
	width: 300px;
	height: 100px; 
	border-radius: 5px; 
	margin: 20px; 
	box-shadow: 0 2px 4px 0 rgba(0, 0, 0, 0.2); 
    position: relative;
}

li:hover {
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.384);
	color: rgb(122, 130, 243);
	font-weight: bolder;
	font-size: 1.4rem;
	letter-spacing: 1px;
}


li img {
    height: auto; 
    width: auto; 
    max-width: 50px; 
    max-height: 50px;
    position: absolute;
    margin: 10px;
    top: 50%;
    left: 0;
    transform: translate(0, -50%);
}

li span {
    display: inline-block;
    width: 230px;
    position: absolute;
    right: 0;
    top: 50%;
    transform: translate(0, -50%);
    color: rgba(133, 139, 231, 0.726);
	font-size: 1.2rem;
	font-weight: bold;
	font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS',
		sans-serif;
	letter-spacing: .5px;
    white-space: nowrap;
    line-height: 100px;
    text-align: center;
}
</style>
</head>
<body>
	<%
	    List<Team> teams = (List<Team>) request.getAttribute("teams");
	%>

	<div class="header">
		<div class="back-link">
			<a href="SportsTeams.html" title="back"> <i
				class="fa fa-arrow-left"></i>
			</a>
		</div>
		<%
			String sport = teams.get(0) == null ? "" : teams.get(0).getSport();
			out.println("<h1>Available " + sport  + " Teams</h1>");
		%>
	</div>
	<div class="body">
		<ul>
			<%
			    Iterator<Team> teamIterator = teams.iterator();

			    if (teams == null || teams.size() == 0)
			    {
			        out.println("<li>No Available teams for the selected sports</li>");
			    }

			    while (teamIterator.hasNext())
			    {
			        Team team = teamIterator.next();
			        out.println("<li>");
			        out.println("<img src=\"" + team.getBadge() + "\">");
			        out.println("<span>" + team.getName() + "</span>"); 
			        out.println("</li>");
			    }
			%>
		</ul>
	</div>
</body>
</html>