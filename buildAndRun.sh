#!/bin/sh
mvn clean package && docker build -t com.example/config-example .
docker rm -f config-example || true && docker run -d -p 8080:8080 -p 4848:4848 --name config-example com.example/config-example 
