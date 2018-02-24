#!/bin/bash

SCRIPT_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"

# Build the project
mvn clean install

# Start the editor and store the ID of its Docker container
CONTAINER_ID=$(docker run -d -v ${SCRIPT_DIR}:/home/ksch-workflows -p 5000:8080 cc-editor | tr -d '\n')

# Wait for Tomcat startup
sleep 15

# Import the 'ksch-workflows' project into the CaptainCasa editor
docker cp ${SCRIPT_DIR}/ksch-workflows.xml ${CONTAINER_ID}:/usr/local/tomcat/webapps/editor/config/projects/ksch-workflows.xml

# Open and follow editor logs
docker logs -f ${CONTAINER_ID}
