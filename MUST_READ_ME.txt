Firstly 

1- to test this Application you must have or download oracle database Express to make User and Table on a database

2- to download Oracle Express from :  https://www.oracle.com/database/technologies/xe-downloads.html

3- Create User (Schema) on DataBase after download (SIM) password (SIM)

4- Run the Database file on the schema to execute Table , Constriants and Data (SIMCARD-SCHEMA.sql).

5- open the Application on Intlij or on Eclipse as Spring boot application.

6- Run the spring boot configuration on (Application)

7- Run   http://localhost:8081/explorer/index.html#uri=/ 

8- open it and Put the End points links in (Edit Headers) then click GO

9- this Link opens to test each endpoint to test each one and not to write the whole URL

 # to Test  get All the Sim Cards --->   /allSimCard

 # to Test get Device Status that (Waiting for Activation) --->   /allSimCardAW/WAITING_FOR_ACTIVATION

 # To Test  get Simcard by Id --->       /SimCardById/7           (Example :  id = 7).

 # To Test Update Device Status --->    /updateSimCard/2/BLOCKED   (Example : id = 2 , New Status = BLOCKED).

 # To Test Update Device Status to Null --->  /updateSimCToNull/2    (Example : id = 2).

 # To Test Delete Device Status --->   /deleteSimCard/3/DEACTIVATED    (Example : id = 3 , New Status = DEACTIVATED).

 # To Test Sort and order Simcard by ID Ascending Order --->     /sortAscById   .
