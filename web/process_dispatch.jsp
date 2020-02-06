<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}
 
.modal {
  display: block;  
  position: fixed; 
  z-index: 1;  
  padding-top: 100px; 
  left: 0;
  top: 0;
  width: 100%;  
  height: 100%;  
  overflow: auto;  
  background-color: rgb(0,0,0);  
  background-color: rgba(0,0,0,0.4); 
}

/* Modal Content */
.modal-content {
  background-color: #fefefe;
  margin: auto;
  padding: 20px;
  border: 1px solid #888;
  width: 80%;  
  text-align: center;
}

h2 {
  text-align: center;
}

</style>
</head>
<body>


  
<div id="myModal" class="modal"> 
  <div class="modal-content">
  	<h2>Forwarded By Dispatcher</h2>
    <p>
    <%=
    	request.getAttribute("msg")
    %>
    </p>
  </div>

</div>


</body>
</html>
