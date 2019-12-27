# Using JSP
* The container converts a jsp page into a java servlet.
* The .jsp file is translated to a .java file
* The .java file is then compiled into a .class file
* The .class file is loaded and initialized as a servlet object


##### Scriptlet <% %> #####
used for writing plain old java within jsp

##### Expressions <%= %> #####
becomes the argument in out.print() method.

##### Directives <%@ %> #####
used to give special instructions to the container

##### Declaration <%! %> #####
used for declaring members of the generated servlet class
ie. both variables and methods.
anything between the declaration tags are added to the servlet class outside the service method.

### Lifecyle of a jsp ###
1. web container reads the DD
2. all servlets are loaded but nothing is done with jsp files until they are rquested.
3. upon request, the container translates the jsp into .java source code
4. the generated .java file is compiled into a servlet .class file
5. the container loads the generated servlet class
6. the container instantiates the servlet and runs the servlet's jspInit() method
7. the container creates a new thread upon each subsequent client request to run the _jspService() method.

NB: Translation and compilation occurs only once.
 
 