# Claims API (Java + Spring Boot + MariaDB)

This is a small REST API that simulates a simplified healthcare claims system.

It exposes endpoints to:
- Create and list **providers**
- Submit and list **claims**
- Filter claims by provider

I built this project to practice and demonstrate:
- **Java** (Spring Boot, layered architecture: controller → service → repository → entity)
- **SQL** with **MariaDB** (tables for `providers` and `claims`)
- **REST APIs** (JSON-based endpoints tested with Postman)
- Preparation for deployment to **AWS** (RDS + EC2)
