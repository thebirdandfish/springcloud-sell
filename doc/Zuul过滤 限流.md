api-gateway -> filter package

权限校验可以统一放在zuul
假设要所有请求附带参数token

比如限制短信请求接口，在请求被转发之前，最靠前的位置做限流，在所有前置方法之前。

AuthFilter for auth based on role
for sure will need config client and eureka dependencies and mysql
still change properties to bootstrap file name
for the user project, it provides queries for others, so break it down into three modules, server, common and client.
extract all dependencies& build to server-> pom

AuthFilter is assigned with url and methods, each of them contains a rule for verifying auth for the corresponding url.

-- if the authentication failed, redirect the request to login url, whereby user token is written into redis. 
Next time it will pass authentication by verifying it locally in redis.
when logging token into redis, the role of user and the client current user is registered with, must be logged as well.

zuul cors
add CorsConfig to Zuul project


