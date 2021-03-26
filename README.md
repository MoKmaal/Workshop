# Workshop

# Note
Assume that DB images launched befoe launch the application image
there was no orchastration provided

# How to use 



# Database
1. Download database source image from 
```
https://github.com/ghusta/docker-postgres-world-db
```
2. You can launch this docker image like this :
```
Sudo docker run --network="host" -d ghusta/postgres-world-db:2.5
```
# Application 

1. Clone this repo
2. build the application using
```
mvn clean install
```
3. create docker image using Dockerfile
```
sudo docker build -t spring/workshop .
```
4. launch this docker image with the same database network using
```
sudo docker run ---network="host" spring/workshop
```
#API
using postman or any web browser apply
```
localhost:9090/{company_code}
```
#Example
```
http://localhost:9090/BHR
```
will return
```
{
"name":"Bahrain",
"continent":"Asia",
"population":617000,
"lifeExpectancy":73.0,
"countryLanguage":"Arabic"
}
```

#Error handling
1. in case of you pass invalid code like this
```
http://localhost:9090/ERR_CDE
```
will return
```
{
"httpStatus":"INTERNAL_SERVER_ERROR",
"localizedMessage":"INVALID_COUNTRY_CODE"
}
```
2. In case of DB failure after running even if you pass a correct country code
```
http://localhost:9090/BHR
```
will return
```
{
"httpStatus":"INTERNAL_SERVER_ERROR",
"localizedMessage":"INTERNAL_ERROR"
}
```
