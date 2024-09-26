#!/bin/sh
mvn clean package && docker build -t com.mycompany/webapp1 .
docker rm -f webapp1 || true && docker run -d -p 9080:9080 -p 9443:9443 --name webapp1 com.mycompany/webapp1