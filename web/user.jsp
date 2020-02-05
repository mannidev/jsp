<jsp:useBean id="person" class="com.jsp.model.Person">
	<jsp:setProperty name="person" property="*"/> 	
</jsp:useBean>


<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
.card {
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
  transition: 0.3s;
  width: 300px;
}

.card:hover {
  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
}

.container {
  padding: 2px 16px;
}
</style>
</head>
<body>

<h2>Users</h2>

<div class="card">
  <img src="https://www.w3schools.com/howto/img_avatar.png" alt="Avatar" style="width:100%">
  <div class="container">
    <h4>
    	<b>
			<jsp:getProperty property="firstname" name="person"/> 
			<jsp:getProperty property="lastname" name="person"/>
		</b>
	</h4> 
    <p><jsp:getProperty property="country" name="person" /></p> 
  </div>
</div>

</body>
</html> 