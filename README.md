# angular4 spring-boot 
Example of working project with Angular 4 on front-end and Spring Boot on back-end

How to run:
--
You will need installed Java 8 and Maven for back-end, NodeJs and npm for front-end.
 
Back-end:
--
Go to root folder and run 

`mvn spring-boot:run`

This command will up a spring-boot application on port 8080 with:
 
- main controller `http://localhost:8080/api/products`
- swagger `http://localhost:8080/swagger-ui.html`


Front-end:
--
Initially one time go to client folder and run 

`npm install`

After run:

`npm run start`

This command will up an nodejs dev server with autoreload on 4200 port and will proxy angular-http requests to 8080 port for /api calls
   

Production:
--
Run 

`npm run build`

This will build angular code with -prod directive and put it in /src/main/resources/static folder, after run
 
`mvn spring-boot:run`

and whole app will be available on `http://localhost:8080/`




Repository was made under affect of [Yakov Fain`s presentation on DevoxxUS2017](https://www.youtube.com/watch?v=k8r76d8QzXs "link")