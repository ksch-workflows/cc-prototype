#!/bin/bash

mvn clean install || exit 1
docker build -t ksch-workflows .

docker run --rm  -p 7000:8080 ksch-workflows
