# JAVA 
The example demonstrates url rewriting, this is used when the client site turns cookies off
- Url rewriting is done automatically by the container when `encodeURL` is used.
- When a session is created, the container will rewrite the url if the cliet's cookie is turned off else it will set the jsession  id inside the cookie.
- When cookies are turned off the JSESSIONID is appended to the end of the url as a parameter when the url is rewritten. 
- if cookeies are not turned off the session id is set inside the cookie.

##### What we will learn
- How to rewrite url using ` resp.encodeURL("result.sh")`