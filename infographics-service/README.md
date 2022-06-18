# Infographics Service
## Description
- Java 11
- Maven
- MongoDB
- Docker

# Guide to run this service
## Database MongoDB
### Using Docker by simply performing these two steps:
- `docker pull mongo:latest`
- `docker run -d -p 27017:27017 --name mongo_pd -e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=admin mongo`

### Manually connecting to MongoDB
- `docker exec -it mongo_pd bash` -> open terminal on docker container named: mongo_pd
- `mongo mongodb://admin:admin@localhost:27017`