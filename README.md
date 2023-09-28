
## Installing java

install JRE

>`sudo apt install default-jre`
>`sudo apt install default-jdk`
>`sudo apt install openjdk-17-jdk openjdk-17-jre`
>`scp Downloads/jdk-11.0.13_linux-x64_bin.tar.gz sammy@your_server_ip:~`

## Installing Spring Boot CLI

sdk install spring
spring version

## Initialize empty maven project

mvn archetype:generate -DgroupId=com.example -DartifactId=my-empty-java-project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false


## Building sprint boot application

>`mvn clean install`