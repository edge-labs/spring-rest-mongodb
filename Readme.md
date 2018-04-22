### Prerequisites

Install mongo

Create user/password on database

On mongodb shell ->
    use databa
    db.createUser(
      {
        user: "admin",
        pwd: "admin",
        roles: [ { role: "userAdminAnyDatabase", db: "admin" }, 
                 { role: "dbAdminAnyDatabase", db: "admin" }, 
                 { role: "readWriteAnyDatabase", db: "admin" } ]
      }
    )
   
Update application.properties with correct values.

Additional notes

install robo 3T to display records.
