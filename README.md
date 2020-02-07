# JAVA 
This example shows how to use a servlet context listener to initialize a dog object before the request is processed.
- The listener listens for when a context is created or destroyed.
- The `contextInitialized(ServletContextEvent event)` can be overriden to handle resource initialization before a request is processed
- The `contextDestroyed(ServletContextEvent event)` can be overriden to clean up resources before the servlet is destroyed.

##### what we will learn
- how to register a listener in the web dd
- how to use a servlet context listener to initialize server resources.