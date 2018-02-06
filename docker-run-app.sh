#!/bin/bash

mvn clean install
docker build -t ksch-workflows .

docker run --rm  -p 7000:8080 ksch-workflows
