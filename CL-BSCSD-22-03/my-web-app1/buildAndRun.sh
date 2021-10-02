#!/bin/sh
mvn clean package && docker build -t org.icbt/my-web-app1 .
docker rm -f my-web-app1 || true && docker run -d -p 9080:9080 -p 9443:9443 --name my-web-app1 org.icbt/my-web-app1