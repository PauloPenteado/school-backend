# System prerequisites 

**JDK 11** LTS. Link: https://www.oracle.com/java/technologies/downloads/#java11 <br />
**Apache Maven**. Get latest version from https://maven.apache.org/download.cgi

# Install (DEV)
1. mvn clean compile package -Dmaven.wagon.http.ssl.insecure=true -Dmaven.test.skip=true
2. java -jar target/{newJarFileName}.jar
3. open localhost:{port}

# Deploy with OpenShift - Instructions
1. Left Menu > select Developer
2. Left menu > Add
3. From Git
4. Fill the Git Repo URL 
5. click on Show Advanced Options
  6. on Context dir, write sp3-factory
  7. Create a new secret with the required credentials   
8. Builder > select Java > get the latest openjdk-11
9. General > Choose an application name
10. Advanced Options > check Create a Route to the Application 
11. Click on Create button 

# Debug on OpenShift - Control the terminal when the pod is crashing 
1. Open your DeploymentConfig
2. YAML tab 
3. search for **template > spec > containers**  
4. add **stdin: true** after imagePullPolicy
5. add a tag **command** between image and ports. Under this tag, add **- /bin/sh**. Attention: since it's a yml file, indentation matters.
6. Save the changes to be able to access the terminal of your pods under this DeploymentConfig. <br />

PS: it's very important to **undo the changes** once you're done with the terminal. Otherwise, your pods will end up unavailable.

# In case of SSL/TLS related issues :


1. Locate the keystore location in the JDK. Usually, the path would go something like this: **$JAVA_HOME\lib\security\cacerts**. 
The keytool that is used to access the keystore is typically installed with the JRE/JDK and ready to use.

2. From the keystore location, run the command that follows: 

```
keytool -import -trustcacerts -alias {nameOfTheAlias} -file C:\temp\yourCertificate.cer -keystore cacerts
```

3. When prompted Enter keystore password:, enter "changeit". By default keystores have a password of "changeit"
4. When prompted Trust this certificate? [no]:, enter "yes". This imports the certificate into the keystore and display the message: "Certificate was added to keystore".

**Keytool** documentation: https://docs.oracle.com/en/java/javase/11/tools/keytool.html

> The keytool command is a key and certificate management utility. It enables users to administer their own public/private key pairs and associated certificates for use in self-authentication (where a user authenticates themselves to other users and services) or data integrity and authentication services, by using digital signatures. The keytool command also enables users to cache the public keys (in the form of certificates) of their communicating peers.



## Important links

https://www.jenkins.io/doc/book/pipeline/getting-started/#defining-a-pipeline-in-scm
