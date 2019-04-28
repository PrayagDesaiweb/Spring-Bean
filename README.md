# Spring-Bean

Spring bean scopes and life cycle
What is a bean scope?
It refers to the following
1.how long does the bean live
2. How many instance re created
3. How is the bean shared

Default scope of the bean is singleton
Which means the spring container creates only one instance of the bean by default
All request to the bean will return a shared reference 	to the same bean
This is used for stateless beans where you don’t need to maintain any state
Specify bean scope by scope=”singleton” attribute
Other bean scopes are prototype, request, session and global-session

In the prototype scope, a new object is created for each request of the bean	
