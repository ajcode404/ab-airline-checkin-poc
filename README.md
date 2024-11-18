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
docker run --name test-mysql -e MYSQL_ROOT_PASSWORD=password -p 3306:3306 -d mysql/mysql-server 
```

- Execute container 

```shell
docker exec -it test-mysql bash
```

- Create new user mysql (connecting with root is not allowed on docker)

```mysql
CREATE USER 'akash'@'%' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON *.* TO 'akash'@'%';
FLUSH PRIVILEGES;
```


