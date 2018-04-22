### Prerequisites

    Install mongo

    Create user/password on database

##### On mongodb shell ->
    use database
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

### Additional notes

    Install robo 3T to display records.


### Bad Introduction to DependecyInjection (by kiquetal)

    Well, the IoC managed by Spring, will lookup for annotations like
    @Component
    @Service
    @Repository
    @Configuration

 You `expose` this object , to be automatically injected using `Autowired`,
  what do you expose?
 You expose `implementations` but reference by Autowired interfaces.



