db.createUser(
    {
        user: "bookreviewuser",
        pwd: "bookreviewpass",
        roles: [
            {
                role: "readWrite",
                db: "bookreviewdb"
            }
        ]
    }
)