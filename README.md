# Start mysql docker container

- Check if you have mysql docker image

```shell
docker images
```

- Download mysql docker image

```shell
docker pull mysql:latest
```

- Start a mysql server

```shell
docker run --name test-mysql -e MYSQL_ROOT_PASSWORD=strong_password -p 3306:3306 -d mysql/mysql-server 
```

- Execute container 

```shell
docker exec -it test-mysql bash
```

