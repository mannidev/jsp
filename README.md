# JAVA 
This example demonstrates the difference between a jsp redirect and a dispatch forward.
- The container is responsible for forwarding request to the appropriate servlet or jsp to process the request
- The container is not responsible for handling redirects, when a redirect occurs the container sends the request back to the client with the information it needs to redirect the request to the appropriate server for the request to be processed.
- Redirects must be done before the response is committed.

##### What we will learn
- How to user `resp.sendRedirect(...);`
- How to use `req.getRequestDispatcher(...)`
- How to forward a dispatch with request attributes.
- How to redirect a request with params.