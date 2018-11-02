[![Build Status](https://travis-ci.org/claudioaltamura/springboot-logging-helloworld.svg?branch=master)](https://travis-ci.org/claudioaltamura/springboot-logging-helloworld)

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

# springboot-logging-helloworld
spring boot example with request logging


## Building the example

	./gradlew clean build

or without tests

	./gradle clean bootJar

## Running the example

Run

	java -jar build/libs/springboot-logging-helloworld-0.1.0.jar

Check the log

	curl http://localhost:8080/helloworld
