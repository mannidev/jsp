# JAVA 
This example demonstrates how to create and destroy jsp sessions 

##### What we will learn
- How to create and get a session using `req.getSession()`
- How to get a session without automatically creating a new one if it does not exist using `req.getSession(false)`
- How to get the last time the session was accessed using `session.getLastAccessedTime()`
- How to destroy a session after a set time of inactivity using `session.setMaxInactiveInterval(60)` in secs
- How to manually destroy a session using `session.invalidate()`
- How to set session time out using the DD in minutes