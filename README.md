# System prerequisites 

**JDK 11** LTS. Link: https://www.oracle.com/java/technologies/downloads/#java11 <br />
**Apache Maven**. Get latest version from https://maven.apache.org/download.cgi

# Install (DEV)
1. mvn clean compile package -Dmaven.wagon.http.ssl.insecure=true -Dmaven.test.skip=true
2. java -jar target/{newJarFileName}.jar
3. open localhost:{port}

## Important links

https://www.jenkins.io/doc/book/pipeline/getting-started/#defining-a-pipeline-in-scm
