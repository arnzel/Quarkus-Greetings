# Quarkus Greetings application

A simple Java web applicaton developed using Quarkus framework to display a random quote of the day

## Getting started

Below steps will mention the prerequisites and the steps to be performed to get started

If you dont want the trouble of installing software, compiling the packages\
and running the application then just download the docker hub using
```bash
docker pull rakgenius/quarkus-greetings
```

and run the image image using

```bash
ocker run -i -d --rm -p 8080:8080 rakgenius/quarkus-greetings
```

Then navigate to
```
http://localhost:8080/greetings
```

### Prerequisites

Below are the softwares that needs to be installed as a dependency

```
GraalVM
Maven
Docker (to build Docker image)
```

GraalVm can be installed and configured by following the steps\
mentioned [here](https://github.com/rakgenius/dev_setup/blob/master/Install-GraalVm-Ubuntu.md)

Once the prerequisite softwares are installed you can continue further


## Running the application

1 . Git clone the repo to any machine

2 . Build the packages using the command
```bash
./mvnw package -DskipTests
```

3 . To build the native packages, run
```bash
./mvnw package -DksipTests -Pnative
```

4 . Run the application using
```bash
java -jar target/greetings-1.0.jar
```

5 . Run the native application using
```bash
./target/greetings-1.0-runner
```

6 . Navigate to 
```
http://localhost:8080/greetings
```

## Building the docker images

Below are the command to build the docker image and to publish it to docker hub


1 . After creatin the native package, run the below command
```bash
./mvnw package -Pnative -Dnative-image.docker-build=true
```

2 . Create the docker image using
```bash
docker build -f src/main/docker/Dockerfile.native -t quarkus/greetings .
```

3 . Run the docker image using
```bash
docker run -i -d --rm -p 8080:8080 quarkus/greetings
```

4 . Create your own image which has to be pushed to the docker hub
```bash
docker image ls
```

Get the "IMAGE ID" of "quarkus/greetings" image

Set the tag to your image

```bash
docker tag <IMAGE TAG OBTAINED ABOVE> <your dockerhub username>/quarkus-greetings:latest
```

5 . Now push the docker image to docker hub
```bash
docker push <your docker hub username>/quarkus-greetings
```

6 . Now you can pull the image on any machine anywhere using
```bash
docker pull <your dockerhub username>/quarkus-greetings
```

And run it using the command mentioned in step 3.

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Authors
Rakesh Venkatesh