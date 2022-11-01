# GeoLocationAPI
The GeoLocation Rest API receives 3 or more addresses and return the distance between them (More to be added in the future as the project grows.)

## Run the project
To run the project, you need to have Java 17 installed on your machine. You can download it from [here](https://www.oracle.com/java/technologies/downloads/).

Before opening the project in you usual IDE, you have to run "mvn clean install" to download all the dependencies.
after that, you can open the project in your IDE and run it.

### Calling the API
The API is running on port 8080, so you can call it using the following URL: http://localhost:8080/api/v1/locate?
This API receives 3 or more addresses as query parameters, and returns the distance between them.
REQUIRED PARAMS: 
 * address = address  ( The minimum number of addresses is 3)
   This address is an array, and you can send more by simply adding "&address=YourAddress" over and over to the URL.
 * API_KEY = Your API Key (You can get one from [here](https://developers.google.com/maps/documentation/geocoding/get-api-key))