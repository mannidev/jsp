# JAVA 
This example demonstrates how to get servlet config's init parameter.
- The init parameters are read when the container makes a servlet.
- The init parameter are read and placed in the new servlet config object.
- The servlet config object is only accessible to the servlet.
- To read the values from a jsp they will have to be forwarded to the jsp by the dispatcher.
- To retrieve values application wide you would have use the servlet context.

##### What we learn
- Retrieving the servlet's init param using `getServletConfig().getInitParameter(...)`