##### Servlets #####
    * Take client's request and send back a response
    * Servlets are controlled by the container (Tom Cat)

##### The Container #####
    * Creates request and response objects
    * Allocates a new thread for the servlet
    * Calls the servlets's service () method passing the request and response references as arguments.
