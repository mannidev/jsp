<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Name App</title>
    
    <style type="text/css">
      body {
		font-family: Arial, Helvetica, sans-serif;
	  }
	  
	  .flip-card {
	  	background-color: transparent;
	  	width: 300px;
	    height: 300px;
	    perspective: 1000px;
	  }
	  
	  .flip-card-inner {
	  	position: relative;
	  	width: 100%;
	  	height: 100%;
	  	text-align: center;
	  	transform-style: preserve-3d;
	  	box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
	  }
	  
	  .flip-card:hover .flip-card-inner {
	    transform: rotateY(180deg);
	  }
	  
	  .flip-card-front, .flip-card-back {
	  	position: absolute;
	  	width: 100%;
	  	height: 100%;
	  	-webkit-backface-visibility: hidden;
  		backface-visibility: hidden;
	  }
	  
	  .flip-card-front {
	  	background-color: #bbb;
	  	color: black;
	  }
	  
	  .flip-card-back {
	    background-color: #2980b9;
  		color: white;
  		transform: rotateY(180deg);
	  }
    </style>
    
  </head>
  
  <body>
    <h1>You Name is...</h1>
    <h5>Hover over the image below to see name</h5>
    
    <div class="flip-card">
      <div class="flip-card-inner">
        
        <div class="flip-card-front">
        	<img alt="avatar" src="https://www.w3schools.com/howto/img_avatar.png">
        </div>
        
        <div class="flip-card-back">
        	<h1>
        		<%
        			String name = request.getAttribute("firstname") + " " + request.getAttribute("lastname");
        			out.println(name);
        		%>
        	</h1>
        	
        	<p>What an awesome guy</p>
        </div>
        
      </div>
    </div>
  </body>

</html>