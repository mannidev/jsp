# JAVA 
A simple app that prints hello Servlet from a servlet using the response objects `resp.getWriter()`

We also set the content type of the response using `resp.setContentType("text/html;charset=UTF-8");`

This must be called before the response is committed of `resp.getWriter()` is called. 

Doing this tells the client what content to expect and helps the client handle the content.