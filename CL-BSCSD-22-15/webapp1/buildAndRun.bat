@echo off
call mvn clean package
call docker build -t com.mycompany/webapp1 .
call docker rm -f webapp1
call docker run -d -p 9080:9080 -p 9443:9443 --name webapp1 com.mycompany/webapp1