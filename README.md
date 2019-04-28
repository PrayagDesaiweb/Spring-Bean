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

Spring Bean lifecycle
1. Container is started
2. Bean is instantiate
3. Dependencies are injected
4. Internal spring processing
5. Your custom init method
6. Bean is ready to use and the container is shutdown 
7. Your custom destroy method

You can add custom code during bean initialisation and bean deletion
1. Calling custom business logic 
2. Setting up handles to resources (db, sockets etc). clean up handles and db at the time of bean destruction
3. Use <init-method = “method name”> attribute in the config to setup bean during initialization
For developing process follow the steps
1. Define your methods for init and destroy
2. Configure the methods names in the spring config file,
